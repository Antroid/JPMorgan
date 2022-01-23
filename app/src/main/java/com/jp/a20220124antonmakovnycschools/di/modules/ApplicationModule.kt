package com.jp.a20220124antonmakovnycschools.di.modules

import com.jp.a20220124antonmakovnycschools.services.NYCSchoolService
import com.jp.a20220124antonmakovnycschools.util.Consts
import dagger.Module
import dagger.Provides
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module(includes = [ViewModelModule::class])
class ApplicationModule {

    private fun getOkHttpClient(): OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        return OkHttpClient().newBuilder()
            .connectTimeout(5000, TimeUnit.MILLISECONDS)
            .readTimeout(5000, TimeUnit.MILLISECONDS)
            .addInterceptor(logging)
            .addInterceptor(SchoolHttpInterpreter())
            .build()
    }

    @Singleton
    @Provides
    internal fun provideRetrofit(): Retrofit {

        return Retrofit.Builder().baseUrl(Consts.BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(getOkHttpClient())
            .build()
    }

    @Singleton
    @Provides
    internal fun provideRetrofitService(retrofit: Retrofit): NYCSchoolService {
        return retrofit.create(NYCSchoolService::class.java)
    }

    private class SchoolHttpInterpreter : Interceptor{
        override fun intercept(chain: Interceptor.Chain): Response {
            val original: Request = chain.request()
            val originalHttpUrl: HttpUrl = original.url()

            val tokenParameterKey = "\"$$\"app_token"
            val url = originalHttpUrl.newBuilder()
                .addQueryParameter("$$"+"app_token", Consts.API_TOKEN)
                .build()

            // Request customization: add request headers

            // Request customization: add request headers
            val requestBuilder: Request.Builder = original.newBuilder()
                .url(url)

            val request: Request = requestBuilder.build()
            return chain.proceed(request)
        }

    }

}
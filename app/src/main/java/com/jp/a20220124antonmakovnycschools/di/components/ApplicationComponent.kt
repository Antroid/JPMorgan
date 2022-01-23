package com.jp.a20220124antonmakovnycschools.di.components

import android.app.Application
import com.jp.a20220124antonmakovnycschools.di.modules.ActivityBindingModule
import com.jp.a20220124antonmakovnycschools.di.modules.ApplicationModule
import com.jp.a20220124antonmakovnycschools.di.modules.FragmentBindingModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class,
    AndroidSupportInjectionModule::class, ActivityBindingModule::class,
    FragmentBindingModule::class])
interface ApplicationComponent : AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

    fun inject(application: Application)

}
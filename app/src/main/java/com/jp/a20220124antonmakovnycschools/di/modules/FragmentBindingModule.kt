package com.jp.a20220124antonmakovnycschools.di.modules

import com.jp.a20220124antonmakovnycschools.fragments.grades.GradesFragment
import com.jp.a20220124antonmakovnycschools.fragments.schools.SchoolsFragment
import com.jp.a20220124antonmakovnycschools.repos.RemoteNYCRepo
import com.jp.a20220124antonmakovnycschools.services.NYCSchoolService
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton

@Module
abstract class FragmentBindingModule {

    @ContributesAndroidInjector
    internal abstract fun provideSchoolsFragment(): SchoolsFragment

    @ContributesAndroidInjector
    internal abstract fun provideGradesFragment(): GradesFragment

}
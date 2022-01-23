package com.jp.a20220124antonmakovnycschools.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jp.a20220124antonmakovnycschools.di.scope.ViewModelKey
import com.jp.a20220124antonmakovnycschools.viewmodels.GradesViewModel
import com.jp.a20220124antonmakovnycschools.viewmodels.SchoolsViewModel
import com.jp.a20220124antonmakovnycschools.viewmodels.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(SchoolsViewModel::class)
    abstract fun bindSchoolsViewModel(schoolsViewModel: SchoolsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(GradesViewModel::class)
    abstract fun bindGradesViewModel(gradesViewModel: GradesViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
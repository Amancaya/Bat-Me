package org.batandme.batandme.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import org.batandme.batandme.di.main.MainFragmentBuildersModule
import org.batandme.batandme.di.main.MainModule
import org.batandme.batandme.di.main.MainScope
import org.batandme.batandme.di.main.MainViewModelModule
import org.batandme.batandme.views.scenes.main.MainActivity

@Module
abstract class ActivityBuildersModule {

    @MainScope
    @ContributesAndroidInjector(
        modules = [MainModule::class, MainFragmentBuildersModule::class, MainViewModelModule::class]
    )
    abstract fun contributeMainActivity(): MainActivity

}
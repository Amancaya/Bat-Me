package org.batandme.batandme.di.main

import dagger.Module
import dagger.android.ContributesAndroidInjector
import org.batandme.batandme.views.scenes.main.account.AccountFragment

@Module
abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector()
    abstract fun contributeAccountFragment(): AccountFragment
}
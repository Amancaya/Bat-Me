package org.batandme.batandme.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import org.batandme.batandme.utils.ViewModelProviderFactory

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelProviderFactory): ViewModelProvider.Factory
}
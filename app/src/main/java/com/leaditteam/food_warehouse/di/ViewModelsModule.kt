package com.leaditteam.food_warehouse.di

import androidx.lifecycle.ViewModelProvider
import com.leaditteam.food_warehouse.ui.factory.ViewModelFactory
import com.leaditteam.food_warehouse.ui.activity.main.MainViewModel
import com.leaditteam.food_warehouse.ui.fragment.menu.MainMenuViewModel
import org.kodein.di.Kodein
import org.kodein.di.direct
import org.kodein.di.erased.bind
import org.kodein.di.erased.provider
import org.kodein.di.erased.singleton


val viewModelModule = Kodein.Module("viewModelModule"){
    bind<ViewModelProvider.Factory>() with singleton {
        ViewModelFactory(
            kodein.direct
        )
    }
    bind<MainViewModel>()with provider { MainViewModel()}
    bind<MainMenuViewModel>()with provider { MainMenuViewModel() }
}
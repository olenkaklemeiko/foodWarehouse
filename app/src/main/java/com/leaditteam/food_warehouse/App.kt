package com.leaditteam.food_warehouse

import android.app.Application
import com.leaditteam.food_warehouse.di.databaseModule
import com.leaditteam.food_warehouse.di.networkModule
import com.leaditteam.food_warehouse.di.viewModelModule
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.androidCoreModule

class App: Application(),KodeinAware{
    override val kodein by Kodein.lazy{
        import(androidCoreModule(this@App))
        import(databaseModule)
        import(networkModule)
        import(viewModelModule)
    }
}
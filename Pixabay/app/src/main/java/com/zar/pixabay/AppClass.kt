package com.zar.pixabay

import android.app.Application
import com.zar.data.di.repositoriesModules
import com.zar.domain.di.useCaseModule
import com.zar.presenter.di.viewModelsModule
import org.koin.core.context.startKoin

class AppClass : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(repositoriesModules, useCaseModule, viewModelsModule))
        }
    }

}
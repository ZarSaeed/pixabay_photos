package com.zar.domain.di

import com.zar.domain.usecases.GetPhotosUC
import org.koin.dsl.module

val useCaseModule = module {
    single { GetPhotosUC(get()) }
}
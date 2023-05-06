package com.zar.data.di

import com.zar.data.repositories.PhotoRepositoryImpl
import com.zar.domain.repositories.PhotosRepository
import org.koin.dsl.module


val repositoriesModules = module {
    single<PhotosRepository>{ PhotoRepositoryImpl() }
}

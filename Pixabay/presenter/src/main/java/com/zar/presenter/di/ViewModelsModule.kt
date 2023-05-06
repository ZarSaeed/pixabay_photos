package com.zar.presenter.di

import com.zar.presenter.photos.PhotosGridViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel { PhotosGridViewModel(get()) }
}
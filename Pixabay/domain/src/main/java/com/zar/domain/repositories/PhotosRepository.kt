package com.zar.domain.repositories

import com.zar.domain.model.PixabayPhotosResponse
import kotlinx.coroutines.flow.Flow

interface PhotosRepository {
    fun getPhotos() : Flow<PixabayPhotosResponse>
}
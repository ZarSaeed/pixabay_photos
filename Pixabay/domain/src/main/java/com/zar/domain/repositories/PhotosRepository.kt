package com.zar.domain.repositories

import com.zar.domain.model.PixabayPhotosResponse
import kotlinx.coroutines.flow.Flow

interface PhotosRepository {
    suspend fun getPhotos() : Flow<PixabayPhotosResponse>
}
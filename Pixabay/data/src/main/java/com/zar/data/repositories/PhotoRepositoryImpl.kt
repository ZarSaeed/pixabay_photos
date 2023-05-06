package com.zar.data.repositories

import com.zar.domain.model.PixabayPhotosResponse
import com.zar.domain.repositories.PhotosRepository
import kotlinx.coroutines.flow.Flow

class PhotoRepositoryImpl : PhotosRepository {

    override fun getPhotos(): Flow<PixabayPhotosResponse> {
        TODO("Not yet implemented")
    }
}
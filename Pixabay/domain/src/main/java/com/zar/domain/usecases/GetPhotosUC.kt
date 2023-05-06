package com.zar.domain.usecases

import com.zar.domain.model.PixabayPhotosResponse
import com.zar.domain.repositories.PhotosRepository
import kotlinx.coroutines.flow.Flow

class GetPhotosUC (private val photosRepository: PhotosRepository) : UseCase<PixabayPhotosResponse,UseCase.None>() {
    override fun run(params: None): Flow<PixabayPhotosResponse> = photosRepository.getPhotos()
}
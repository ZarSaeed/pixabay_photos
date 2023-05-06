package com.zar.presenter.photos

import androidx.lifecycle.ViewModel
import com.zar.domain.usecases.GetPhotosUC

class PhotosGridViewModel(val getPhotoUC: GetPhotosUC) : ViewModel() {
    data class Photo(val imageUrl: String?,val views: String?,val likes: String?, val userName: String?)
    val list = listOf<Photo>(
        Photo("","100","102","Zar"),
        Photo("","100","102","Saif"),
        Photo("","100","102","Ameen"))
}
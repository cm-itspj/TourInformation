package jp.co.cybermissions.com.example.tourinformation.place_detail

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import jp.co.cybermissions.com.example.tourinformation.Detail

class PlaceDetailViewModelFactory (
    private val details: Detail,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PlaceDetailViewModel::class.java)) {
            return PlaceDetailViewModel(details, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
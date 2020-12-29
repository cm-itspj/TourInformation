package jp.co.cybermissions.com.example.tourinformation.place

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import jp.co.cybermissions.com.example.tourinformation.Detail

class PlaceViewModel : ViewModel() {


    private val _properties = MutableLiveData<List<Detail>>()
    val properties: LiveData<List<Detail>>
        get() = _properties

    private val _navigateToDetailProperty = MutableLiveData<Detail>()
    val navigateToDetailProperty: LiveData<Detail>
        get() = _navigateToDetailProperty


    fun displayPropertyDetails(detailsProperty: Detail) {
        _navigateToDetailProperty.value = detailsProperty
    }
    fun displayPropertyDetailsComplete() {
        _navigateToDetailProperty.value = null
    }
}
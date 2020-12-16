package jp.co.cybermissions.com.example.tourinformation.restaurant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import jp.co.cybermissions.com.example.tourinformation.R

private val ITEM_VIEW_TYPE_HEADER = 0
private val ITEM_VIEW_TYPE_ITEM = 1

class RestaurantViewModel : ViewModel() {
    data class Restaurant(
        val name: String,
        val address: String,
        val menu: String
    )

    val res: MutableList<Restaurant> = mutableListOf(
        Restaurant(name = "Amrutha Lounge",address = "326 Garratt Lane Earlsfield, London England ",menu = "Pasta"),
        Restaurant(name = "Scarlett Green",address = "4 Noel Street Soho, London England ",menu = "Spakati"),
        Restaurant(name = "Kennington Lane Cafe",address = "383 Kennington Lane Vauxhall, London England ",menu = "Salad"))

    var restaurant: Restaurant

     var restaurantIndex = 0

    init {
        restaurant = res[restaurantIndex]
    }

}









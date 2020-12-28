package jp.co.cybermissions.com.example.tourinformation.restaurant

import androidx.lifecycle.ViewModel

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









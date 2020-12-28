package jp.co.cybermissions.com.example.tourinformation.hotel

import androidx.lifecycle.ViewModel

class HotelViewModel : ViewModel() {
    data class Hotel(
        val name: String,
        val address: String,
        val price: String
    )

     val hotels: MutableList<Hotel> = mutableListOf(
        Hotel(name = "Britannia International Hotel Canary Wharf ", address = "163 MarshWallDocklands,Tower Hamlets,London", price = "$100"),
        Hotel(name = "Strand Palace Hotel", address = "372 Strand,Westminster Borough,London", price = "$75"),
        Hotel(name = "Park Plaza London, Park Royal", address = "628 Western Avenue London W30TA,UnitedKingdom", price = "$50")
    )

    //Hotel List Of NewYork
    val hotelsNewYork: MutableList<Hotel> = mutableListOf(
        Hotel(name = "Britannia International Hotel Canary Wharf ", address = "163 MarshWallDocklands,Tower Hamlets,London", price = "$100"),
        Hotel(name = "Strand Palace Hotel", address = "372 Strand,Westminster Borough,London", price = "$75"),
        Hotel(name = "Park Plaza London, Park Royal", address = "628 Western Avenue London W30TA,UnitedKingdom", price = "$50")
    )

    var hotel: Hotel
    var hotelIndex = 0

    init {
        hotel = hotels[hotelIndex]
    }
}
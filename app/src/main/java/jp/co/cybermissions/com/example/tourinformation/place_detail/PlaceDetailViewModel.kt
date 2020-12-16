package jp.co.cybermissions.com.example.tourinformation.place_detail

import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlaceDetailViewModel : ViewModel() {

 //  val placedetails: MutableList<PlaceDetail> = mutableListOf(
//        PlaceDetail(text =
     var placeList: MutableList<String> = mutableListOf(
     "London",
     "NewYork",
     "Sanfran"
 )

    private val _currentplace = MutableLiveData<String>()
    val currentplace: LiveData<String>
        get() = _currentplace

    init {
        CurrentPlace()
    }

    private fun CurrentPlace() {
            _currentplace.value =
                "London is a leading global city. It is the world's largest financial centre alongside New York, and is home to the headquarters of more than 100 of Europe's 500 largest companies. It has the most international visitors of any city in the world.\n" +
                        "\n" +
                        "The World Nuclear Association Symposium will be held at Central Hall Westminster. Many of London’s top attractions lie only a short distance from here, such as Trafalgar Square, the National Gallery, Piccadilly Circus, Leicester Square, Buckingham Palace and St. James’s Park. The location is also within London’s “theatreland” and close to many of the capital’s best pubs, clubs, restaurants and shops." +
                        "\n"+"This has always been a powerful place because of its position on the mighty River Thames, with easy access to the Thames estuary and to the ocean beyond. London's docks, now home to trendy apartments, were the key to its prosperity as the world's greatest trading city in the 19th century, at the very height of the British Empire."
    }

    private fun nextButton() {
        placeList.contains("London")

    }
}


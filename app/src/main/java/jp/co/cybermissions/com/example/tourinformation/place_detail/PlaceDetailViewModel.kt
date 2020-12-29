package jp.co.cybermissions.com.example.tourinformation.place_detail

import android.app.Application
import androidx.lifecycle.*
import jp.co.cybermissions.com.example.tourinformation.Detail

class PlaceDetailViewModel (details: Detail,
                            app: Application
) : AndroidViewModel(app) {

    private val _selectedProperty = MutableLiveData<Detail>()
    val selectedProperty: LiveData<Detail>
        get() = _selectedProperty

    init {
        //CurrentPlace()
        _selectedProperty.value = details

    }


//    private fun CurrentPlace() {
//            _currentplace.value =
//                "London is a leading global city. It is the world's largest financial centre alongside New York, and is home to the headquarters of more than 100 of Europe's 500 largest companies. It has the most international visitors of any city in the world.\n" +
//                        "\n" +
//                        "The World Nuclear Association Symposium will be held at Central Hall Westminster. Many of London’s top attractions lie only a short distance from here, such as Trafalgar Square, the National Gallery, Piccadilly Circus, Leicester Square, Buckingham Palace and St. James’s Park. The location is also within London’s “theatreland” and close to many of the capital’s best pubs, clubs, restaurants and shops." +
//                        "\n"+"This has always been a powerful place because of its position on the mighty River Thames, with easy access to the Thames estuary and to the ocean beyond. London's docks, now home to trendy apartments, were the key to its prosperity as the world's greatest trading city in the 19th century, at the very height of the British Empire."
//    }
}


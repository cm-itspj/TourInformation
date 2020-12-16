package jp.co.cybermissions.com.example.tourinformation.place_detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import jp.co.cybermissions.com.example.tourinformation.R
import jp.co.cybermissions.com.example.tourinformation.databinding.PlaceDetailBinding
class PlaceDetailFragment : Fragment() {
//        data class PlaceDetail(
//        val text : String)
//
//       val placedetails: MutableList<PlaceDetail> = mutableListOf(
//        PlaceDetail(text = "London is a leading global city. It is the world's largest financial centre alongside New York, and is home to the headquarters of more than 100 of Europe's 500 largest companies. It has the most international visitors of any city in the world.\n" +
//                "\n" +
//                "The World Nuclear Association Symposium will be held at Central Hall Westminster. Many of London’s top attractions lie only a short distance from here, such as Trafalgar Square, the National Gallery, Piccadilly Circus, Leicester Square, Buckingham Palace and St. James’s Park. The location is also within London’s “theatreland” and close to many of the capital’s best pubs, clubs, restaurants and shops."
//                   ))
//
//    lateinit var currentPlace : PlaceDetail

    private lateinit var viewModel: PlaceDetailViewModel



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: PlaceDetailBinding = DataBindingUtil.inflate(inflater,
            R.layout.place_detail, container, false)

        viewModel = ViewModelProvider(this).get(PlaceDetailViewModel::class.java)

        binding.placedetailViewModel = viewModel

        binding.lifecycleOwner = viewLifecycleOwner



        binding.cancel.setOnClickListener {view : View ->
            view.findNavController()
                .navigate(R.id.action_placedetailFragment_to_placeFragment)
        }
//        binding.restaurant.setOnClickListener {view : View ->
//            view.findNavController()
//                .navigate(R.id.action_placedetailFragment_to_restaurant)
//        }
        binding.hotel.setOnClickListener {view : View ->
            view.findNavController()
                .navigate(R.id.action_placedetailFragment_to_hotel)
        }
        return binding.root
    }


}

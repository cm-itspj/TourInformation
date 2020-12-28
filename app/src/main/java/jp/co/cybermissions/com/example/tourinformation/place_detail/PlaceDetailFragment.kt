package jp.co.cybermissions.com.example.tourinformation.place_detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import jp.co.cybermissions.com.example.tourinformation.R
import jp.co.cybermissions.com.example.tourinformation.databinding.PlaceDetailBinding


class PlaceDetailFragment : Fragment() {

    private lateinit var viewModel: PlaceDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: PlaceDetailBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.place_detail, container, false
        )
        viewModel = ViewModelProvider(this).get(PlaceDetailViewModel::class.java)


        binding.placedetailViewModel = viewModel

        binding.lifecycleOwner = viewLifecycleOwner

        binding.cancel.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(R.id.action_placedetailFragment_to_placeFragment)
        }

        binding.restaurant.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(R.id.action_placedetailFragment_to_restaurant)

        }
        binding.hotel.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(R.id.action_placedetailFragment_to_hotel)
        }

        return binding.root
    }
}

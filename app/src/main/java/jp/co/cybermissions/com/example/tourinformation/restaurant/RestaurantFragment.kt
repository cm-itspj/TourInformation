package jp.co.cybermissions.com.example.tourinformation.restaurant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import jp.co.cybermissions.com.example.tourinformation.R
import jp.co.cybermissions.com.example.tourinformation.databinding.PlaceDetailBinding
import jp.co.cybermissions.com.example.tourinformation.databinding.RestaurantBinding

class RestaurantFragment : Fragment() {

    private lateinit var viewModel: RestaurantViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: RestaurantBinding = DataBindingUtil.inflate(
            inflater, R.layout.restaurant,container,false)

        viewModel = ViewModelProvider(this).get(RestaurantViewModel::class.java)
        binding.restaurantList = viewModel

        binding.lifecycleOwner = viewLifecycleOwner

        binding.applyButton.setOnClickListener {view : View ->
            view.findNavController().navigate(R.id.action_restaurantFragment_to_applyFragment)
        }
        return binding.root
    }
}
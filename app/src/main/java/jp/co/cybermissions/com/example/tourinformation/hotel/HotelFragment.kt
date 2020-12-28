package jp.co.cybermissions.com.example.tourinformation.hotel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import jp.co.cybermissions.com.example.tourinformation.R
import jp.co.cybermissions.com.example.tourinformation.databinding.HotelBinding

class HotelFragment : Fragment() {

    private lateinit var viewModel: HotelViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: HotelBinding = DataBindingUtil.inflate(
            inflater, R.layout.hotel, container, false
        )

        viewModel = ViewModelProvider(this).get(HotelViewModel::class.java)

        binding.hotelList = viewModel

        binding.lifecycleOwner = viewLifecycleOwner

        binding.applyButton.setOnClickListener {view : View ->
            view.findNavController().navigate(R.id.action_hotelFragment_to_applyFragment)
        }
        return binding.root
    }
}
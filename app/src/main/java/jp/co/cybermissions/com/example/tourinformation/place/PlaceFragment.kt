package jp.co.cybermissions.com.example.tourinformation.place

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

import jp.co.cybermissions.com.example.tourinformation.R
import jp.co.cybermissions.com.example.tourinformation.databinding.PlaceBinding

class PlaceFragment  : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: PlaceBinding = DataBindingUtil.inflate(inflater,R.layout.place, container, false)

        binding.place1.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(PlaceFragmentDirections.actionPlaceFragmentToPlacedetailFragment())
        }

        binding.place2.setOnClickListener {view: View ->
            view.findNavController()
                .navigate(PlaceFragmentDirections.actionPlaceFragmentToPlacedetailFragment())
        }
        binding.place3.setOnClickListener {view: View ->
            view.findNavController()
                .navigate(PlaceFragmentDirections.actionPlaceFragmentToPlacedetailFragment())
        }

        //setHasOptionsMenu(true)
        return binding.root
    }
}

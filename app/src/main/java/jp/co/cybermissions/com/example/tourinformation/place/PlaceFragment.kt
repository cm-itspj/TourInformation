package jp.co.cybermissions.com.example.tourinformation.place

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import jp.co.cybermissions.com.example.tourinformation.R
import jp.co.cybermissions.com.example.tourinformation.databinding.PlaceBinding

class PlaceFragment  : Fragment() {
//private lateinit var binding : PlaceBinding

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        //setHasOptionsMenu(true)
//    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: PlaceBinding = DataBindingUtil.inflate(inflater,R.layout.place, container, false)


        binding.place1.setOnClickListener {view: View ->
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
        return binding.root
    }

//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        super.onCreateOptionsMenu(menu, inflater)
//        inflater.inflate(R.menu.options_menu, menu)
//    }
//
//    override fun onContextItemSelected(item: MenuItem): Boolean {
//        when (item.getItemId()) {
//            R.id.aboutFragment -> {
//                return true
//            }
//            else -> return super.onOptionsItemSelected(item)
//        }
//    }

}

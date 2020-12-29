package jp.co.cybermissions.com.example.tourinformation.place

import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jp.co.cybermissions.com.example.tourinformation.R
import jp.co.cybermissions.com.example.tourinformation.databinding.PlaceBinding

class PlaceFragment  : Fragment() {

    private val viewModel : PlaceViewModel by lazy {
        ViewModelProvider(this).get(PlaceViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        val binding = FragmentListBinding.inflate(inflater)
//        binding.viewModel = viewModel
//        binding.lifecycleOwner = this
//        binding.recyclerView.adapter = DetailGridAdapter(DetailGridAdapter.OnClickListener {
//            viewModel.displayPropertyDetails(it)
//        })

        val view: View = inflater.inflate(R.layout.fragment_list,container,false)
        val activity = activity as Context
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(activity,2)
        recyclerView.adapter = DetailGridAdapter(DetailGridAdapter.OnClickListener {
            viewModel.displayPropertyDetails(it)
        })
        viewModel.navigateToDetailProperty.observe(this, Observer {
            if (null != it) {
                this.findNavController().navigate(
                    PlaceFragmentDirections.actionPlaceFragmentToPlacedetailFragment(it))
                viewModel.displayPropertyDetailsComplete()
            }
        })

        //return binding
        return view


//        binding.place1.setOnClickListener {view: View ->
//            view.findNavController()
//                .navigate(PlaceFragmentDirections.actionPlaceFragmentToPlacedetailFragment())
//        }
//
//        binding.place2.setOnClickListener {view: View ->
//            view.findNavController()
//                .navigate(PlaceFragmentDirections.actionPlaceFragmentToPlacedetailFragment())
//        }
//        binding.place3.setOnClickListener {view: View ->
//            view.findNavController()
//                .navigate(PlaceFragmentDirections.actionPlaceFragmentToPlacedetailFragment())
//        }

        //setHasOptionsMenu(true)

    }
}

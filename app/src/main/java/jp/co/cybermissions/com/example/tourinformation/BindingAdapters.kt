package jp.co.cybermissions.com.example.tourinformation

import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.co.cybermissions.com.example.tourinformation.place.DetailGridAdapter

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView,
detail : List<Detail>?) {
val adapter = recyclerView.adapter as DetailGridAdapter
    adapter.submitList(detail)
    Log.i("BindingAdapter","ListData")
}
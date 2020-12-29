package jp.co.cybermissions.com.example.tourinformation.place


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.co.cybermissions.com.example.tourinformation.Detail
import jp.co.cybermissions.com.example.tourinformation.databinding.GridViewItemBinding

class DetailGridAdapter( private val onClickListener: OnClickListener ) : ListAdapter<Detail,
        DetailGridAdapter.DetailViewHolder>(DiffCallback) {


    companion object DiffCallback :DiffUtil.ItemCallback<Detail> () {
        override fun areItemsTheSame(oldItem: Detail, newItem: Detail): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Detail, newItem: Detail): Boolean {
            return oldItem.id == newItem.id
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailGridAdapter.DetailViewHolder {
        return DetailViewHolder(GridViewItemBinding.inflate(
            LayoutInflater.from(parent.context)
        ))
    }

    override fun onBindViewHolder(holder: DetailGridAdapter.DetailViewHolder, position: Int) {
        val details = getItem(position)
        holder.bind(details)
        holder.itemView.setOnClickListener {
            onClickListener.onClick(details)
        }
    }

    class DetailViewHolder (private var binding:
    GridViewItemBinding):
    RecyclerView.ViewHolder(binding.root) {

        fun bind (details : Detail) {
            binding.list = details
            binding.executePendingBindings()
        }

    }

    class OnClickListener (val clickListener: (details : Detail) -> Unit) {
        fun onClick(details:Detail) = clickListener(details)
    }

}
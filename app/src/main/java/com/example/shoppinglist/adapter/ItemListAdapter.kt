package com.example.shoppinglist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinglist.databinding.ItemListBinding
import com.example.shoppinglist.ui.CommonItemsActivity

class ItemListAdapter(private val list: List<String>, private val listener: OnItemSelected) :
    RecyclerView.Adapter<ItemListAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemListBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvItem.text = list[position]
        holder.binding.btItem.setOnClickListener {
            listener.onSelect(list[position])
        }
    }

    override fun getItemCount() = list.size
}

interface OnItemSelected {
    fun onSelect(item: String)
}
package com.example.shoppinglist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinglist.databinding.ItemListBinding

class ItemListAdapter(private val ingr: List<String>) :
    RecyclerView.Adapter<ItemListAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemListBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvItem.text = ingr[position]
        holder.binding.btItem.setOnClickListener {


        }
    }

    override fun getItemCount() = ingr.size
}
package com.example.shoppinglist.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.allViews
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoppinglist.R
import com.example.shoppinglist.adapter.ItemListAdapter
import com.example.shoppinglist.databinding.CommonItemsActivityBinding

class CommonItemsActivity : AppCompatActivity() {

    private lateinit var binding: CommonItemsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CommonItemsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvList.adapter = ItemListAdapter(listOf<String>("Cheese", "Rice", "Apples"))
        binding.rvList.layoutManager = LinearLayoutManager(this)

        
    }
}
package com.example.shoppinglist.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoppinglist.R
import com.example.shoppinglist.adapter.ItemListAdapter
import com.example.shoppinglist.adapter.OnItemSelected
import com.example.shoppinglist.databinding.CommonItemsActivityBinding

class CommonItemsActivity : AppCompatActivity(), OnItemSelected {

    private lateinit var binding: CommonItemsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CommonItemsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvList.adapter = ItemListAdapter(listOf("Cheese", "Rice", "Apples"), this)
        binding.rvList.layoutManager = LinearLayoutManager(this)
    }

    override fun onSelect(item: String) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("LIST_ITEMS", item)
        setResult(69, intent)
        finish()
    }
}
package com.example.shoppinglist.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.shoppinglist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var launcher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            val s = (it.data?.extras?.getString("LIST_ITEMS") ?: "")
            binding.tvList.text = "${binding.tvList.text} $s \n\n"
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btAddItem.setOnClickListener {
            val intent = Intent(this, CommonItemsActivity::class.java)
            intent.putExtra("LIST_ITEMS", binding.tvList.text)
            launcher.launch(intent)
        }
    }
}
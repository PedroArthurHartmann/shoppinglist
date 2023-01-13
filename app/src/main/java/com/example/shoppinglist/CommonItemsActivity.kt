package com.example.shoppinglist

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.allViews
import com.example.shoppinglist.databinding.CommonItemsActivityBinding

class CommonItemsActivity : AppCompatActivity() {

    private lateinit var binding: CommonItemsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CommonItemsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.root.allViews.forEach {

            if (it is Button)
                it.setOnClickListener { button ->

                    val intent = Intent(this, MainActivity::class.java)

                    when(button.id) {
                        R.id.bt_cheese -> intent.putExtra("LIST_ITEMS", "cheese")
                        R.id.bt_rice -> intent.putExtra("LIST_ITEMS", "rice")
                        R.id.bt_apples -> intent.putExtra("LIST_ITEMS", "apples")
                    }

                    setResult(69, intent)
                    finish()
                }
        }
    }
}
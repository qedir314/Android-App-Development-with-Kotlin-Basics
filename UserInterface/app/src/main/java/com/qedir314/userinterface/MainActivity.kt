package com.qedir314.userinterface

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.qedir314.userinterface.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /*
        binding.textView.text = "Hello Krakow"
        binding.button.setOnClickListener {
            binding.textView.text = "Hello Warsaw"
        }
        binding.button2.setOnClickListener {
            binding.textView.text = "Hello Lodz"
        }
        */

        /*
        val image = findViewById<ImageView>(R.id.imageView)
        val myTextView = findViewById<TextView>(R.id.textView)
        myTextView.text = "Hello Krakow"
         */
    }

    fun save(view: View) {
        binding.textView.text = "Registration Saved"
    }

    fun cancel(view: View) {
        binding.textView.text = "Registration Failed"
    }


}
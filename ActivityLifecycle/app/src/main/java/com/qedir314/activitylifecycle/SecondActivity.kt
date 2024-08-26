package com.qedir314.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.qedir314.activitylifecycle.databinding.ActivityMainBinding
import com.qedir314.activitylifecycle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val intentFromMain = intent          // get intent
        val sendedName = intentFromMain.getStringExtra("name")
        binding.textView2.text = sendedName

        // binding.textView2.text = intent.getStringExtra("name")

        /*
        fun openFirstActivity(view : View) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
         */
    }
}
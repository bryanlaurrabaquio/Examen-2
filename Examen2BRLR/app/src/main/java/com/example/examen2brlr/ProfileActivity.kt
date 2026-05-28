package com.example.examen2brlr

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        val tvUser = findViewById<TextView>(R.id.tvUser)

        val username = intent.getStringExtra("USERNAME")

        tvUser.text = username ?: "Usuario"
    }
}

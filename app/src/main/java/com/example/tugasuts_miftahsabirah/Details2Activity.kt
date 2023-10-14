package com.example.tugasuts_miftahsabirah

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.tugasuts_miftahsabirah.databinding.ActivityDetails1Binding
import com.example.tugasuts_miftahsabirah.databinding.ActivityDetails2Binding

class Details2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetails2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            tombolBack.setOnClickListener {
                finish()
            }
            tombolGet.setOnClickListener{
                val intent = Intent(this@Details2Activity, PaymentActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
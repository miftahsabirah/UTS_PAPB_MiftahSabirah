package com.example.tugasuts_miftahsabirah

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.tugasuts_miftahsabirah.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val uname = intent.getStringExtra(LoginActivity.EXTRA_UNAME)
        val movieCard1 = findViewById<CardView>(R.id.movieCard1)
        val movieCard2 = findViewById<CardView>(R.id.movieCard2)
        val movieCard3 = findViewById<CardView>(R.id.movieCard3)


        with(binding) {
            username.text = uname
            movieCard1.setOnClickListener {
                val intent = Intent(this@HomeActivity, Details1Activity::class.java)
                startActivity(intent)
            }
            movieCard2.setOnClickListener {
                val intent = Intent(this@HomeActivity, Details2Activity::class.java)
                startActivity(intent)
            }
            movieCard3.setOnClickListener {
                val intent = Intent(this@HomeActivity, Details3Activity::class.java)
                startActivity(intent)
            }

        }
    }
}
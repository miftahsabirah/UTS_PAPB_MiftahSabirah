package com.example.tugasuts_miftahsabirah

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.tugasuts_miftahsabirah.databinding.ActivityHomeBinding
import com.example.tugasuts_miftahsabirah.databinding.ActivityOrderBinding

class OrderActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOrderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengambil nilai dari intent
        val selectedBioskop = intent.getStringExtra(PaymentActivity.EXTRA_BIOSKOP)
        val selectedSeat = intent.getStringExtra(PaymentActivity.EXTRA_SEAT)
        val selectedTanggal = intent.getStringExtra(PaymentActivity.EXTRA_TANGGAL)
        val selectedBank = intent.getStringExtra(PaymentActivity.EXTRA_BANK)
        val harga = intent.getIntExtra(PaymentActivity.EXTRA_HARGA, 0)

        with(binding) {
            // Update TextView dengan nilai yang diterima
            bioskopPilihan.text = selectedBioskop
            tanggalPilihan.text = selectedTanggal
            hasilSeat.text = selectedSeat
            hasilSeat2.text = selectedSeat
            hasilBank.text = "$selectedBank"
            hargaTiket.text = "$harga"
            totalan.text = "$harga"

            tombolBack.setOnClickListener {
                finish()
            }
        }
    }
}


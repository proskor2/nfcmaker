package store.dide.nfcmaker.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import store.dide.nfcmaker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Главная"


        binding.cardListNumbers.setOnClickListener() {
            startActivity(Intent(this,ListNumbersActivity::class.java))
        }

        binding.cardWriteTokens.setOnClickListener() {
            startActivity(Intent(this,MasterQRActivity::class.java))
        }

        binding.cardStatistics.setOnClickListener() {
            startActivity(Intent(this, StatisticActivity::class.java))
        }

    }
}
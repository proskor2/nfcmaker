package store.dide.nfcmaker.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import store.dide.nfcmaker.databinding.ActivityStatisticBinding

class StatisticActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStatisticBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStatisticBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Статистика"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }
}
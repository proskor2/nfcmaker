package store.dide.nfcmaker.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import store.dide.nfcmaker.databinding.ActivityListNumbersBinding

class ListNumbersActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListNumbersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListNumbersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardList1.setOnClickListener() {
            startActivity(Intent(this, ListViewerActivity::class.java))
        }


    }
}
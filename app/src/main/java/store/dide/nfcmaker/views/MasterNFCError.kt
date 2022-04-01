package store.dide.nfcmaker.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MasterNFCError : AppCompatActivity() {
    private lateinit var binding: store.dide.nfcmaker.databinding.ActivityMasterNfcerrorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = store.dide.nfcmaker.databinding.ActivityMasterNfcerrorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Запись токена"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }
}
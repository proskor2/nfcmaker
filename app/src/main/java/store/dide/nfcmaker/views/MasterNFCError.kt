package store.dide.nfcmaker.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import store.dide.nfcmaker.databinding.ActivityMasterNfcerrorBinding

class MasterNFCError : AppCompatActivity() {
    private lateinit var binding: ActivityMasterNfcerrorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMasterNfcerrorBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
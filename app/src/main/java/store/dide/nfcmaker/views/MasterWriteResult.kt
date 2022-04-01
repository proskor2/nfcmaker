package store.dide.nfcmaker.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import store.dide.nfcmaker.databinding.ActivityMasterWriteResultBinding

class MasterWriteResult : AppCompatActivity() {
    private lateinit var binding: ActivityMasterWriteResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMasterWriteResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
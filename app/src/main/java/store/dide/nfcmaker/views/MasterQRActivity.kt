package store.dide.nfcmaker.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import store.dide.nfcmaker.databinding.ActivityMasterQractivityBinding

class MasterQRActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMasterQractivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMasterQractivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
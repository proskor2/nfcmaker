package store.dide.nfcmaker.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import store.dide.nfcmaker.databinding.ActivityMasterNfcactivityBinding
import store.dide.nfcmaker.databinding.ActivityMasterQractivityBinding

class MasterNFCActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMasterNfcactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMasterNfcactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Запись токена"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.imageWritenfc.setOnClickListener(){
            startActivity(Intent(this, MasterWriteResult::class.java))
        }

    }
}
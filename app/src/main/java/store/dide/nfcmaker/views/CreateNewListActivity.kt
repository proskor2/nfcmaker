package store.dide.nfcmaker.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import store.dide.nfcmaker.databinding.ActivityCreateNewListBinding

class CreateNewListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreateNewListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateNewListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Создание нового списка"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}
package store.dide.nfcmaker.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import store.dide.nfcmaker.databinding.ActivityListViewerBinding

class ListViewerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListViewerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val nameList = intent.extras?.get("listname").toString()
        supportActionBar?.title = nameList
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }
}
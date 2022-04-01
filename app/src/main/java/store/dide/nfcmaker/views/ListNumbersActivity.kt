package store.dide.nfcmaker.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import store.dide.nfcmaker.R
import store.dide.nfcmaker.databinding.ActivityListNumbersBinding

class ListNumbersActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListNumbersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListNumbersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Список номеров"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.cardList1.setOnClickListener() {
            val intent = Intent(this, ListViewerActivity::class.java)
            intent.putExtra("listname", "Список 1")
            startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.add_list -> {
            startActivity(Intent(this, CreateNewListActivity::class.java))
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.createlist, menu)
        return true
    }
}
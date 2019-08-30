package com.umiitkose.androidexampleswithkotlin.example.menu.context

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.umiitkose.androidexampleswithkotlin.R
import java.util.zip.Inflater

class ContextMenuActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu)

        imageView = findViewById(R.id.imageView)
        registerForContextMenu(imageView)

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_context, menu)
        menu?.setHeaderTitle("Seçenekler")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when(item?.itemId){
            R.id.action_add -> {Toast.makeText(this,"Ekle", Toast.LENGTH_LONG).show()
            true
            }
            R.id.action_delete -> {Toast.makeText(this,"Sil", Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_update -> {Toast.makeText(this,"Güncelle", Toast.LENGTH_LONG).show()
                true
            }

            else -> super.onContextItemSelected(item)
        }
    }

}

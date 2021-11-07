package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_ex, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.item1 -> Toast.makeText(this, "Hello, my name is Toast", Toast.LENGTH_SHORT).show()
            R.id.item2 -> {
                intent = Intent(this, settings::class.java)
                startActivity(intent)
            }
            R.id.item3 -> {
                intent = Intent(this, share::class.java)
                startActivity(intent)
            }
            R.id.item4 -> {
                if (item.title == "Change") {
                    item.title = "logout"
                } else if (item.title == "logout") {
                    item.title = "Change"
                }else{
                    item.title =""
                }

            }


        }
        return super.onOptionsItemSelected(item)
    }

}
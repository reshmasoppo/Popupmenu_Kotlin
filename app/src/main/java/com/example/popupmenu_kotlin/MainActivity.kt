package com.example.popupmenu_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {

   lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

            val popupMenu: PopupMenu = PopupMenu(this,button)

            popupMenu.menuInflater.inflate(R.menu.menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->

                when(item.itemId) {
                    R.id.action_crick ->
                        Toast.makeText(this@MainActivity, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.action_ftbal ->
                        Toast.makeText(this@MainActivity, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.action_hockey ->
                        Toast.makeText(this@MainActivity, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                }
                true
            })
            popupMenu.show()
        }
    }
}

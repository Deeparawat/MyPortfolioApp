package com.deepa.portfolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val Resumebtn:Button=findViewById(R.id.Resumebtn)
        Resumebtn.setOnClickListener{
            val openURL=Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://drive.google.com/drive/folders/1K3ESjHGJlYJ4ip-NYh0dRYP_rQSpnTU5")
            startActivity(openURL)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.Home -> {
                val intent = Intent(this@AboutActivity, MainActivity::class.java)
                startActivity(intent)
            }

            R.id.About -> {
                val intent = Intent(this@AboutActivity, AboutActivity::class.java)
                startActivity(intent)

            }

            R.id.Connect -> {
                val intent = Intent(this@AboutActivity, SecondActivity::class.java)
                startActivity(intent)
            }

            R.id.Exit -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }


}
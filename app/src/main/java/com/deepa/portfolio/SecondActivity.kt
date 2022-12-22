package com.deepa.portfolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView as ImageView1

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

    }



   // val myUrl = "https://www.linkedin.com/in/deeparawat08"
   // val imageView = findViewById<View>(R.id.linkedin1) as ImageView
   fun gmail1(view: View) {
       val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://myaccount.google.com/personal-info?hl=en"))
       startActivity(intent)
   }

    fun linkedin1(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/deeparawat08"))
        startActivity(intent)
    }

    fun github1(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Deeparawat"))
        startActivity(intent)
    }

    fun instagram1(view: View) {
        val intent =
            Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/deepa.rawat_08"))
        startActivity(intent)
    }

    fun switchActivity(view: View) {
        val intent = Intent(this@SecondActivity, SecondActivity::class.java)
        startActivity(intent)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.Home -> {
                val intent = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.About -> {
                val intent = Intent(this@SecondActivity, AboutActivity::class.java)
                startActivity(intent)

            }
            R.id.Connect -> {
                val intent = Intent(this@SecondActivity, SecondActivity::class.java)
                startActivity(intent)
            }
            R.id.Exit -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}






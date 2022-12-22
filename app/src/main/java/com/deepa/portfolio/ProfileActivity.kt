package com.deepa.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.deepa.portfolio.R.id.knowFurther

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val button = findViewById<Button>(knowFurther)
        button.setOnClickListener {
            val intent = Intent(this@ProfileActivity, AboutActivity::class.java)
            startActivity(intent)
        }
    }

         override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.menu, menu)
            return true
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean{
            when (item.itemId) {
                R.id.Home -> {
                    val intent = Intent(this@ProfileActivity, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.About -> {
                    val intent = Intent(this@ProfileActivity, AboutActivity::class.java)
                    startActivity(intent)

                }
                R.id.Connect -> {
                    val intent = Intent(this@ProfileActivity, SecondActivity::class.java)
                    startActivity(intent)
                }
                R.id.Exit -> {
                    finish()
                }

            }
            return super.onOptionsItemSelected(item)
        }

    }




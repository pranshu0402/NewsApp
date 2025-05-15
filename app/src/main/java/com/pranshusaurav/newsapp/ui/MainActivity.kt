package com.pranshusaurav.newsapp.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.pranshusaurav.newsapp.R
import com.pranshusaurav.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setupUI()
    }

    private fun setupUI() {
        binding.apply {
            btnTopHeadlines.setOnClickListener {
                Toast.makeText(this@MainActivity, "TopHeadlines", Toast.LENGTH_SHORT).show()
            }
            btnNewsSources.setOnClickListener {
                Toast.makeText(this@MainActivity, "NewsSources", Toast.LENGTH_SHORT).show()
            }
            btnCountries.setOnClickListener {
                Toast.makeText(this@MainActivity, "Countries", Toast.LENGTH_SHORT).show()
            }
            btnLanguages.setOnClickListener {
                Toast.makeText(this@MainActivity, "Languages", Toast.LENGTH_SHORT).show()
            }
            btnSearch.setOnClickListener {
                Toast.makeText(this@MainActivity, "Search", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
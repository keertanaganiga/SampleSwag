package com.keertana.sampleswag.Controller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.keertana.sampleswag.Adapters.CategoryRecycleAdapter
import com.keertana.sampleswag.R
import com.keertana.sampleswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter= CategoryRecycleAdapter(this,DataService.categories) { category ->
            val productIntent=Intent(this,ProductActivity::class.java)
            startActivity(productIntent)
        }
        categoryListView.adapter= adapter

        val layoutManager=LinearLayoutManager(this)
        categoryListView.layoutManager=layoutManager
        categoryListView.setHasFixedSize((true))


        }
    }

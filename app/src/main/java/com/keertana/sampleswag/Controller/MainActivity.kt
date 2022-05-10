package com.keertana.sampleswag.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.keertana.sampleswag.Adapters.CategoryAdapter
import com.keertana.sampleswag.R
import com.keertana.sampleswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter= CategoryAdapter(this,DataService.categories)
        categoryListView.adapter=adapter
    }
}
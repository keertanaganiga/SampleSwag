package com.keertana.sampleswag.Controller

import android.os.Bundle
import android.widget.Toast
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

//        categoryListView.setOnItemClickListener { adapterView, view, i, id ->
//            val category=DataService.categories[i]
//            Toast.makeText(this,"You clicked on the ${category.title} cell",Toast.LENGTH_SHORT).show()
        }
    }
}
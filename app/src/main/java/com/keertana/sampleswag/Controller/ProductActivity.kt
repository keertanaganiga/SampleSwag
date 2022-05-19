package com.keertana.sampleswag.Controller

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.keertana.sampleswag.Adapters.ProductsAdapter
import com.keertana.sampleswag.R
import com.keertana.sampleswag.Services.DataService
import com.keertana.sampleswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var adapter:ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType=intent.getStringExtra(EXTRA_CATEGORY)
        adapter= ProductsAdapter(this,DataService.getProducts(categoryType))

        var spanCount=2
        val orientation=resources.configuration.orientation
        if (orientation==Configuration.ORIENTATION_LANDSCAPE){
            spanCount=3
        }

        var screenSize=resources.configuration.screenWidthDp
        if (screenSize>720){
            spanCount=3
        }

        val layoutManager=GridLayoutManager(this,spanCount)
        productsListView.layoutManager=layoutManager
        productsListView.adapter=adapter
    }
}
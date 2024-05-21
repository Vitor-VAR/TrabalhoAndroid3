package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.brand

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.R
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.databinding.ActivityBrandListBinding

class BrandListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBrandListBinding
    private lateinit var brandAdapter: BrandAdapter
    private lateinit var viewModel: BrandViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrandListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prepareRecycleView()
        viewModel = ViewModelProvider(this)[BrandViewModel::class.java]
        //viewModel.getBrand()
        viewModel.observerBrandLiveData()
    }

    fun prepareRecycleView(){
        brandAdapter = BrandAdapter()
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 2)
            adapter = brandAdapter

        }


    }
}
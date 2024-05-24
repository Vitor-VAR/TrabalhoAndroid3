package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.brand

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.databinding.ActivityBrandListBinding

class BrandListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBrandListBinding
    private lateinit var brandAdapter: BrandAdapter
    private lateinit var viewModel: BrandViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrandListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[BrandViewModel::class.java]


        binding.btCar.setOnClickListener {
            val btCar = binding.btCar.text.toString()

            viewModel.listBrandCar(btCar)

        }

        prepareRecycleView()

    }

    fun prepareRecycleView(){
        brandAdapter = BrandAdapter()
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = brandAdapter
        }


    }
}
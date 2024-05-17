package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.brand

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.R
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.databinding.ActivityBrandListBinding

class BrandListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBrandListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrandListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
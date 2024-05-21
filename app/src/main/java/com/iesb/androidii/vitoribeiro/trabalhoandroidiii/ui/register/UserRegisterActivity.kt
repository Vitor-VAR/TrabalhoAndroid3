package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.R
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.databinding.ActivityUserRegisterBinding


class UserRegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserRegisterBinding
    private lateinit var viewModel : UserRegisterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_register)

        //viewModel = ViewModelProvider(this).get(UserRegisterViewModel::class.java)
    }
}
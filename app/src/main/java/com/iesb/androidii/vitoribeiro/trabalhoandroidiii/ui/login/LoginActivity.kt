package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.MainActivity
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.R
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.databinding.ActivityLoginBinding
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.model.UserModel
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.brand.BrandListActivity
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.register.UserRegisterActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var viewModel : LoginViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ////Variáveis da classe
        binding = ActivityLoginBinding.inflate(layoutInflater)
        //Layout
        setContentView(binding.root)

        //Variáveis da classe
        viewModel = ViewModelProvider(this).get(LoginViewModel :: class.java)


        binding.btLogin.setOnClickListener {
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            viewModel.doLogin(email, password)

            Toast.makeText(this, "Bem vindo: ${email}", Toast.LENGTH_LONG).show()

            observe()
        }

        binding.tvNewUser.setOnClickListener {

            startActivity(Intent(this, UserRegisterActivity::class.java))
        }

    }



    private fun observe(){
        viewModel.login.observe(this) {
            if(it.status()){
                startActivity(Intent(applicationContext, BrandListActivity::class.java))
                finish()
            }else {
                Toast.makeText(applicationContext, it.message(), Toast.LENGTH_LONG).show()

            }

        }

        }
}
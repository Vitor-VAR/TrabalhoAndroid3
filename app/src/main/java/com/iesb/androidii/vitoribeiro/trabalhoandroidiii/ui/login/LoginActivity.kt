package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.R
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var viewModel : LoginViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(LoginViewModel :: class.java)

        setObserver()

        binding.btLogin.setOnClickListener {
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            viewModel.doLogin(email, password)

            Toast.makeText(this, "Bem vindo: ${email}", Toast.LENGTH_LONG).show()
        }
    }

    private fun setObserver(){
        viewModel.login().observe(this, Observer {
            if (it){
                Toast.makeText(this, "Sucesso!", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Falha!", Toast.LENGTH_LONG).show()
            }
        })
    }
}
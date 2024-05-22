package com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.R
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.databinding.ActivityUserRegisterBinding
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.login.LoginActivity
import com.iesb.androidii.vitoribeiro.trabalhoandroidiii.ui.login.LoginViewModel


class UserRegisterActivity : AppCompatActivity() {


    private lateinit var viewModel : UserRegisterViewModel
    private lateinit var binding: ActivityUserRegisterBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(UserRegisterViewModel:: class.java)

        //dando erro ao ao cair aqui
        binding.btAdd.setOnClickListener {

            val name = binding.etName.text.toString().trim()
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPass.text.toString().trim()

            viewModel.crete(name, email,password)

            Toast.makeText(this, "Usuário cadastrado: ${email}", Toast.LENGTH_LONG).show()

            observe()
        }


    }

    private fun observe(){
        viewModel.user.observe(this){
            if (it.status()){
                startActivity(Intent(this, LoginActivity::class.java))
            }else{
                Toast.makeText(this, it.message(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}
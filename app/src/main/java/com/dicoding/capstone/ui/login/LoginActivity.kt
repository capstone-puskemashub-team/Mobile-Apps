package com.dicoding.capstone.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.dicoding.capstone.BottomNavigation
import com.dicoding.capstone.R
import com.dicoding.capstone.api.ApiService
import com.dicoding.capstone.api.Retro
import com.dicoding.capstone.databinding.ActivityLoginBinding
import com.dicoding.capstone.model.UserRequest
import com.dicoding.capstone.model.UserResponse
import com.dicoding.capstone.ui.dashboard.DashboardFragment
import com.dicoding.capstone.ui.register.RegisterActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()


        binding.tvRegister.setOnClickListener{
            startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
        }

        initAction()
    }

    fun initAction(){
        binding.btnLogin.setOnClickListener{
            login()
        }
    }

    fun login(){
        var request = UserRequest()
        request.username = binding.etUsername.text.toString().trim()
        request.password = binding.etPass.text.toString().trim()

        val retro= Retro().getRetroClientInstance().create(ApiService::class.java)
        retro.login(request).enqueue(object : Callback<UserResponse>{
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                if(response.isSuccessful ){ // Ganti dengan properti yang menyimpan nama pengguna
                    val intent = Intent(this@LoginActivity, BottomNavigation::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    binding.tvLoginFailure.visibility = View.VISIBLE
                    binding.tvLoginFailure.text = "Login failed. Please check your credentials."
                    Handler(Looper.getMainLooper()).postDelayed({
                        binding.tvLoginFailure.visibility = View.GONE
                    }, 3000)
                }
            }
            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                Log.e("Error", t.message.toString())
            }

        })
    }


}
package com.dicoding.capstone.ui.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.dicoding.capstone.BottomNavigation
import com.dicoding.capstone.R
import com.dicoding.capstone.api.ApiService
import com.dicoding.capstone.api.Retro
import com.dicoding.capstone.databinding.ActivityRegisterBinding
import com.dicoding.capstone.model.UserRequest
import com.dicoding.capstone.model.UserResponse
import com.dicoding.capstone.ui.login.LoginActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

private lateinit var binding : ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvLogin.setOnClickListener{
            startActivity(Intent(this@RegisterActivity,LoginActivity::class.java))
        }
        initAction()
    }

    fun initAction(){
        binding.btnRegister.setOnClickListener{
            register()
        }
    }

    fun register(){
        val request = UserRequest()
        request.firstname = binding.etFirstname.text.toString().trim()
        request.lastname = binding.etLastname.text.toString().trim()
        request.username = binding.etUsername.text.toString().trim()
        request.password = binding.etPass.text.toString().trim()
        request.telephone = binding.etNomor.text.toString().trim()

        val retro = Retro().getRetroClientInstance().create(ApiService::class.java)
        retro.register(request).enqueue(object: Callback<UserResponse>{
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                if(response.isSuccessful){
                    startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
                } else{
                    binding.tvLoginFailure.visibility = View.VISIBLE
                    binding.tvLoginFailure.text = "Register failed. Please check your data again."
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
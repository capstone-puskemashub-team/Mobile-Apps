package com.dicoding.capstone.ui.profile

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.dicoding.capstone.api.ApiService
import com.dicoding.capstone.api.Retro
import com.dicoding.capstone.databinding.FragmentProfileBinding
import com.dicoding.capstone.model.UserRequest
import com.dicoding.capstone.model.UserResponse
import com.dicoding.capstone.ui.login.LoginActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogout.setOnClickListener{
            signout()
        }
    }



    private fun signout() {
        val request = UserRequest()
        val retro = Retro().getRetroClientInstance().create(ApiService::class.java)
        retro.logout(request).enqueue(object: Callback<UserResponse>{
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                startActivity(Intent(requireContext(),LoginActivity::class.java))
                requireActivity().finish()
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                Log.e("Error", t.message.toString())
            }

        })
    }

}
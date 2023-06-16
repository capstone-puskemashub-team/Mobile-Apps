package com.dicoding.capstone.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.dicoding.capstone.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root

        val username = arguments?.getString("username")
        if (username != null) {
            val welcomeMessage = "Selamat datang $username"
            binding.tvUserName.text = welcomeMessage
        }

        binding.btnShapePasien.setOnClickListener{

        }
    }





    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
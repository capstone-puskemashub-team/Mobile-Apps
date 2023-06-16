package com.dicoding.capstone.ui.pasien

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.capstone.PasienAdapter
import com.dicoding.capstone.model.Pasien
import com.dicoding.capstone.R
import com.dicoding.capstone.ui.pasien.tambah.TambahPasienFragment

class PasienFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var btnTambahPasien: Button
    private lateinit var pasienAdapter: PasienAdapter

    private val pasienList: MutableList<Pasien> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val pasienViewModel =
            ViewModelProvider(this).get(PasienViewModel::class.java)

        val view = inflater.inflate(R.layout.fragment_pasien, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        btnTambahPasien = view.findViewById(R.id.btnTambahPasien)

        pasienAdapter = PasienAdapter(pasienList)
        recyclerView.adapter = pasienAdapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        btnTambahPasien.setOnClickListener {
            val fragment = TambahPasienFragment()
            val fragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container,fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        return view
    }


}
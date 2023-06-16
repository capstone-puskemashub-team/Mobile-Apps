package com.dicoding.capstone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.capstone.model.Pasien

class PasienAdapter(private val pasienList: List<Pasien>) :
    RecyclerView.Adapter<PasienAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNomorRM: TextView = view.findViewById(R.id.tv_noRm)
        val tvNama: TextView = view.findViewById(R.id.tv_nama)
        val tvTanggalMasuk: TextView = view.findViewById(R.id.tv_tanggalmasuk)
        val btnDetail: Button = view.findViewById(R.id.img_kursor)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pasien = pasienList[position]
        holder.tvNomorRM.text = pasien.nomorRM
        holder.tvNama.text = pasien.nama
        holder.tvTanggalMasuk.text = pasien.tanggalMasuk

        holder.btnDetail.setOnClickListener {
            // Navigasi ke fragment detail pasien
            // Kirim data pasien yang dipilih
        }
    }

    override fun getItemCount(): Int {
        return pasienList.size
    }
}
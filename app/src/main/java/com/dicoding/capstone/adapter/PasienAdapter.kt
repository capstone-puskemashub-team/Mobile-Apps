package com.dicoding.capstone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.capstone.model.Patient

class PasienAdapter() : RecyclerView.Adapter<PasienAdapter.ViewHolder>() {

    private val pasienList = ArrayList<Patient>()
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Patient)
    }

    fun setData(pasien: ArrayList<Patient>) {
        pasienList.clear()
        pasienList.addAll(pasien)
        notifyDataSetChanged()
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNomorRM: TextView = view.findViewById(R.id.tv_noRm)
        val tvNama: TextView = view.findViewById(R.id.tv_nama)
        val tvTanggalMasuk: TextView = view.findViewById(R.id.tv_tanggalmasuk)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pasien = pasienList[position]
        holder.tvNomorRM.text = pasien.NRM
        holder.tvNama.text = pasien.nama
        holder.tvTanggalMasuk.text = pasien.tanggalPemeriksaan

        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(pasienList[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return pasienList.size
    }
}
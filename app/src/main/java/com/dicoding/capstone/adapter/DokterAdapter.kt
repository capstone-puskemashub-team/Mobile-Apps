package com.dicoding.capstone

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.capstone.model.DoctorsItem

class DokterAdapter() : RecyclerView.Adapter<DokterAdapter.ViewHolder>() {

    private val dokterList = ArrayList<DoctorsItem>()
    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: DoctorsItem)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    fun setData(dokter: ArrayList<DoctorsItem>){
        dokterList.clear()
        dokterList.addAll(dokter)
        notifyDataSetChanged()
    }

    class ViewHolder(view: View)  : RecyclerView.ViewHolder(view) {
        val tvNomorRM: TextView = view.findViewById(R.id.tv_noRm)
        val tvNama: TextView = view.findViewById(R.id.tv_nama)
        val tvTanggalMasuk: TextView = view.findViewById(R.id.tv_tanggalmasuk)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pasien = dokterList[position]
        holder.tvNomorRM.text = pasien.nIK
        holder.tvNama.text = pasien.nama
        holder.tvTanggalMasuk.text = pasien.jadwalKerja.toString()

        holder.itemView.setOnClickListener{
            onItemClickCallback?.onItemClicked(dokterList[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return dokterList.size
    }

}
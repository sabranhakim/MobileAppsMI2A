package com.sabran.mobileappsmi2a.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sabran.mobileappsmi2a.R
import com.sabran.mobileappsmi2a.model.ModelBuku

class BukuAdapter(private val buku: List<ModelBuku>) :
    RecyclerView.Adapter<BukuAdapter.BukuAdapterHolder>() {

    class BukuAdapterHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtJudul: TextView = view.findViewById(R.id.txtJudul)
        val txtPenerbit: TextView = view.findViewById(R.id.txtPenerbit)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BukuAdapter.BukuAdapterHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_recycleview, parent, false)
        return BukuAdapterHolder(view)
    }


    override fun onBindViewHolder(holder: BukuAdapter.BukuAdapterHolder, position: Int) {
        holder.txtJudul.text = buku[position].judul
        holder.txtPenerbit.text = buku[position].penerbit
    }

    override fun getItemCount(): Int {
        return buku.size
    }

}
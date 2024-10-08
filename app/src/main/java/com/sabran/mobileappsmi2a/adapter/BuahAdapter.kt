package com.sabran.mobileappsmi2a.adapter

import android.content.Intent
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.sabran.mobileappsmi2a.DetailBuahActivity
import com.sabran.mobileappsmi2a.R
import com.sabran.mobileappsmi2a.RecycleBuahActivity
import com.sabran.mobileappsmi2a.model.ModelBuah

class BuahAdapter(
    val itemList: ArrayList<ModelBuah>,
    val getActivity : RecycleBuahActivity
) :
    RecyclerView.Adapter<BuahAdapter.MyViewHolder>()
{
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage : ImageView
        var itemNama : TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar) as ImageView
            itemNama = itemView.findViewById(R.id.nama) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycle_buah, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //set data ke widget
        holder.itemImage.setImageResource(itemList[position].gambar)
        holder.itemNama.setText(itemList[position].nama)

        //kita tambahkan intent ke detail
        holder.itemView.setOnClickListener{
            //intent
            //context atau this ----> getActivity
            val intent = Intent(getActivity, DetailBuahActivity::class.java)
            //kita put data untuk kita passed ke detail
            intent.putExtra("gambar", itemList[position].gambar)
            intent.putExtra("nama", itemList[position].nama)
            intent.putExtra("lokasi", itemList[position].lokasi)
            intent.putExtra("deskripsi", itemList[position].deskripsi.toString())
            //passed ke detail
            getActivity.startActivity(intent)
        }
    }


}
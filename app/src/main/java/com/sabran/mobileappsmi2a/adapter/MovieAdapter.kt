package com.sabran.mobileappsmi2a.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sabran.mobileappsmi2a.DetailMovieActivity
import com.sabran.mobileappsmi2a.R
import com.sabran.mobileappsmi2a.RecycleMovieActivity
import com.sabran.mobileappsmi2a.adapter.BuahAdapter.MyViewHolder
import com.sabran.mobileappsmi2a.model.ModelMovie

class MovieAdapter
    (
    val itemList: ArrayList<ModelMovie>,
    val getActivity : RecycleMovieActivity
            ) :
    RecyclerView.Adapter<MovieAdapter.MyViewHolder>()
{
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage : ImageView
        var itemNama : TextView
        var itemSinopsis: TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar1) as ImageView
            itemNama = itemView.findViewById(R.id.nama) as TextView
            itemSinopsis = itemView.findViewById(R.id.txtSinopsis) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycle_movie, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].gambar)
        holder.itemNama.setText(itemList[position].nama)
        holder.itemSinopsis.setText(itemList[position].sinopsis)

        //kita tambahkan intent
        holder.itemView.setOnClickListener{
            //intent
            //context atau this ----> getActivity
            val intent = Intent(getActivity, DetailMovieActivity::class.java)
            //kita put data untuk kita passed ke detail
            intent.putExtra("gambar", itemList[position].gambar)
            intent.putExtra("nama", itemList[position].nama)
            intent.putExtra("sinopsis", itemList[position].sinopsis)

            getActivity.startActivity(intent)
        }
    }
}
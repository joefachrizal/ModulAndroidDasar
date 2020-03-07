package com.android.cnd.latihandelapan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.cnd.latihandelapan.R
import com.android.cnd.latihandelapan.adapter.ListMhsAdapter.CardViewViewHolder
import com.android.cnd.latihandelapan.model.Mahasiswa
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*

/**
 * * Written by @JoeFachrizal 25/12/2019 4:20.
 */
class ListMhsAdapter(private val listMhs: ArrayList<Mahasiswa>) : RecyclerView.Adapter<CardViewViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_mhs, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        holder.nhs(listMhs[position])
    }

    override fun getItemCount(): Int {
        return listMhs.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun nhs(data: Mahasiswa) {
            val imgPhoto = itemView.findViewById(R.id.img_item_photo) as ImageView
            val tvName = itemView.findViewById(R.id.item_name) as TextView
            val tvDesc = itemView.findViewById(R.id.item_desc) as TextView

            Glide.with(itemView.context)
                    .load(data.photo)
                    .apply(RequestOptions().override(200, 200))
                    .into(imgPhoto)
            tvName.text = data.name
            tvDesc.text = data.description

            itemView.setOnClickListener {
                onItemClickCallback?.onItemClicked(listMhs[adapterPosition])
            }

        }


    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Mahasiswa)
    }

}
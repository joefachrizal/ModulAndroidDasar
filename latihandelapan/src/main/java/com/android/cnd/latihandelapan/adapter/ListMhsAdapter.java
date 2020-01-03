package com.android.cnd.latihandelapan.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.cnd.latihandelapan.R;
import com.android.cnd.latihandelapan.model.Mahasiswa;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

/**
 * * Written by @JoeFachrizal 25/12/2019 4:20.
 **/
public class ListMhsAdapter extends RecyclerView.Adapter<ListMhsAdapter.CardViewViewHolder> {
    private final ArrayList<Mahasiswa> listMhs;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListMhsAdapter(ArrayList<Mahasiswa> listMhs) {
        this.listMhs = listMhs;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_mhs, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        Mahasiswa mahasiswa = listMhs.get(position);

        Glide.with(holder.itemView.getContext())
                .load(mahasiswa.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(mahasiswa.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listMhs.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMhs.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imgPhoto;
        private final TextView tvName;

        CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.item_name);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Mahasiswa data);
    }
}

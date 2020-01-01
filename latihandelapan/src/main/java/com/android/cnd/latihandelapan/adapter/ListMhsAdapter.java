package com.android.cnd.latihandelapan.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * * Written by @JoeFachrizal 25/12/2019 4:20.
 **/
public class ListMhsAdapter extends RecyclerView.Adapter<ListMhsAdapter.CardViewViewHolder> {

    @NonNull
    @Override
    public ListMhsAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListMhsAdapter.CardViewViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

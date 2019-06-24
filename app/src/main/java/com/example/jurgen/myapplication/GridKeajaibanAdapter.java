package com.example.jurgen.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridKeajaibanAdapter extends
        RecyclerView.Adapter<GridKeajaibanAdapter.GridViewHolder> {

    private Context context;
    private ArrayList<Keajaiban> listkeajaiban;

    public ArrayList<Keajaiban> getListkeajaiban() {
        return listkeajaiban;
    }

    public void setListkeajaiban(ArrayList<Keajaiban> listkeajaiban) {
        this.listkeajaiban = listkeajaiban;
    }

    public GridKeajaibanAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public GridKeajaibanAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_keajaiban, parent,
                        false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridKeajaibanAdapter.GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListkeajaiban().get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListkeajaiban().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}

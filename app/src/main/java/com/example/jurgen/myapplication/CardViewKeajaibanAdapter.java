package com.example.jurgen.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewKeajaibanAdapter extends
        RecyclerView.Adapter<CardViewKeajaibanAdapter.CardViewHolder>{
    private Context context;
    private ArrayList<Keajaiban> listkeajaiban;

    private ArrayList<Keajaiban> getListkeajaiban() {
        return listkeajaiban;
    }

    public void setListkeajaiban(ArrayList<Keajaiban> listkeajaiban) {
        this.listkeajaiban = listkeajaiban;
    }

    public CardViewKeajaibanAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view =
                LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_keajaiban,
                        viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder cardViewViewHolder, int i) {
        Keajaiban p = getListkeajaiban().get(i);

        Glide.with(context)
                .load(p.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);

        cardViewViewHolder.tvName.setText(p.getName());
        cardViewViewHolder.tvRemarks.setText(p.getRemarks());

        cardViewViewHolder.btnFavorite.setOnClickListener(new
        CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Favorite"+
                getListkeajaiban().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));

        cardViewViewHolder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share"+getListkeajaiban().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));

    }

    @Override
    public int getItemCount() {
        return getListkeajaiban().size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnFavorite, btnShare;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }

}

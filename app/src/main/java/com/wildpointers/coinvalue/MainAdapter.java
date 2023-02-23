package com.wildpointers.coinvalue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private Context context;
    private List<Model> items;

    public MainAdapter(Context context, List<Model> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {

        Model item = items.get(position);
        holder.coinName.setText(item.getName());
        holder.coinValue.setText("$" + String.valueOf(item.getCurrent_price()));
        Glide.with(context).load(item.getImage()).into(holder.coinImage);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        ImageView coinImage;
        TextView coinName, coinValue;
        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            coinImage = itemView.findViewById(R.id.coin_image);
            coinName = itemView.findViewById(R.id.coin_name);
            coinValue = itemView.findViewById(R.id.coin_value);
        }
    }
}

package com.example.laptopmarket.nommovieapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Laptop Market on 10/24/2016.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<MovieModel> mItemModels;
    private Context mContext;
    public Adapter(Context context, List<MovieModel> mItemModels) {
      this.mItemModels = mItemModels;
        mContext = context;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mimageView;

        public ViewHolder(View itemView) {
            super(itemView);
            mimageView = (ImageView) itemView.findViewById(R.id.movie_image);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        ViewHolder vh=new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Picasso.with(mContext).load(mItemModels.get(position).getMovieImageViewUrl()).into(holder.mimageView);
        Log.i("URL", "http://image.tmdb.org/t/p/" + "w185" + mItemModels.get(position).getMovieImageViewUrl());
    }
    @Override
    public int getItemCount() {
        return mItemModels.size();
    }

    /**
     * Created by Laptop Market on 10/29/2016.
     */

}


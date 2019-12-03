package com.example.lutto;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RestaurantAdaptor extends RecyclerView.Adapter<RestaurantAdaptor.ViewHolder> {

    private List<RestaurantModel> restaurantModelList;

    public RestaurantAdaptor(List<RestaurantModel> restaurantModelList) {
        this.restaurantModelList = restaurantModelList;
    }

    @NonNull
    @Override
    public RestaurantAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext( ) ).inflate( R.layout.restaurant_list, parent, false );
        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantAdaptor.ViewHolder holder, int position) {
        int resource = restaurantModelList.get( position ).getRestImage( );
        String name = restaurantModelList.get( position ).getRestName( );


        holder.setRestImage( resource );
        holder.setRestName( name );


    }

    @Override
    public int getItemCount() {
        return restaurantModelList.size( );
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView restImage;
        private TextView restName;


        public ViewHolder(@NonNull View itemView) {
            super( itemView );

            restImage = itemView.findViewById( R.id.rest_image );
            restName = itemView.findViewById( R.id.rest_name );


        }

        private void setRestImage(int resaurce) {
            restImage.setImageResource( resaurce );
        }

        private void setRestName(String name) {
            restName.setText( name );



        }
    }
}
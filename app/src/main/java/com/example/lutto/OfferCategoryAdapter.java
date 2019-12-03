package com.example.lutto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class OfferCategoryAdapter extends RecyclerView.Adapter<OfferCategoryAdapter.ViewHolder> {

    private List<OfferCategoryModel> offerCategoryModelList;

    public OfferCategoryAdapter(List<OfferCategoryModel> offerCategoryModelList) {
        this.offerCategoryModelList = offerCategoryModelList;
    }

    @NonNull
    @Override
    public OfferCategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext( ) ).inflate( R.layout.offer_category_item, parent, false );


        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull OfferCategoryAdapter.ViewHolder holder, int position) {
        String resource = offerCategoryModelList.get( position ).getOfferCategoryImage( );

        holder.setOfferCategoryImage( resource );

    }

    @Override
    public int getItemCount() {
        return offerCategoryModelList.size( );
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView offerCategoryImage;


        public ViewHolder(@NonNull View itemView) {
            super( itemView );


            offerCategoryImage = itemView.findViewById( R.id.offerCategoryImage );
        }

        private void setOfferCategoryImage(String imageUrl) {

            if (!imageUrl.equals( "null" )) {
                Glide.with( itemView.getContext( ) ).load( imageUrl ).apply( new RequestOptions( ).placeholder( R.mipmap.ic_launcher ) ).into( offerCategoryImage );
            }
        }

    }

}

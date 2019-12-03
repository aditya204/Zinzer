package com.example.lutto;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VerticalProductAdaptor extends RecyclerView.Adapter<VerticalProductAdaptor.ViewHolder> {

    private List<VerticalProductModel>verticalProductModels;

    public VerticalProductAdaptor(List<VerticalProductModel> verticalProductModels) {
        this.verticalProductModels = verticalProductModels;
    }

    @NonNull
    @Override
    public VerticalProductAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.horizontal_scroll_item_layout ,parent,false);



        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalProductAdaptor.ViewHolder holder, int position) {
        String name= verticalProductModels.get( position ).getProductName();
        String category= verticalProductModels.get( position).getProductCategory();
        String description= verticalProductModels.get( position).getProductDescription();
        String rating= String.valueOf( verticalProductModels.get( position ).getProductRating() );
        int resource=verticalProductModels.get( position ).getProductImmage();

        holder.setProductImage( resource );
        holder.setProductName( name );
        holder.setProductCategory( category );
        holder.setProductRating(rating);
        holder.setProductDescription( description );
    }

    @Override
    public int getItemCount() {
        return verticalProductModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private ImageView productImage;
        private TextView productName;
        private TextView productCategory;
        private TextView productDescription;
        private TextView productRating;


        public ViewHolder(@NonNull View itemView) {
            super( itemView );

            productImage=itemView.findViewById( R.id.horizontal_scroll_item_layout_image );
            productName=itemView.findViewById( R.id.horizontal_scroll_item_layout_name );
            productCategory=itemView.findViewById( R.id.horizontal_scroll_item_layout_categoryName );
            productDescription=itemView.findViewById( R.id.horizontal_scroll_item_layout_description );
            productRating=itemView.findViewById( R.id.horizontal_scroll_item_layout_rating );


        }

        private void setProductImage(int resource){
            productImage.setImageResource( resource );
        }

        private void setProductName(final String name){
            productName.setText( name );



        }
        private void setProductCategory(String category){
            productCategory.setText( category );
        }

        private void setProductDescription(String description){
            productDescription.setText( description );


        }

        private void setProductRating(String rating){
            productRating.setText( rating );
        }
    }
}

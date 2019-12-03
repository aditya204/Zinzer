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

public class CategoryRestaurntAdaptor extends RecyclerView.Adapter<CategoryRestaurntAdaptor.ViewHolder> {

    private List<CategoryRestaurantModel> categoryRestaurantModelList;

    public CategoryRestaurntAdaptor(List<CategoryRestaurantModel> categoryRestaurantModelList) {
        this.categoryRestaurantModelList = categoryRestaurantModelList;
    }

    @NonNull
    @Override
    public CategoryRestaurntAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater .from( parent.getContext() ).inflate( R.layout.category_restaurant_item,parent,false );
        return new ViewHolder( view ) ;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryRestaurntAdaptor.ViewHolder holder, int position) {
        int resource=categoryRestaurantModelList.get( position ).getCategoryRestImage();
        String name=categoryRestaurantModelList.get( position ).getCategoryRestName();
        String category=categoryRestaurantModelList.get( position ).getCategoryRestcategory();
        String offer=categoryRestaurantModelList.get( position ).getCategoryRestOffer();
        String notAcceptingOrder=categoryRestaurantModelList.get( position ).getCategoryRest_not_accepting_orders();
        String rating=categoryRestaurantModelList.get( position ).getCategoryRestRating();


        holder.setCategoryRestImage(resource);
        holder.setCategoryRestName( name );
        holder.setCategoryRestcategory( category );
        holder.setCategoryRestOffer( offer );
        holder.setCategoryRest_not_accepting_orders( notAcceptingOrder );
        holder.setCategoryRestRating( rating );

    }

    @Override
    public int getItemCount() {
        return categoryRestaurantModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView categoryRestName,categoryRestcategory,categoryRestOffer,categoryRest_not_accepting_orders,categoryRestRating;
        private ImageView categoryRestImage;


        public ViewHolder(@NonNull View itemView) {
            super( itemView );

            categoryRestName=itemView.findViewById( R.id.categoryRestName );
            categoryRestcategory=itemView.findViewById( R.id.categoryRestcategory );
            categoryRest_not_accepting_orders=itemView.findViewById( R.id.categoryRest_not_accepting_orders );
            categoryRestOffer=itemView.findViewById( R.id.categoryRestOffer );
            categoryRestRating=itemView.findViewById( R.id.categoryRestRating );
            categoryRestImage=itemView.findViewById( R.id.categoryRestImage );



        }

        private void setCategoryRestName(String name) {
            categoryRestName.setText( name );
            itemView.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {

                    Intent intent= new Intent( itemView.getContext(),restaurant_menu_activity.class );
                    itemView.getContext().startActivity( intent );

                }
            } );



        }

        public void setCategoryRestcategory(String category) {
            categoryRestcategory.setText( category );
        }

        public void setCategoryRestOffer(String Offer) {
            categoryRestOffer.setText( Offer );
        }

        public void setCategoryRest_not_accepting_orders(String not_accepting_orders) {
            categoryRest_not_accepting_orders.setText( not_accepting_orders );
        }

        public void setCategoryRestRating(String Rating) {
            this.categoryRestRating.setText( Rating );
        }

        public void setCategoryRestImage(int image) {
            categoryRestImage.setImageResource( image );
        }
    }

}

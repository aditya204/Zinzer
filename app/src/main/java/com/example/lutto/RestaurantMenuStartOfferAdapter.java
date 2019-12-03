package com.example.lutto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RestaurantMenuStartOfferAdapter extends RecyclerView.Adapter<RestaurantMenuStartOfferAdapter.ViewHolder> {

    List<RestaurantMenuStartOfferModel> restaurantMenuStartOfferModelList;



    public RestaurantMenuStartOfferAdapter(List<RestaurantMenuStartOfferModel> restaurantMenuStartOfferModelList) {
        this.restaurantMenuStartOfferModelList = restaurantMenuStartOfferModelList;
    }


    @NonNull
    @Override
    public RestaurantMenuStartOfferAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.restaurantmenu_start_offer_item ,parent,false);



        return new RestaurantMenuStartOfferAdapter.ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantMenuStartOfferAdapter.ViewHolder holder, int position) {

        String offerOn= restaurantMenuStartOfferModelList.get( position ).getOfferOn();
        String offerAmount= restaurantMenuStartOfferModelList.get( position ).getOfferAmmount();

        holder.setOfferAmount( offerAmount );
        holder.setOfferOn( offerOn );





    }

    @Override
    public int getItemCount() {
        return restaurantMenuStartOfferModelList.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView offerOn;
        private TextView offerAmount;

        public ViewHolder(@NonNull View itemView) {
            super( itemView );

            offerOn=itemView.findViewById( R.id.restaurantMenuStartOfferOn );
            offerAmount=itemView.findViewById( R.id.restaurantMenuStartOfferAmount );

        }

        private void setOfferOn (String on){
            offerOn.setText( on );
        }
        private void setOfferAmount(String amount){
            offerAmount.setText( amount );
        }



    }




}

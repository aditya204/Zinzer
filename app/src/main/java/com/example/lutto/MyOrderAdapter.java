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

public class MyOrderAdapter extends RecyclerView.Adapter<MyOrderAdapter.ViewHolder> {

    private List<MyOrderModel> myOrderModelList;

    public MyOrderAdapter(List<MyOrderModel> myOrderModelList) {
        this.myOrderModelList = myOrderModelList;
    }

    @NonNull
    @Override
    public MyOrderAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.my_order_layout_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOrderAdapter.ViewHolder holder, int position) {

        String productName=myOrderModelList.get( position ).getMyOrderProductName();
        String restaurantName=myOrderModelList.get( position ).getMyOrderRestaurantName();
        String orderId=myOrderModelList.get( position ).getMyOrderId();

        holder.setMyorderId( orderId );
        holder.setMyOrderProduct( productName );
        holder.setMyorderRestaurant( restaurantName );
        holder.setStar();

    }

    @Override
    public int getItemCount() {
        return myOrderModelList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView myOrderProduct;
        private TextView myorderRestaurant;
        private TextView myorderId;
        private ImageView star1;
        private ImageView star2;
        private ImageView star3;
        private ImageView star4;
        private ImageView star5;
        private ImageView star1green;
        private ImageView star2green;
        private ImageView star3green;
        private ImageView star4green;
        private ImageView star5green;






        public ViewHolder(@NonNull View itemView) {
            super( itemView );

            myorderId=itemView.findViewById( R.id.myOrder_orderid );
            myorderRestaurant=itemView.findViewById( R.id.myOrderRestaurantName );
            myOrderProduct=itemView.findViewById( R.id.myOrderProductName );
            star1=itemView.findViewById( R.id.myOrder_star1 );
            star2=itemView.findViewById( R.id.myOrder_star2 );
            star3=itemView.findViewById( R.id.myOrder_star3 );
            star4=itemView.findViewById( R.id.myOrder_star4 );
            star5=itemView.findViewById( R.id.myOrder_star5 );
            star1green=itemView.findViewById( R.id.myOrder_star1_green );
            star2green=itemView.findViewById( R.id.myOrder_star2_green );
            star3green=itemView.findViewById( R.id.myOrder_star3_green );
            star4green=itemView.findViewById( R.id.myOrder_star4_green );
            star5green=itemView.findViewById( R.id.myOrder_star5_green );
        }

        public void setMyOrderProduct(String name){
            myOrderProduct.setText( name );
            myOrderProduct.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent( itemView.getContext(),OrderDetails.class );
                    itemView.getContext().startActivity( intent );
                }
            } );
        }
        public void setMyorderRestaurant(String name){
            myorderRestaurant.setText( name );
            myorderRestaurant.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent( itemView.getContext(),OrderDetails.class );
                    itemView.getContext().startActivity( intent );
                }
            } );

        }
        public void setMyorderId(String id){
            myorderId.setText( id );
            myorderId.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent( itemView.getContext(),OrderDetails.class );
                    itemView.getContext().startActivity( intent );
                }
            } );
        }


        public void setStar(){

            star1green.setVisibility( View.GONE );
            star2green.setVisibility( View.GONE );
            star3green.setVisibility( View.GONE );
            star4green.setVisibility( View.GONE );
            star5green.setVisibility( View.GONE );

            star1.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {
                    star1.setVisibility( View.GONE );
                    star1green.setVisibility( View.VISIBLE );
                }
            } );
            star2.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {
                    star1.setVisibility( View.GONE );
                    star1green.setVisibility( View.VISIBLE );
                    star2.setVisibility( View.GONE );
                    star2green.setVisibility( View.VISIBLE );
                }
            } );
            star3.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {
                    star1.setVisibility( View.GONE );
                    star1green.setVisibility( View.VISIBLE );
                    star2.setVisibility( View.GONE );
                    star2green.setVisibility( View.VISIBLE );
                    star3.setVisibility( View.GONE );
                    star3green.setVisibility( View.VISIBLE );
                }
            } );
            star4.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {
                    star1.setVisibility( View.GONE );
                    star1green.setVisibility( View.VISIBLE );
                    star2.setVisibility( View.GONE );
                    star2green.setVisibility( View.VISIBLE );
                    star3.setVisibility( View.GONE );
                    star3green.setVisibility( View.VISIBLE );
                    star4.setVisibility( View.GONE );
                    star4green.setVisibility( View.VISIBLE );
                }
            } );
            star5.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {
                    star1.setVisibility( View.GONE );
                    star1green.setVisibility( View.VISIBLE );
                    star2.setVisibility( View.GONE );
                    star2green.setVisibility( View.VISIBLE );
                    star3.setVisibility( View.GONE );
                    star3green.setVisibility( View.VISIBLE );
                    star4.setVisibility( View.GONE );
                    star4green.setVisibility( View.VISIBLE );
                    star5.setVisibility( View.GONE );
                    star5green.setVisibility( View.VISIBLE );
                }
            } );

            star5green.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {

                    star5.setVisibility( View.VISIBLE );
                    star5green.setVisibility( View.GONE );
                }
            } );
            star4green.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {

                    star5.setVisibility( View.VISIBLE );
                    star5green.setVisibility( View.GONE );
                    star4.setVisibility( View.VISIBLE );
                    star4green.setVisibility( View.GONE );
                }
            } );
            star3green.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {

                    star5.setVisibility( View.VISIBLE );
                    star5green.setVisibility( View.GONE );
                    star4.setVisibility( View.VISIBLE );
                    star4green.setVisibility( View.GONE );
                    star3.setVisibility( View.VISIBLE );
                    star3green.setVisibility( View.GONE );
                }
            } );
            star2green.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {

                    star5.setVisibility( View.VISIBLE );
                    star5green.setVisibility( View.GONE );
                    star4.setVisibility( View.VISIBLE );
                    star4green.setVisibility( View.GONE );
                    star3.setVisibility( View.VISIBLE );
                    star3green.setVisibility( View.GONE );
                    star2.setVisibility( View.VISIBLE );
                    star2green.setVisibility( View.GONE );

                }
            } );

            star1green.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {

                    star5.setVisibility( View.VISIBLE );
                    star5green.setVisibility( View.GONE );
                    star4.setVisibility( View.VISIBLE );
                    star4green.setVisibility( View.GONE );
                    star3.setVisibility( View.VISIBLE );
                    star3green.setVisibility( View.GONE );
                    star2.setVisibility( View.VISIBLE );
                    star2green.setVisibility( View.GONE );
                    star1.setVisibility( View.VISIBLE );
                    star1green.setVisibility( View.GONE );

                }
            } );



        }
    }
}

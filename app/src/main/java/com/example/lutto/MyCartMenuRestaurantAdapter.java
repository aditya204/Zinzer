package com.example.lutto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MyCartMenuRestaurantAdapter extends RecyclerView.Adapter<MyCartMenuRestaurantAdapter.ViewHolder> {

    private List<MyCartMenuRestaurantModel>myCartMenuRestaurantModelList;
    private int i=0;

    public MyCartMenuRestaurantAdapter(List<MyCartMenuRestaurantModel> myCartMenuRestaurantModelList) {
        this.myCartMenuRestaurantModelList = myCartMenuRestaurantModelList;
    }

    @NonNull
    @Override
    public MyCartMenuRestaurantAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.my_cart_menu_restaurant_item,parent,false );


        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull MyCartMenuRestaurantAdapter.ViewHolder holder, int position) {

        String productName=myCartMenuRestaurantModelList.get( position ).getMyCartMenuRestaurantproductName();
        String productPrice=myCartMenuRestaurantModelList.get( position ).getMyCartMenuRestaurantProductPrice();

        String quantity=myCartMenuRestaurantModelList.get( position ).getMyCartMenuRestaurantProductQuantity();
        String totalPrice=myCartMenuRestaurantModelList.get( position ).getMyCartMenuRestaurantTotalPrice();
        String add=myCartMenuRestaurantModelList.get( position ).getAdd();
        String noCount=myCartMenuRestaurantModelList.get( position ).getNoCount();


        holder.setProductName( productName );
        holder.setProductPrice( productPrice );
        holder.setProductQuantity( quantity );
        holder.setMyCartMenuRestaurantTotalPrice( totalPrice );
        holder.setAdd( add );
        holder.setNoCount( noCount );

    }

    @Override
    public int getItemCount() {
        return myCartMenuRestaurantModelList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView MyCartMenuRestaurantproductName;
        private TextView MyCartMenuRestaurantProductPrice;
        private TextView MyCartMenuRestaurantProductQuantity;
        private TextView MyCartMenuRestaurantTotalPrice;
        private TextView add;
        private TextView addProduct;
        private TextView subProduct;
        private TextView noCount;
        private LinearLayout noCountLayout;
        public ViewHolder(@NonNull View itemView) {
            super( itemView );

            MyCartMenuRestaurantproductName=itemView.findViewById( R.id.myCartMenuRestaurantItemName );
            MyCartMenuRestaurantProductPrice=itemView.findViewById( R.id.myCartMenuRestaurantItemPrice );
            MyCartMenuRestaurantProductQuantity=itemView.findViewById( R.id.myCartMenuRestaurantItemQuantity );
            MyCartMenuRestaurantTotalPrice=itemView.findViewById( R.id.myCartMenuRestaurantItemTotalPrice );
            add=itemView.findViewById( R.id.myCartMenuRestaurantItemadd );
            addProduct=itemView.findViewById( R.id.myCartMenuRestaurantItemnoCountAdd );
            subProduct=itemView.findViewById( R.id.myCartMenuRestaurantItemnoCountSubtract );
            noCountLayout=itemView.findViewById( R.id.myCartMenuRestaurantItemnoCountLayout );
            noCount=itemView.findViewById( R.id.myCartMenuRestaurantItemnoCount );
        }

        public void setNoCount(String  itemCount) {
            noCount.setText( itemCount );


            addProduct.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {
                    i++;
                    noCount.setText( Integer.toString(i) );
                }
            } );
            subProduct.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {
                    if(i>1){
                        i--;
                        noCount.setText(  Integer.toString(i) );


                    }else{
                        noCountLayout.setVisibility( View.INVISIBLE );
                        add.setVisibility( View.VISIBLE );
                    }
                }
            } );
        }


        public void setProductName (String name){
            MyCartMenuRestaurantproductName.setText( name );
        }

        public void setProductPrice (String price){
            MyCartMenuRestaurantProductPrice.setText( price );
        }

        public void setProductQuantity (String quantity){
            MyCartMenuRestaurantProductQuantity.setText( quantity );
        }
        private void setMyCartMenuRestaurantTotalPrice(String totalPrice){
            MyCartMenuRestaurantTotalPrice.setText( totalPrice );
        }
        public void setAdd (String add1){
            add.setText( "ADD" );
            add.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {
                    i=1;
                    noCountLayout.setVisibility( View.VISIBLE );

                    add.setVisibility( View.INVISIBLE );
                    noCount.setText( "1" );
                }
            } );
        }
    }
}

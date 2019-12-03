package com.example.lutto;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    public int i=0;
    public LinearLayout linearLayout;


    private List<MenuModel> menuModelList;

    public MenuAdapter(List<MenuModel> menuModelList) {
        this.menuModelList = menuModelList;
    }



    @NonNull
    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( parent.getContext() ).inflate( R.layout.menu_item,parent,false );
        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String productName= menuModelList.get( position ).getProductName();
        String productPrice=menuModelList.get( position ).getProductPrice();
        String productQuantity=menuModelList.get(position).getProductQuantity();
        String add=menuModelList.get( position ).getAdd();
        String veg=menuModelList.get( position ).getVeg();
        String noCount=menuModelList.get( position ).getNoCount();

        holder.setProductName( productName );
        holder.setProductPrice( productPrice );
        holder.setProductQuantity( productQuantity );
        holder.setAdd( add );
        holder.setVeg( veg );
        holder.setNoCount( noCount );

    }



    @Override
    public int getItemCount() {
        return menuModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView productName;
        private TextView productPrice;
        private TextView productQuantity;
        public TextView add;
        private TextView veg;
        private TextView addProduct;
        private TextView subProduct;
        private TextView noCount;
        private LinearLayout noCountLayout;





        public ViewHolder(@NonNull View itemView) {
            super( itemView );



            productName=itemView.findViewById( R.id.productName );
            productPrice=itemView.findViewById( R.id.productPrice );
            productQuantity=itemView.findViewById( R.id.productQuantity );
            veg=itemView.findViewById( R.id.veg_nonveg );
            add=itemView.findViewById( R.id.add );
            noCountLayout=itemView.findViewById( R.id.noCountLayout );
            addProduct=itemView.findViewById( R.id.noCountAdd );
            subProduct=itemView.findViewById( R.id.noCountSubtract );
            noCount=itemView.findViewById( R.id.noCount );

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
            productName.setText( name );
        }

        public void setProductPrice (String price){
            productPrice.setText( price );
        }

        public void setProductQuantity (String quantity){
            productQuantity.setText( quantity );
        }

        @SuppressLint("ResourceAsColor")
        public void setVeg (String veg1){
            veg.setText( veg1 );
            if ( veg1=="NONVEG" || veg1=="nonveg"){
                veg.setTextColor( Color.parseColor( "#D81B60" ) );
            }else {
                veg.setTextColor( Color.parseColor( "#22BB48" ) ) ;
            }
        }

        public void setAdd (String add1){
            add.setText( add1 );
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

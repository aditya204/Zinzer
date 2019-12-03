package com.example.lutto;

import android.app.Dialog;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class MyCartFragmentAdapter extends RecyclerView.Adapter {

    private List<MyCarrtFragmentModel> myCarrtFragmentModelList;

    public MyCartFragmentAdapter(List<MyCarrtFragmentModel> myCarrtFragmentModelList) {
        this.myCarrtFragmentModelList = myCarrtFragmentModelList;
    }

    @Override
    public int getItemViewType(int position) {
        switch (myCarrtFragmentModelList.get( position ).getType( )) {
            case 0:
                return MyCarrtFragmentModel.MENU_RESTAURANT;
            case 1:
                return MyCarrtFragmentModel.BILL;
            case 2:
                return MyCarrtFragmentModel.ADDRESS;
            default:
                return -1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case MyCarrtFragmentModel.MENU_RESTAURANT:
                View menuRestaurant_view = LayoutInflater.from( parent.getContext( ) ).inflate( R.layout.activity_my_cart__menu__restauerant_, parent, false );
                return new menuRestaurantViewHolder( menuRestaurant_view );
            case MyCarrtFragmentModel.BILL:
                View bill_view = LayoutInflater.from( parent.getContext( ) ).inflate( R.layout.activity_mycart_bill, parent, false );
                return new billViewHolder( bill_view );

            case MyCarrtFragmentModel.ADDRESS:
                View address_view = LayoutInflater.from( parent.getContext( ) ).inflate( R.layout.activity_my_cart_address, parent, false );
                return new addressViewHolder( address_view );

            default:
                return null;
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (myCarrtFragmentModelList.get( position ).getType( )) {
            case MyCarrtFragmentModel.MENU_RESTAURANT:
                String name = myCarrtFragmentModelList.get( position ).getCartRestaurantName( );
                String category = myCarrtFragmentModelList.get( position ).getCartRestaurantcategory( );
                int resource = myCarrtFragmentModelList.get( position ).getCartRestaurantImage( );
                List<MyCartMenuRestaurantModel> myCartMenuRestaurantModelList = myCarrtFragmentModelList.get( position ).getMyCartMenuRestaurantModelList( );

                ((menuRestaurantViewHolder) holder).setCartRecyclerView( myCartMenuRestaurantModelList );
                ((menuRestaurantViewHolder) holder).setCartRestaurantCategory( category );
                ((menuRestaurantViewHolder) holder).setCartRestaurantImage( resource );
                ((menuRestaurantViewHolder) holder).setCartRestaurantName( name );
                break;

            case MyCarrtFragmentModel.BILL:
                String itemPrice = myCarrtFragmentModelList.get( position ).getItemTotalPrice( );
                String taxPrice = myCarrtFragmentModelList.get( position ).getTaxPrice( );
                String grandPrice = myCarrtFragmentModelList.get( position ).getGrandTotalPrice( );

                ((billViewHolder) holder).setGrandPrice( grandPrice );
                ((billViewHolder) holder).setItemPrice( itemPrice );
                ((billViewHolder) holder).setTaxPrice( taxPrice );
                break;
            case MyCarrtFragmentModel.ADDRESS:

                String address= myCarrtFragmentModelList.get( position ).getAddress();
                String changeAddress=myCarrtFragmentModelList.get( position ).getAddressChange();


                ((addressViewHolder) holder).setChangeAddress(changeAddress);

                break;

        }


    }

    @Override
    public int getItemCount() {
        return myCarrtFragmentModelList.size( );
    }


    public class menuRestaurantViewHolder extends RecyclerView.ViewHolder {

        private TextView cartRestaurantName;
        private TextView cartRestaurantCategory;
        private ImageView cartRestaurantImage;
        private EditText cartrequestRestaurnat;
        private RecyclerView cartRecyclerView;

        public menuRestaurantViewHolder(@NonNull View itemView) {
            super( itemView );

            cartRestaurantName = itemView.findViewById( R.id.myCartMenuRestaurantName );
            cartRestaurantImage = itemView.findViewById( R.id.myCartMenuRestaurantImage );
            cartRecyclerView = itemView.findViewById( R.id.myCartMenuRestaurantRecycler );
            cartrequestRestaurnat = itemView.findViewById( R.id.myCartMenuRestaurantRequest );
            cartRestaurantCategory = itemView.findViewById( R.id.myCartMenuRestaurantCategory );

        }

        private void setCartRecyclerView(List<MyCartMenuRestaurantModel> myCartMenuRestaurantModelList) {

            MyCartMenuRestaurantAdapter myCartMenuRestaurantAdapter = new MyCartMenuRestaurantAdapter( myCartMenuRestaurantModelList );
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager( itemView.getContext( ) );
            linearLayoutManager.setOrientation( RecyclerView.VERTICAL );
            cartRecyclerView.setLayoutManager( linearLayoutManager );
            cartRecyclerView.setAdapter( myCartMenuRestaurantAdapter );
            myCartMenuRestaurantAdapter.notifyDataSetChanged( );
        }

        private void setCartRestaurantName(String name) {
            cartRestaurantName.setText( name );
        }

        private void setCartRestaurantImage(int resource) {
            cartRestaurantImage.setImageResource( resource );
        }

        private void setCartRestaurantCategory(String Category) {
            cartRestaurantCategory.setText( Category );
        }

        private void setCartrequestRestaurnat() {
            cartrequestRestaurnat.getText( );
        }
    }

    public class billViewHolder extends RecyclerView.ViewHolder {

        private TextView itemPrice;
        private TextView TaxPrice;
        private TextView grandPrice;

        public billViewHolder(@NonNull View itemView) {
            super( itemView );

            itemPrice = itemView.findViewById( R.id.itemTotalPrice );
            TaxPrice = itemView.findViewById( R.id.taxChargesPrice );
            grandPrice = itemView.findViewById( R.id.grandTotalPrice );
        }

        private void setItemPrice(String itemPrice1) {
            itemPrice.setText( itemPrice1 );
        }

        private void setTaxPrice(String taxPrice) {
            TaxPrice.setText( taxPrice );
        }

        private void setGrandPrice(String grandPrice1) {
            grandPrice.setText( grandPrice1 );
        }

    }

    public class addressViewHolder extends RecyclerView.ViewHolder{

        private TextView address;
        private TextView changeAddress;

        public addressViewHolder(@NonNull View itemView) {
            super( itemView );

            address=itemView.findViewById( R.id.myCartAddress );
            changeAddress=itemView.findViewById( R.id.myCartAddressChange );
        }

        //private void setAddress(String Address){
        //    address.setText( Address );
        //}

        private void setChangeAddress(String ChangeAddress){
            changeAddress.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {
                    final Dialog address_dialog=new Dialog( itemView.getContext() );
                    address_dialog.setContentView( R.layout.address_diallogs );
                    address_dialog.getWindow().setLayout( ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT );
                    address_dialog.setCancelable( false );
                    final EditText roomNo=address_dialog.findViewById( R.id.addressDialogRoomNo );
                    final EditText hostleName=address_dialog.findViewById( R.id.addressDialogHostelName );
                    final EditText addressReq=address_dialog.findViewById( R.id.addressDialogAddressRequired );
                    Button cancel=address_dialog.findViewById( R.id.addressDialogCancel );
                    Button ok=address_dialog.findViewById( R.id.addressDialogOk);

                    cancel.setOnClickListener( new View.OnClickListener( ) {
                        @Override
                        public void onClick(View view) {
                            address_dialog.dismiss();
                        }
                    } );
                    ok.setOnClickListener( new View.OnClickListener( ) {



                        @Override
                        public void onClick(View view) {

                            address.setText( roomNo.getText()+","+hostleName.getText()+","+addressReq.getText() );





                            address_dialog.dismiss();
                        }
                    } );
                    address_dialog.show();


                }
            } );




        }
    }

}

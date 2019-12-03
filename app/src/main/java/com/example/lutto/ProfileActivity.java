package com.example.lutto;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;


public class ProfileActivity extends AppCompatActivity {

    private LinearLayout myAccountchild;
    public String getRoom,getaddress,getHostel;
    private TextView editProfile_txt;
    private ImageView myAccountArrowDown;
    private ImageView myAccountArrowUp;
    private LinearLayout myOrderLayout,myAccountbottomLayout;
    private LinearLayout ChangeAddressLayout;
    private Toolbar toolbar;


    private ImageView home,goOut,cart,account;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_profile );

        myAccountchild=findViewById( R.id.myAccountChildLayout );
        editProfile_txt=findViewById( R.id.editProfile_txt );
        myAccountArrowDown=findViewById( R.id.myAccountArrowDown );
        myAccountArrowUp=findViewById( R.id.myAccountArrowUp );
        myOrderLayout=findViewById( R.id.myOrderLayout );
        myAccountbottomLayout=findViewById( R.id.myAccountBottomQuickBar );
        home=findViewById( R.id.myAccountHome);
        goOut=findViewById( R.id.myAccountGoOut );
        cart=findViewById( R.id.myAccountCart );
        account=findViewById( R.id.myAccountAccount );
        toolbar=findViewById( R.id.toolbar_profile );
        ChangeAddressLayout=findViewById( R.id.myAccountChangeAddressLayout );


        toolbar.setTitle( "My Profile" );
        setSupportActionBar( toolbar );
        getSupportActionBar().setDisplayShowHomeEnabled( true );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );


        myAccountArrowDown.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                myAccountchild.setVisibility( View.VISIBLE );
                myAccountArrowDown.setVisibility( View.GONE);
                myAccountArrowUp.setVisibility( View.VISIBLE );

            }
        } );


        int layout_code=getIntent().getIntExtra( "layout_code",-1 );
        int my_cart_code=getIntent().getIntExtra( "my_cart_code",-1 );

        if(layout_code==0|| my_cart_code==2){

            myAccountbottomLayout.setVisibility( View.VISIBLE );
            home.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {

                    Intent intent =new Intent(ProfileActivity.this,HomeMainActivity.class );
                    startActivity( intent );

                }
            } );
            cart.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {

                    Intent intent =new Intent(ProfileActivity.this,MyCartLayout.class );
                    intent.putExtra( "profile_code",3);

                    startActivity( intent );

                }
            } );





        }else {
            myAccountbottomLayout.setVisibility( View.GONE );

        }




        myAccountArrowUp.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                myAccountchild.setVisibility( View.GONE );
                myAccountArrowUp.setVisibility( View.GONE );
                myAccountArrowDown.setVisibility( View.VISIBLE );

            }
        } );

        editProfile_txt.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent( ProfileActivity.this, Edit_pofile.class );
                startActivity( intent );
            }
        } );


        myOrderLayout.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent( ProfileActivity.this,My_order_layout .class );
                startActivity( intent );
            }
        } );


        ChangeAddressLayout.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                final Dialog address_dialog=new Dialog( view.getContext() );
                address_dialog.setContentView( R.layout.address_diallogs );
                address_dialog.getWindow().setLayout( ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT );
                address_dialog.setCancelable( false );
                 EditText roomNo=address_dialog.findViewById( R.id.addressDialogRoomNo );
                 EditText hostleName=address_dialog.findViewById( R.id.addressDialogHostelName );
                 EditText addressReq=address_dialog.findViewById( R.id.addressDialogAddressRequired );
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
                        address_dialog.dismiss();
                    }
                } );



                address_dialog.show();

            }
        } );



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected( item );
    }
}

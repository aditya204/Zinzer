package com.example.lutto;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MyCartLayout extends AppCompatActivity {

    private RecyclerView cartRecycler;
    public  LinearLayout myCartBottomQuickBar;
    private ImageView home,goOut,cart,account;
    private Toolbar toolbar;




    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_my_cart_layout );


        cartRecycler=findViewById( R.id.myCartFragmentRecycler );
        myCartBottomQuickBar=findViewById( R.id.myCartBottomQuickBar );
        home=findViewById( R.id.myCartHome );
        goOut=findViewById( R.id.myCartGoOut );
        cart=findViewById( R.id.myCartCart );
        account=findViewById( R.id.myCartAccount );
        toolbar=findViewById( R.id.toolbar );


        toolbar.setTitle( "My Cart" );
        setSupportActionBar( toolbar );
        getSupportActionBar().setDisplayShowHomeEnabled( true );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );



        int layout_code=getIntent().getIntExtra( "layout_code",-1 );
        int profile_code=getIntent().getIntExtra( "profile_code",-1 );

        if(layout_code==0||profile_code==3 ){

            myCartBottomQuickBar.setVisibility( View.VISIBLE );

            account.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {

                    Intent intent =new Intent(MyCartLayout.this,ProfileActivity.class );
                    intent.putExtra( "my_cart_code",2);

                    startActivity( intent );

                }
            } );
            home.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {

                    Intent intent =new Intent(MyCartLayout.this,HomeMainActivity.class );

                    startActivity( intent );

                }
            } );







        }else if (layout_code==1){

            myCartBottomQuickBar.setVisibility( View.GONE );

        }









        List<MyCartMenuRestaurantModel> myCartMenuRestaurantModelList=new ArrayList<>(  );
        myCartMenuRestaurantModelList.add( new MyCartMenuRestaurantModel( "Paneer kofta","Rs.320","full","Rs.320" ) );
        myCartMenuRestaurantModelList.add( new MyCartMenuRestaurantModel( "Paneer kofta","Rs.320","full","Rs.320" ) );
        myCartMenuRestaurantModelList.add( new MyCartMenuRestaurantModel( "Paneer kofta","Rs.320","full","Rs.320" ) );
        myCartMenuRestaurantModelList.add( new MyCartMenuRestaurantModel( "Paneer kofta","Rs.320","full","Rs.320" ) );


        List<MyCarrtFragmentModel>myCarrtFragmentModelList =new ArrayList<>(  );
        myCarrtFragmentModelList.add( new MyCarrtFragmentModel( 0,R.drawable.blur_foodings,"Restaurant Name","Indian,South Indian",myCartMenuRestaurantModelList) );
        myCarrtFragmentModelList.add( new MyCarrtFragmentModel( 1,"Rs.322","Rs.32","Rs.745") );
        myCarrtFragmentModelList.add( new MyCarrtFragmentModel(2,"C-303,Rudra Hostle"));

        MyCartFragmentAdapter adapter =new MyCartFragmentAdapter( myCarrtFragmentModelList );
        LinearLayoutManager layoutManager=new LinearLayoutManager( this );
        layoutManager.setOrientation( RecyclerView.VERTICAL );
        cartRecycler.setAdapter( adapter );
        cartRecycler.setLayoutManager( layoutManager );
        adapter.notifyDataSetChanged();
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected( item );
    }
}

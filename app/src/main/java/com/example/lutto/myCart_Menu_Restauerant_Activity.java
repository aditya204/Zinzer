package com.example.lutto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class myCart_Menu_Restauerant_Activity extends AppCompatActivity {
    private TextView restaurantName;
    private TextView restaurantCategory;
    private RecyclerView myCartmenuRestRecycler;
    private ImageView restaurantImage;
    private EditText requestRestaurant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_my_cart__menu__restauerant_ );

        restaurantName=findViewById( R.id.myCartMenuRestaurantName );
        restaurantCategory=findViewById( R.id.myCartMenuRestaurantCategory );
        restaurantImage=findViewById( R.id.myCartMenuRestaurantImage);
        myCartmenuRestRecycler=findViewById( R.id.myCartMenuRestaurantRecycler );
        requestRestaurant=findViewById( R.id.myCartMenuRestaurantRequest );


        List<MyCartMenuRestaurantModel>myCartMenuRestaurantModelList=new ArrayList<>(  );
        myCartMenuRestaurantModelList.add( new MyCartMenuRestaurantModel( "Paneer kofta","Rs.320","full","Rs.320" ) );
        myCartMenuRestaurantModelList.add( new MyCartMenuRestaurantModel( "Paneer kofta","Rs.320","full","Rs.320" ) );
        myCartMenuRestaurantModelList.add( new MyCartMenuRestaurantModel( "Paneer kofta","Rs.320","full","Rs.320" ) );
        myCartMenuRestaurantModelList.add( new MyCartMenuRestaurantModel( "Paneer kofta","Rs.320","full","Rs.320" ) );

        MyCartMenuRestaurantAdapter myCartMenuRestaurantAdapter=new MyCartMenuRestaurantAdapter( myCartMenuRestaurantModelList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager( this );
        linearLayoutManager.setOrientation( RecyclerView.VERTICAL );
        myCartmenuRestRecycler.setLayoutManager( linearLayoutManager );
        myCartmenuRestRecycler.setAdapter( myCartMenuRestaurantAdapter );
        myCartMenuRestaurantAdapter.notifyDataSetChanged();

    }


}

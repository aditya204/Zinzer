package com.example.lutto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class restaurant_menu_start extends AppCompatActivity {

    private TextView name;

    private TextView rating;
    private TextView category;
    private RecyclerView offerRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_restaurant_menu_start );


        name=findViewById( R.id.restaurantMenuName );
        rating=findViewById( R.id.restaurantMenuRating );
        category=findViewById( R.id.restaurantMenuCategory );
        offerRecycler=findViewById( R.id.restaurantMenuStartOfferRecycler );



        List<RestaurantMenuStartOfferModel> restaurantMenuStartOfferModelList=new ArrayList<>(  );
        restaurantMenuStartOfferModelList.add( new RestaurantMenuStartOfferModel( "20%","On all item" ) );
        restaurantMenuStartOfferModelList.add( new RestaurantMenuStartOfferModel( "20%","On all item" ) );
        restaurantMenuStartOfferModelList.add( new RestaurantMenuStartOfferModel( "20%","On all item" ) );
        restaurantMenuStartOfferModelList.add( new RestaurantMenuStartOfferModel( "20%","On all item" ) );

        RestaurantMenuStartOfferAdapter adapter=new RestaurantMenuStartOfferAdapter( restaurantMenuStartOfferModelList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager( this );
        linearLayoutManager.setOrientation( RecyclerView.HORIZONTAL );
        offerRecycler.setLayoutManager( linearLayoutManager );
        offerRecycler.setAdapter( adapter );
        adapter.notifyDataSetChanged();



    }
}

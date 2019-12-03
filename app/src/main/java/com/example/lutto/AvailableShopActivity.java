package com.example.lutto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class AvailableShopActivity extends AppCompatActivity {

    private RecyclerView shopRecyclerView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_available_shop );


        String title = getIntent().getStringExtra("CategoryName" );
        getSupportActionBar().setTitle( title );

        getSupportActionBar().setDisplayHomeAsUpEnabled( true );


        shopRecyclerView=findViewById( R.id.availableShop );

        List<RestaurantModel> restaurantModelList=new ArrayList<>(  );
        restaurantModelList.add( new RestaurantModel( R.drawable.blur_foodings,"Rana Restaurant" ) );
        restaurantModelList.add( new RestaurantModel( R.drawable.blur_foodings,"AV Restaurant") );
        restaurantModelList.add( new RestaurantModel( R.drawable.blur_foodings,"Priyanshu Restaurant" ) );
        restaurantModelList.add( new RestaurantModel( R.drawable.blur_foodings,"Godiyal Restaurant" ) );
        restaurantModelList.add( new RestaurantModel( R.drawable.blur_foodings,"Mehra Restaurant") );
        restaurantModelList.add( new RestaurantModel( R.drawable.blur_foodings,"Vicky Restaurant") );
        restaurantModelList.add( new RestaurantModel( R.drawable.blur_foodings,"RanaOutside Restaurant") );


        RestaurantAdaptor restaurantAdaptor=new RestaurantAdaptor( restaurantModelList );
        LinearLayoutManager restaurantlayout=new LinearLayoutManager( this );
        restaurantlayout .setOrientation(RecyclerView.VERTICAL);
        shopRecyclerView.setLayoutManager(restaurantlayout);
        shopRecyclerView.setAdapter(restaurantAdaptor);

    }
}

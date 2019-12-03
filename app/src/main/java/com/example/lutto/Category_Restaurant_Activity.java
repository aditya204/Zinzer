package com.example.lutto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Category_Restaurant_Activity extends AppCompatActivity {

    private RecyclerView categoryRestRecycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_category__restaurant_ );





        categoryRestRecycler=findViewById( R.id.categoryRestaurantRecycler );

        List<CategoryRestaurantModel> categoryRestaurantModelList=new ArrayList<>(  );
        categoryRestaurantModelList.add( new CategoryRestaurantModel( "Restaurant Name" ,R.drawable.panner_labab,"Category,category,category","40% OFF on all items","Currently not accepting orders","3.5") );
        categoryRestaurantModelList.add( new CategoryRestaurantModel( "Restaurant Name" ,R.drawable.panner_labab,"Category,category,category","40% OFF on all items","Currently not accepting orders","3.5") );
        categoryRestaurantModelList.add( new CategoryRestaurantModel( "Restaurant Name" ,R.drawable.panner_labab,"Category,category,category","40% OFF on all items","Currently not accepting orders","3.5") );
        categoryRestaurantModelList.add( new CategoryRestaurantModel( "Restaurant Name" ,R.drawable.panner_labab,"Category,category,category","40% OFF on all items","Currently not accepting orders","3.5") );
        categoryRestaurantModelList.add( new CategoryRestaurantModel( "Restaurant Name" ,R.drawable.panner_labab,"Category,category,category","40% OFF on all items","Currently not accepting orders","3.5") );
        categoryRestaurantModelList.add( new CategoryRestaurantModel( "Restaurant Name" ,R.drawable.panner_labab,"Category,category,category","40% OFF on all items","Currently not accepting orders","3.5") );
        categoryRestaurantModelList.add( new CategoryRestaurantModel( "Restaurant Name" ,R.drawable.panner_labab,"Category,category,category","40% OFF on all items","Currently not accepting orders","3.5") );
        categoryRestaurantModelList.add( new CategoryRestaurantModel( "Restaurant Name" ,R.drawable.panner_labab,"Category,category,category","40% OFF on all items","Currently not accepting orders","3.5") );

        CategoryRestaurntAdaptor categoryRestaurntAdaptor=new CategoryRestaurntAdaptor( categoryRestaurantModelList );
        LinearLayoutManager categoryRestaurantLayout=new LinearLayoutManager( this );
        categoryRestaurantLayout.setOrientation( RecyclerView.VERTICAL );
        categoryRestRecycler.setLayoutManager( categoryRestaurantLayout );
        categoryRestRecycler.setAdapter( categoryRestaurntAdaptor );
        categoryRestaurntAdaptor.notifyDataSetChanged();
    }


}


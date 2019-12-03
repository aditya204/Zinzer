package com.example.lutto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class restaurant_menu_activity extends AppCompatActivity {

    private RecyclerView restaurantMenuRecycler;
    public LinearLayout viewInCartLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_restaurant_menu_activity );

        restaurantMenuRecycler=findViewById( R.id.restaurantMenuRecycler );

        viewInCartLayout=findViewById( R.id.homeCartLayout );

        viewInCartLayout.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( restaurant_menu_activity.this,MyCartLayout.class );
                intent.putExtra( "layout_code",1);
                startActivity( intent );

            }
        } );




        List<RestaurantMenuStartOfferModel> restaurantMenuStartOfferModelList=new ArrayList<>(  );
        restaurantMenuStartOfferModelList.add( new RestaurantMenuStartOfferModel( "20%","On all item" ) );
        restaurantMenuStartOfferModelList.add( new RestaurantMenuStartOfferModel( "20%","On all item" ) );
        restaurantMenuStartOfferModelList.add( new RestaurantMenuStartOfferModel( "20%","On all item" ) );
        restaurantMenuStartOfferModelList.add( new RestaurantMenuStartOfferModel( "20%","On all item" ) );





        List<MenuModel> menuModelList=new ArrayList<>(  );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","","nonveg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","NONVEG","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","FULL","veg","add" ) );



        List<RestaurantMenuModel> restaurantMenuModelList=new ArrayList<>(  );
        restaurantMenuModelList.add( new RestaurantMenuModel(0,restaurantMenuStartOfferModelList,"Restaurant Name","3.4","Indian,South Indian") );

        restaurantMenuModelList.add( new RestaurantMenuModel( 1,"111111",menuModelList ) );
        restaurantMenuModelList.add( new RestaurantMenuModel( 1,"22222",menuModelList ) );
        restaurantMenuModelList.add( new RestaurantMenuModel( 1,"33333",menuModelList ) );
        restaurantMenuModelList.add( new RestaurantMenuModel( 1,"111111",menuModelList ) );
        restaurantMenuModelList.add( new RestaurantMenuModel( 1,"444444",menuModelList ) );




        RestaurantMenuAdapter restaurantMenuAdapter=new RestaurantMenuAdapter( restaurantMenuModelList );
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager( this );
        linearLayoutManager.setOrientation( RecyclerView.VERTICAL );
        restaurantMenuRecycler.setAdapter( restaurantMenuAdapter );
        restaurantMenuRecycler.setLayoutManager( linearLayoutManager );
        restaurantMenuAdapter.notifyDataSetChanged();
        


    }






}

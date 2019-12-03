package com.example.lutto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MenuLayout extends AppCompatActivity {

    private RecyclerView menuRecycler;
    private TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_menu_layout );

        menuRecycler=findViewById( R.id.menuRecycler );
        title=findViewById( R.id.productTitle );


        List<MenuModel> menuModelList=new ArrayList<>(  );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );


        MenuAdapter menuAdapter=new MenuAdapter( menuModelList );
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager( this);
        linearLayoutManager.setOrientation( RecyclerView.VERTICAL );
        menuRecycler.setLayoutManager( linearLayoutManager );
        menuRecycler.setAdapter( menuAdapter );
        menuAdapter.notifyDataSetChanged();

    }
}

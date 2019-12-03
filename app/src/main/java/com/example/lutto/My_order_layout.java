package com.example.lutto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class My_order_layout extends AppCompatActivity {

    private RecyclerView myOrderRecycler;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_my_order_layout );


        myOrderRecycler=findViewById( R.id.myOrderLayoutRecycler );
        toolbar=findViewById( R.id.toolbar );

        toolbar.setTitle( "My Profile" );
        setSupportActionBar( toolbar );
        getSupportActionBar().setDisplayShowHomeEnabled( true );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );


        List<MyOrderModel>myOrderModelList=new ArrayList<>(  );
        myOrderModelList.add( new MyOrderModel( "Product Name","Restaurant Name","12001JHGF85" ) );
        myOrderModelList.add( new MyOrderModel( "Product Name","Restaurant Name","12001JHGF85" ) );
        myOrderModelList.add( new MyOrderModel( "Product Name","Restaurant Name","12001JHGF85" ) );
        myOrderModelList.add( new MyOrderModel( "Product Name","Restaurant Name","12001JHGF85" ) );
        myOrderModelList.add( new MyOrderModel( "Product Name","Restaurant Name","12001JHGF85" ) );


        MyOrderAdapter myOrderAdapter=new MyOrderAdapter( myOrderModelList );
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager .setOrientation(RecyclerView.VERTICAL);
        myOrderRecycler.setLayoutManager(layoutManager);
        myOrderRecycler.setAdapter(myOrderAdapter);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected( item );
    }
}

package com.example.lutto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Offer_category_Activity extends AppCompatActivity {


    private RecyclerView offerCategoryRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_offer_category_ );


        offerCategoryRecycler=findViewById( R.id.offerCategoryRecycler );

        List<OfferCategoryModel> offerCategoryModelList=new ArrayList<>(  );


        OfferCategoryAdapter offerCategoryAdapter=new OfferCategoryAdapter( offerCategoryModelList );
        LinearLayoutManager offerCategoryLayout=new LinearLayoutManager( this );
        offerCategoryLayout.setOrientation( RecyclerView.HORIZONTAL );
        offerCategoryRecycler.setLayoutManager( offerCategoryLayout );
        offerCategoryRecycler.setAdapter( offerCategoryAdapter );
        offerCategoryAdapter.notifyDataSetChanged();

    }
}

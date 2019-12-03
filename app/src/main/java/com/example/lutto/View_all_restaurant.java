package com.example.lutto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class View_all_restaurant extends AppCompatActivity {

    private TextView viewAllTxt;
    private TextView viewAllRestCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_view_all_restaurant );

        viewAllRestCount=findViewById( R.id.viewAll_restaurantCount );
        viewAllTxt=findViewById( R.id.viewAll_txt );

        viewAllTxt.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {

            }
        } );

    }
}

package com.example.lutto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

public class OrderDetails extends AppCompatActivity {

    private LinearLayout productDetailsGreenStarLayout,productDetailsBlankStarLayout;
    private ImageView star1,star2,star3,star4,star5;
    private ImageView greenStar1,greenStar2,greenStar3,greenStar4,greenStar5;
    private TextView productDetailsWriteReviewBlank;
    private Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_order_details );



        star1=findViewById( R.id.productDetailsStar1 );
        star2=findViewById( R.id.productDetailsStar2 );
        star3=findViewById( R.id.productDetailsStar3 );
        star4=findViewById( R.id.productDetailsStar4 );
        star5=findViewById( R.id.productDetailsStar5 );
        toolbar=findViewById( R.id.toolbar );

        toolbar.setTitle( "Order Details" );
        setSupportActionBar( toolbar );
        getSupportActionBar().setDisplayShowHomeEnabled( true );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );





        productDetailsWriteReviewBlank=findViewById( R.id.productDetailsWriteReviewBlank );


        star1.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                productDetailsWriteReviewBlank.setVisibility( View.VISIBLE );
                star1.setImageResource( R.drawable.ic_star_green_24dp );
                star2.setImageResource( R.drawable.ic_star_border_blank_24dp );
                star4.setImageResource( R.drawable.ic_star_border_blank_24dp );
                star3.setImageResource( R.drawable.ic_star_border_blank_24dp );
                star5.setImageResource( R.drawable.ic_star_border_blank_24dp );
            }
        } );


        star2.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                productDetailsWriteReviewBlank.setVisibility( View.VISIBLE );
                star1.setImageResource( R.drawable.ic_star_green_24dp );
                star2.setImageResource( R.drawable.ic_star_green_24dp );
                star4.setImageResource( R.drawable.ic_star_border_blank_24dp );
                star3.setImageResource( R.drawable.ic_star_border_blank_24dp );
                star5.setImageResource( R.drawable.ic_star_border_blank_24dp );
            }
        } );


        star3.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                productDetailsWriteReviewBlank.setVisibility( View.VISIBLE );
                star1.setImageResource( R.drawable.ic_star_green_24dp );
                star2.setImageResource( R.drawable.ic_star_green_24dp );
                star4.setImageResource( R.drawable.ic_star_border_blank_24dp );
                star3.setImageResource( R.drawable.ic_star_green_24dp );
                star5.setImageResource( R.drawable.ic_star_border_blank_24dp );
            }
        } );

        star4.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                productDetailsWriteReviewBlank.setVisibility( View.VISIBLE );
                star1.setImageResource( R.drawable.ic_star_green_24dp );
                star2.setImageResource( R.drawable.ic_star_green_24dp );
                star4.setImageResource( R.drawable.ic_star_green_24dp );
                star3.setImageResource( R.drawable.ic_star_green_24dp );
                star5.setImageResource( R.drawable.ic_star_border_blank_24dp );
            }
        } );

        star5.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                productDetailsWriteReviewBlank.setVisibility( View.VISIBLE );
                star1.setImageResource( R.drawable.ic_star_green_24dp );
                star2.setImageResource( R.drawable.ic_star_green_24dp );
                star4.setImageResource( R.drawable.ic_star_green_24dp );
                star3.setImageResource( R.drawable.ic_star_green_24dp );
                star5.setImageResource( R.drawable.ic_star_green_24dp );
            }
        } );



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected( item );
    }
}

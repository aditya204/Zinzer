package com.example.lutto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CategortyActivity extends AppCompatActivity {

    private RecyclerView categoryRecyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_categorty );

        Toolbar toolbar =  (Toolbar) findViewById(R.id.toolbar);



        String title = getIntent().getStringExtra("CategoryName" );
        getSupportActionBar().setTitle( title );

        getSupportActionBar().setDisplayHomeAsUpEnabled( true );









        categoryRecyclerView=findViewById( R.id.category_recycler_view );



        List<VerticalProductModel> verticalProductModelsList =new ArrayList<VerticalProductModel>(  );

        verticalProductModelsList.add( new VerticalProductModel( R.drawable.chicken_curry, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.ic_account_circle_black_24dp, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.ic_add_circle_outline_black_24dp, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.ic_add_shopping_cart_black_24dp, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.chicken_curry, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.ic_audiotrack_dark, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.chicken_curry, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.ic_dialog_close_dark, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.chicken_curry, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.ic_add_shopping_cart_black_24dp, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.chicken_curry, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.ic_add_circle_outline_black_24dp, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.chicken_curry, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.ic_account_circle_black_24dp, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.chicken_curry, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.ic_group_expand_04, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.chicken_curry, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.ic_add_shopping_cart_black_24dp, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.chicken_curry, "Chicken Curry","North Indian","Must Try","4.7" ) );
        verticalProductModelsList.add( new VerticalProductModel( R.drawable.ic_account_circle_black_24dp, "Chicken Curry","North Indian","Must Try","4.7" ) );






        VerticalProductAdaptor verticalProductAdaptor=new VerticalProductAdaptor(verticalProductModelsList);
        LinearLayoutManager categoryLayoutManager=new LinearLayoutManager(this);
        categoryLayoutManager .setOrientation(RecyclerView.VERTICAL);
        categoryRecyclerView.setLayoutManager(categoryLayoutManager);
        categoryRecyclerView.setAdapter(verticalProductAdaptor);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


         //Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater( ).inflate( R.menu.search_icon, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
         //as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId( );

        //noinspection SimplifiableIfStatement
        if (id == R.id.searchMenu) {
            //code for search
            return true;
        }else if(id == android.R.id.home){
            finish();
            return true;
        }


        return super.onOptionsItemSelected( item );
    }

}

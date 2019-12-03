package com.example.lutto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ChefSpecialActivity extends AppCompatActivity {


    private RecyclerView chefSpecialrecyclerView;
    private TextView chefSpecialtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_chef_special );


        chefSpecialrecyclerView=findViewById( R.id.chefSpecialRecycler );
        chefSpecialtitle=findViewById( R.id.chefSpecialTitle );


        List<ChefSpecialModel> chefSpecialModelList= new ArrayList<>(  );
        chefSpecialModelList.add( new ChefSpecialModel( R.drawable.panner_labab,"Penner Lababdar","Rana" ) );
        chefSpecialModelList.add( new ChefSpecialModel( R.drawable.panner_labab,"Penner Lababdar","Rana" ) );
        chefSpecialModelList.add( new ChefSpecialModel( R.drawable.panner_labab,"Penner Lababdar","Rana" ) );
        chefSpecialModelList.add( new ChefSpecialModel( R.drawable.panner_labab,"Penner Lababdar","Rana" ) );
        chefSpecialModelList.add( new ChefSpecialModel( R.drawable.panner_labab,"Penner Lababdar","Rana" ) );
        chefSpecialModelList.add( new ChefSpecialModel( R.drawable.panner_labab,"Penner Lababdar","Rana" ) );
        chefSpecialModelList.add( new ChefSpecialModel( R.drawable.panner_labab,"Penner Lababdar","Rana" ) );
        chefSpecialModelList.add( new ChefSpecialModel( R.drawable.panner_labab,"Penner Lababdar","Rana" ) );
        chefSpecialModelList.add( new ChefSpecialModel( R.drawable.panner_labab,"Penner Lababdar","Rana" ) );


        ChefSpecialAdapter chefSpecialAdapter=new ChefSpecialAdapter( chefSpecialModelList );
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager( this );
        linearLayoutManager.setOrientation( RecyclerView.HORIZONTAL );
        chefSpecialrecyclerView.setAdapter( chefSpecialAdapter );
        chefSpecialrecyclerView.setLayoutManager( linearLayoutManager );
        chefSpecialAdapter.notifyDataSetChanged();

    }
}

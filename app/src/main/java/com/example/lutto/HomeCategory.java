package com.example.lutto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HomeCategory extends AppCompatActivity {

    private RecyclerView homeCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home_category );


        homeCategory=findViewById( R.id.homeCategoryRecycler );

        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        homeCategory.setLayoutManager(layoutManager);


        List<CategoryModel> categoryModelList = new ArrayList<CategoryModel>();
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"South Indian"));
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"North Indian"));
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"fast food"));
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"Mithai"));
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"Desert"));
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"Pizza"));
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"Biryani"));
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"Party"));
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"Beverage"));

        CategoryAdaptor categoryAdaptor = new CategoryAdaptor(categoryModelList);
        homeCategory.setAdapter(categoryAdaptor);
        categoryAdaptor.notifyDataSetChanged();



    }
}

package com.example.lutto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.makeText;


public class HomeMainActivity extends AppCompatActivity {
    private RecyclerView homeRecycler;
    private ImageView account,home,cart,goOut;
    private Toolbar toolbar;
    private FirebaseFirestore firebaseFirestore;
    private List<OfferCategoryModel> offerCategoryModelList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home_main );


        account=findViewById( R.id.homeMainAccount );
        home=findViewById( R.id.homeMainHome );
        cart=findViewById( R.id.homeMainCart);
        goOut=findViewById( R.id.homeMainGoOut );
        toolbar=findViewById( R.id.toolbar );


        firebaseFirestore=FirebaseFirestore.getInstance();


        toolbar.setTitle( "LUTTO" );
        toolbar.setSubtitle( "C-303,Rudra hostle" );
        setSupportActionBar( toolbar );







        account.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( HomeMainActivity.this,ProfileActivity.class );
                intent.putExtra( "layout_code",0 );
                startActivity( intent );

            }
        } );
        cart.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent( HomeMainActivity.this,MyCartLayout.class );
                intent.putExtra( "layout_code",0 );
                startActivity( intent );
            }
        } );
















        ////// <homeRecycler>

        homeRecycler=findViewById( R.id.homeRecycler );

        /////// <homeRecycler><menu>





        List<MenuModel> menuModelList=new ArrayList<>(  );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","","nonveg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","NONVEG","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","FULL","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","NONVEG","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","NONVEG","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","FULL","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","FULL","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        menuModelList.add( new MenuModel( "Product Name","RS.200","Customizable","veg","add" ) );
        /////// <homeRecycler><menu>

        /////// <homeRecycler><home category>
        List<CategoryModel> categoryModelList = new ArrayList<>();
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"South Indian"));
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"North Indian"));
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"fast food"));
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"Mithai"));
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"Desert"));
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"Pizza"));
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"Biryani"));
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"Party"));
        categoryModelList.add(new CategoryModel(R.drawable.blur_foodings,"Beverage"));
        /////// <homeRecycler><home category>

        /////// <homeRecycler><home restaurant>
        List<RestaurantModel> restaurantModelList=new ArrayList<>(  );
        restaurantModelList.add( new RestaurantModel( R.drawable.blur_foodings,"Rana Restaurant" ) );
        restaurantModelList.add( new RestaurantModel( R.drawable.blur_foodings,"AV Restaurant") );
        restaurantModelList.add( new RestaurantModel( R.drawable.blur_foodings,"Priyanshu Restaurant" ) );
        restaurantModelList.add( new RestaurantModel( R.drawable.blur_foodings,"Godiyal Restaurant" ) );
        restaurantModelList.add( new RestaurantModel( R.drawable.blur_foodings,"Mehra Restaurant") );
        restaurantModelList.add( new RestaurantModel( R.drawable.blur_foodings,"Vicky Restaurant") );
        restaurantModelList.add( new RestaurantModel( R.drawable.blur_foodings,"RanaOutside Restaurant") );
        /////// <homeRecycler><home restaurant>


        /////// <homeRecycler><home chefSpecial>

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

        /////// <homeRecycler><home chefSpecial>


        /////// <homeRecycler><home chefSpecial>



        /////// <homeRecycler><home chefSpecial>


        /////// <homeRecycler><home categoryRestaurant>

        List<CategoryRestaurantModel> categoryRestaurantModelList=new ArrayList<>(  );
        categoryRestaurantModelList.add( new CategoryRestaurantModel( "Restaurant Name" ,R.drawable.panner_labab,"Category,category,category","40% OFF on all items","Currently not accepting orders","3.5") );
        categoryRestaurantModelList.add( new CategoryRestaurantModel( "Restaurant Name" ,R.drawable.panner_labab,"Category,category,category","40% OFF on all items","Currently not accepting orders","3.5") );
        categoryRestaurantModelList.add( new CategoryRestaurantModel( "Restaurant Name" ,R.drawable.panner_labab,"Category,category,category","40% OFF on all items","Currently not accepting orders","3.5") );
        /////// <homeRecycler><home categoryRestaurant>


        final List<HomeModel>homeModelList=new ArrayList<>(  );


  //      homeModelList.add( new HomeModel( 7,0,"7 delivering to you") );
  //      homeModelList.add( new HomeModel( 5,categoryRestaurantModelList,0,0,0 ) );

  //      homeModelList.add( new HomeModel( 1,categoryModelList ,0) );
  //      homeModelList.add( new HomeModel( 5,categoryRestaurantModelList,0,0,0 ) )
        // homeModelList.add( new HomeModel(2, restaurantModelList ) );

   //     homeModelList.add( new HomeModel(3,0,"chef Special",chefSpecialModelList ));



   //     homeModelList.add( new HomeModel( 6,"great food,great life!") );





        final HomeAdapter homeAdapter=new HomeAdapter( homeModelList );
        LinearLayoutManager menuLayout=new LinearLayoutManager( this );
        menuLayout.setOrientation( RecyclerView.VERTICAL );
        homeRecycler.setLayoutManager( menuLayout );
        homeRecycler.setAdapter( homeAdapter );

        firebaseFirestore.collection( "HOME" ).orderBy( "index" ).get()
                .addOnCompleteListener( new OnCompleteListener<QuerySnapshot>( ) {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if(task.isSuccessful()){
                            for (QueryDocumentSnapshot documentSnapshot : task.getResult()){

                                if((long)documentSnapshot.get( "view_type" ) == 4){
                                    offerCategoryModelList =new ArrayList<>(  );

                                    long no_of_img=(long)documentSnapshot.get( "no_of_image" );
                                    for(long x=1; x< no_of_img+1;x++){
                                        offerCategoryModelList.add( new OfferCategoryModel( documentSnapshot.get("img_"+x).toString() ) );
                                    }
                                    homeModelList.add( new HomeModel( 4,0,0,offerCategoryModelList ) );
                                }
                            }
                            homeAdapter.notifyDataSetChanged();
                        }else {


                        }

                    }
                } );


















    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate( R.menu.menu,menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId( );

        //noinspection SimplifiableIfStatement
        if (id == R.id.favourites) {

            //code for search

            return true;
        }
        return super.onOptionsItemSelected(item);


    }
}

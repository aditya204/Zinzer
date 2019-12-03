package com.example.lutto;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RestaurantMenuAdapter extends RecyclerView.Adapter {


    private List<RestaurantMenuModel> restaurantMenuModelList;

    public RestaurantMenuAdapter(List<RestaurantMenuModel> restaurantMenuModelList) {
        this.restaurantMenuModelList = restaurantMenuModelList;
    }

    @Override
    public int getItemViewType(int position) {


        switch (restaurantMenuModelList.get( position ).getType( )) {
            case 0:
                return RestaurantMenuModel.RESTAURANT_MENU_START;
            case 1:
                return RestaurantMenuModel.RESTAURANT_MENU;
            default:
                return -1;
        }

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case RestaurantMenuModel.RESTAURANT_MENU_START:
                View restaurantMenuStartView = LayoutInflater.from( parent.getContext( ) ).inflate( R.layout.activity_restaurant_menu_start, parent, false );
                return new restaurantMenuStartViewHolder( restaurantMenuStartView );

            case RestaurantMenuModel.RESTAURANT_MENU:
                View menuView = LayoutInflater.from( parent.getContext( ) ).inflate( R.layout.activity_menu_layout, parent, false );
                return new restaurantMenuViewholder( menuView );
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (restaurantMenuModelList.get( position ).getType( )) {
            case RestaurantMenuModel.RESTAURANT_MENU_START:
                String name = restaurantMenuModelList.get( position ).getRestaurant_menu_name( );
                String category = restaurantMenuModelList.get( position ).getRestaurant_menu_category( );
                String rating = restaurantMenuModelList.get( position ).getRestaurant_menu_rating( );
                List<RestaurantMenuStartOfferModel> restaurantMenuStartOfferModelList=restaurantMenuModelList.get( position ).getRestaurantMenuStartOfferModelList();

                ((restaurantMenuStartViewHolder) holder).setRestaurant_menu_name( name );
                ((restaurantMenuStartViewHolder) holder).setRestaurant_menu_category( category );
                ((restaurantMenuStartViewHolder) holder).setRestaurant_menu_rating( rating );
                ((restaurantMenuStartViewHolder) holder).onClickMenuSearch( );
                ((restaurantMenuStartViewHolder) holder).setOfferRecycler(restaurantMenuStartOfferModelList );


                break;

            case RestaurantMenuModel.RESTAURANT_MENU:
                String title = restaurantMenuModelList.get( position ).getMenuTitle( );
                List<MenuModel> menuModelList = restaurantMenuModelList.get( position ).getMenuModelList( );
                ((RestaurantMenuAdapter.restaurantMenuViewholder) holder).setmenuRecyclerLayout( menuModelList, title );
                break;
        }

    }


    @Override
    public int getItemCount() {
        return restaurantMenuModelList.size( );
    }

    public class restaurantMenuStartViewHolder extends RecyclerView.ViewHolder {

        private TextView restaurant_menu_name;

        private TextView restaurant_menu_rating;
        private TextView restaurant_menu_category;
        private TextView restaurant_menu_seach_txt;
        private EditText menu_search;
        private RecyclerView offerRecycler;


        public restaurantMenuStartViewHolder(@NonNull View itemView) {
            super( itemView );

            restaurant_menu_name = itemView.findViewById( R.id.restaurantMenuName );
            restaurant_menu_category = itemView.findViewById( R.id.restaurantMenuCategory );
            restaurant_menu_rating = itemView.findViewById( R.id.restaurantMenuRating );
            restaurant_menu_seach_txt = itemView.findViewById( R.id.searchWithinMenu );
            menu_search = itemView.findViewById( R.id.searchMenuStartEditTxt );
            offerRecycler=itemView.findViewById( R.id.restaurantMenuStartOfferRecycler );
        }

        private void setOfferRecycler(List<RestaurantMenuStartOfferModel> restaurantMenuStartOfferModelList){
            RestaurantMenuStartOfferAdapter adapter=new RestaurantMenuStartOfferAdapter( restaurantMenuStartOfferModelList);
            LinearLayoutManager linearLayoutManager=new LinearLayoutManager( itemView.getContext() );
            linearLayoutManager.setOrientation( RecyclerView.HORIZONTAL );
            offerRecycler.setLayoutManager( linearLayoutManager );
            offerRecycler.setAdapter( adapter );
            adapter.notifyDataSetChanged();
        }


        private void setRestaurant_menu_name(String name) {
            restaurant_menu_name.setText( name );
        }



        private void setRestaurant_menu_rating(String rating) {
            restaurant_menu_rating.setText( rating );
        }

        private void setRestaurant_menu_category(String category) {
            restaurant_menu_category.setText( category );
        }

        private void onClickMenuSearch() {
            restaurant_menu_seach_txt.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {
                    restaurant_menu_seach_txt.setVisibility( View.GONE );
                    menu_search.setVisibility( View.VISIBLE );

                }
            } );
        }

    }

    public class restaurantMenuViewholder extends RecyclerView.ViewHolder {

        private RecyclerView menuRecycler;
        private TextView menuTitle;


        public restaurantMenuViewholder(@NonNull View itemView) {
            super( itemView );

            menuRecycler = itemView.findViewById( R.id.menuRecycler );
            menuTitle = itemView.findViewById( R.id.productTitle );

        }

        private void setmenuRecyclerLayout(List<MenuModel> menuModelList, String title) {
            menuTitle.setText( title );
            MenuAdapter menuAdapter = new MenuAdapter( menuModelList );
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager( itemView.getContext( ) );
            linearLayoutManager.setOrientation( RecyclerView.VERTICAL );
            menuRecycler.setLayoutManager( linearLayoutManager );
            menuRecycler.setAdapter( menuAdapter );
            menuAdapter.notifyDataSetChanged( );
        }


    }






}
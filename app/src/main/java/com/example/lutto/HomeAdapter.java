package com.example.lutto;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter {
    private List<HomeModel> homeModelList;

    public HomeAdapter(List<HomeModel> homeModelList) {
        this.homeModelList = homeModelList;
    }

    @Override
    public int getItemViewType(int position) {
        switch (homeModelList.get( position ).getType( )) {
            case 0:
                return HomeModel.RECYCLER;
            case 1:
                return HomeModel.HOME_CATEGORY;
            case 2:
                return HomeModel.HOME_RESTAURANT;
            case 3:
                return HomeModel.HOME_CHEFSOECIAL;
            case 4:
                return HomeModel.HOME_OFFER_CATEGORY;
            case 5:
                return HomeModel.HOME_CATEGORY_RESTAURANT;
            case 6:
                return HomeModel.HOME_BOTTOM_LAYOUT;
            case 7:
                return HomeModel.HOME_VIEW_ALL;
            default:
                return -1;

        }

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {

            case HomeModel.RECYCLER:
                View menuView = LayoutInflater.from( parent.getContext( ) ).inflate( R.layout.activity_menu_layout, parent, false );
                return new menuViewholder( menuView );
            case HomeModel.HOME_CATEGORY:
                View homeCategoryView = LayoutInflater.from( parent.getContext( ) ).inflate( R.layout.activity_home_category, parent, false );
                return new homeCategoryViewholder( homeCategoryView );
            case HomeModel.HOME_RESTAURANT:
                View homeRestaurantView = LayoutInflater.from( parent.getContext( ) ).inflate( R.layout.activity_available_shop, parent, false );
                return new homeRestaurntViewholder( homeRestaurantView );
            case HomeModel.HOME_CHEFSOECIAL:
                View homeChefSpecialView = LayoutInflater.from( parent.getContext( ) ).inflate( R.layout.activity_chef_special, parent, false );
                return new homeChefSpecialViewholder( homeChefSpecialView );

            case HomeModel.HOME_OFFER_CATEGORY:
                View offerCategory_view = LayoutInflater.from( parent.getContext( ) ).inflate( R.layout.activity_offer_category_, parent, false );
                return new homeOfferCategoryViewHolder( offerCategory_view );
            case HomeModel.HOME_CATEGORY_RESTAURANT:
                View categoryRestaurant_view = LayoutInflater.from( parent.getContext( ) ).inflate( R.layout.activity_category__restaurant_, parent, false );
                return new homeCategoryRestaurantViewHolder( categoryRestaurant_view );

            case HomeModel.HOME_BOTTOM_LAYOUT:
                View bottomLayoutView = LayoutInflater.from( parent.getContext( ) ).inflate( R.layout.activity_bottom_activity2, parent, false );
                return new homeBottomLayoutViewHolder( bottomLayoutView );

            case HomeModel.HOME_VIEW_ALL:
                View viewAllView = LayoutInflater.from( parent.getContext( ) ).inflate( R.layout.activity_view_all_restaurant, parent, false );
                return new homeViewAllRestaurants( viewAllView );
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        switch (homeModelList.get( position ).getType( )) {
            case HomeModel.RECYCLER:
                String title = homeModelList.get( position ).getTitle( );
                List<MenuModel> menuModelList = homeModelList.get( position ).getMenuModelList( );
                ((menuViewholder) holder).setmenuRecyclerLayout( menuModelList, title );
                break;

            case HomeModel.HOME_CATEGORY:

                List<CategoryModel> categoryModelList = homeModelList.get( position ).getCategoryModelList( );
                ((homeCategoryViewholder) holder).setHomeCategoryLayout( categoryModelList );
                break;
            case HomeModel.HOME_RESTAURANT:
                List<RestaurantModel> restaurantModelList = homeModelList.get( position ).getRestaurantModelList( );
                ((homeRestaurntViewholder) holder).setHomeRestaurant( restaurantModelList );
                break;
            case HomeModel.HOME_CHEFSOECIAL:
                String chefSpecialTitle = homeModelList.get( position ).getChefSpecialTitle( );
                List<ChefSpecialModel> chefSpecialModelList = homeModelList.get( position ).getChefSpecialModelList( );
                ((homeChefSpecialViewholder) holder).setHomeChefSpecial( chefSpecialModelList, chefSpecialTitle );
                break;
            case HomeModel.HOME_OFFER_CATEGORY:

                List<OfferCategoryModel> offerCategoryModelList = homeModelList.get( position ).getOfferCategoryModelList( );
                ((homeOfferCategoryViewHolder) holder).setOfferCategoryRecler( offerCategoryModelList );
                break;
            case HomeModel.HOME_CATEGORY_RESTAURANT:

                List<CategoryRestaurantModel> categoryRestaurantModelList = homeModelList.get( position ).getCategoryRestaurantModelList( );
                ((homeCategoryRestaurantViewHolder) holder).setCategoryResaurantRecycler( categoryRestaurantModelList );
                break;

            case HomeModel.HOME_BOTTOM_LAYOUT:

                String bottomText = homeModelList.get( position ).getBottomText( );
                ((homeBottomLayoutViewHolder) holder).setBottomText( bottomText );
                break;


            case HomeModel.HOME_VIEW_ALL:

                String restaurantCount = homeModelList.get( position ).getViewAllRestaurantCount( );
                ((homeViewAllRestaurants) holder).setRestaurantCount( restaurantCount );
                ((homeViewAllRestaurants) holder).setViewAllTxt(  );

                break;
        }
    }

    @Override
    public int getItemCount() {
        return homeModelList.size( );
    }

    public class menuViewholder extends RecyclerView.ViewHolder {

        private RecyclerView menuRecycler;
        private TextView menuTitle;


        public menuViewholder(@NonNull View itemView) {
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

    public class homeCategoryViewholder extends RecyclerView.ViewHolder {

        private RecyclerView homeCategory;

        public homeCategoryViewholder(@NonNull View itemView) {
            super( itemView );

            homeCategory = itemView.findViewById( R.id.homeCategoryRecycler );

        }


        private void setHomeCategoryLayout(List<CategoryModel> categoryModelList) {

            CategoryAdaptor categoryAdaptor = new CategoryAdaptor( categoryModelList );
            homeCategory.setAdapter( categoryAdaptor );
            LinearLayoutManager layoutManager = new LinearLayoutManager( itemView.getContext( ) );
            layoutManager.setOrientation( RecyclerView.HORIZONTAL );
            homeCategory.setLayoutManager( layoutManager );

            categoryAdaptor.notifyDataSetChanged( );
        }
    }

    public class homeRestaurntViewholder extends RecyclerView.ViewHolder {

        private RecyclerView homeRestaurant;

        public homeRestaurntViewholder(@NonNull View itemView) {
            super( itemView );

            homeRestaurant = itemView.findViewById( R.id.availableShop );
        }

        private void setHomeRestaurant(List<RestaurantModel> restaurantModelList) {

            RestaurantAdaptor restaurantAdaptor = new RestaurantAdaptor( restaurantModelList );
            LinearLayoutManager restaurantlayout = new LinearLayoutManager( itemView.getContext( ) );
            restaurantlayout.setOrientation( RecyclerView.HORIZONTAL );
            homeRestaurant.setLayoutManager( restaurantlayout );
            homeRestaurant.setAdapter( restaurantAdaptor );
            restaurantAdaptor.notifyDataSetChanged( );

        }
    }

    public class homeChefSpecialViewholder extends RecyclerView.ViewHolder {
        private RecyclerView homeChefSpecialRecycler;
        private TextView homeChefSpecialTitle;


        public homeChefSpecialViewholder(@NonNull View itemView) {
            super( itemView );

            homeChefSpecialRecycler = itemView.findViewById( R.id.chefSpecialRecycler );
            homeChefSpecialTitle = itemView.findViewById( R.id.chefSpecialTitle );
        }

        private void setHomeChefSpecial(List<ChefSpecialModel> chefSpecialModelList, String title) {

            homeChefSpecialTitle.setText( title );
            ChefSpecialAdapter chefSpecialAdapter = new ChefSpecialAdapter( chefSpecialModelList );
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager( itemView.getContext( ) );
            linearLayoutManager.setOrientation( RecyclerView.HORIZONTAL );
            homeChefSpecialRecycler.setAdapter( chefSpecialAdapter );
            homeChefSpecialRecycler.setLayoutManager( linearLayoutManager );
            chefSpecialAdapter.notifyDataSetChanged( );

        }
    }

    public class homeOfferCategoryViewHolder extends RecyclerView.ViewHolder {
        private RecyclerView offerCategoryRecycler;


        public homeOfferCategoryViewHolder(@NonNull View itemView) {
            super( itemView );

            offerCategoryRecycler = itemView.findViewById( R.id.offerCategoryRecycler );
        }

        private void setOfferCategoryRecler(List<OfferCategoryModel> offerCategoryModelList) {


            OfferCategoryAdapter offerCategoryAdapter = new OfferCategoryAdapter( offerCategoryModelList );
            LinearLayoutManager offerCategoryLayout = new LinearLayoutManager( itemView.getContext( ) );
            offerCategoryLayout.setOrientation( RecyclerView.HORIZONTAL );
            offerCategoryRecycler.setLayoutManager( offerCategoryLayout );
            offerCategoryRecycler.setAdapter( offerCategoryAdapter );
            offerCategoryAdapter.notifyDataSetChanged( );
        }
    }

    public class homeCategoryRestaurantViewHolder extends RecyclerView.ViewHolder {

        private RecyclerView categoryResaurantRecycler;

        public homeCategoryRestaurantViewHolder(@NonNull View itemView) {
            super( itemView );

            categoryResaurantRecycler = itemView.findViewById( R.id.categoryRestaurantRecycler );
        }

        private void setCategoryResaurantRecycler(List<CategoryRestaurantModel> categoryRestaurantModelList) {

            CategoryRestaurntAdaptor categoryRestaurntAdaptor = new CategoryRestaurntAdaptor( categoryRestaurantModelList );
            LinearLayoutManager categoryRestaurantLayout = new LinearLayoutManager( itemView.getContext( ) );
            categoryRestaurantLayout.setOrientation( RecyclerView.VERTICAL );
            categoryResaurantRecycler.setLayoutManager( categoryRestaurantLayout );
            categoryResaurantRecycler.setAdapter( categoryRestaurntAdaptor );
            categoryRestaurntAdaptor.notifyDataSetChanged( );
        }
    }

    public class homeBottomLayoutViewHolder extends RecyclerView.ViewHolder {

        private TextView bottomText;

        public homeBottomLayoutViewHolder(@NonNull View itemView) {
            super( itemView );

            bottomText = itemView.findViewById( R.id.bottomText );
        }

        private void setBottomText(String text) {

            bottomText.setText( text );
        }
    }

    public class homeViewAllRestaurants extends RecyclerView.ViewHolder {

        private TextView restaurantCount;
        private TextView viewAllTxt;


        public homeViewAllRestaurants(@NonNull View itemView) {
            super( itemView );

            restaurantCount = itemView.findViewById( R.id.viewAll_restaurantCount );
            viewAllTxt = itemView.findViewById( R.id.viewAll_txt );
        }

        private void setRestaurantCount(String restCount) {
            restaurantCount.setText( restCount );
        }

        private void setViewAllTxt(){
            viewAllTxt.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent( itemView.getContext(),Category_Restaurant_Activity.class );
                    itemView.getContext().startActivity( intent );
                }
            } );
        }


    }


}

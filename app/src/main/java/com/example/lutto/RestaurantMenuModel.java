package com.example.lutto;

import java.util.List;

public class RestaurantMenuModel {


    public static final int RESTAURANT_MENU_START=0;
    public static final int RESTAURANT_MENU=1;


    private int type;

    ////RESTAURANT_MENU_START

    private List<RestaurantMenuStartOfferModel> restaurantMenuStartOfferModelList;
    private String restaurant_menu_name;
    private String restaurant_menu_rating;
    private String restaurant_menu_category;

    public RestaurantMenuModel(int type, List<RestaurantMenuStartOfferModel> restaurantMenuStartOfferModelList, String restaurant_menu_name, String restaurant_menu_rating, String restaurant_menu_category) {
        this.type = type;
        this.restaurantMenuStartOfferModelList = restaurantMenuStartOfferModelList;
        this.restaurant_menu_name = restaurant_menu_name;
        this.restaurant_menu_rating = restaurant_menu_rating;
        this.restaurant_menu_category = restaurant_menu_category;
    }

    public List<RestaurantMenuStartOfferModel> getRestaurantMenuStartOfferModelList() {
        return restaurantMenuStartOfferModelList;
    }

    public void setRestaurantMenuStartOfferModelList(List<RestaurantMenuStartOfferModel> restaurantMenuStartOfferModelList) {
        this.restaurantMenuStartOfferModelList = restaurantMenuStartOfferModelList;
    }
 
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public String getRestaurant_menu_name() {
        return restaurant_menu_name;
    }
    public void setRestaurant_menu_name(String restaurant_menu_name) {
        this.restaurant_menu_name = restaurant_menu_name;
    }


    public String getRestaurant_menu_rating() {
        return restaurant_menu_rating;
    }
    public void setRestaurant_menu_rating(String restaurant_menu_rating) {
        this.restaurant_menu_rating = restaurant_menu_rating;
    }
    public String getRestaurant_menu_category() {
        return restaurant_menu_category;
    }
    public void setRestaurant_menu_category(String restaurant_menu_category) {
        this.restaurant_menu_category = restaurant_menu_category;
    }
    ////RESTAURANT_MENU_START

    ////RESTAURANT_MENU

    private String menuTitle;
    private List<MenuModel> menuModelList;
    public RestaurantMenuModel(int type, String menuTitle, List<MenuModel> menuModelList) {
        this.type = type;
        this.menuTitle = menuTitle;
        this.menuModelList = menuModelList;
    }
    public String getMenuTitle() {
        return menuTitle;
    }
    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }
    public List<MenuModel> getMenuModelList() {
        return menuModelList;
    }
    public void setMenuModelList(List<MenuModel> menuModelList) {
        this.menuModelList = menuModelList;
    }

    //////RESTAURANT_MENU

}

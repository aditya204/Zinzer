package com.example.lutto;

import java.util.List;

public class HomeModel {

    public static final int RECYCLER=0;
    public static final int HOME_CATEGORY=1;
    public static final int HOME_RESTAURANT=2;
    public static final int HOME_CHEFSOECIAL=3;
    public static final int HOME_OFFER_CATEGORY=4;
    public static final int HOME_CATEGORY_RESTAURANT=5;
    public static final int HOME_BOTTOM_LAYOUT=6;
    public static final int HOME_VIEW_ALL=7;


    private int type;
    private int type1;
    private int type2;
    private int type3;

    /////MENU
    private String title;
    private List<MenuModel> menuModelList;

    public HomeModel(int type, String title, List<MenuModel> menuModelList) {
        this.type = type;
        this.title = title;
        this.menuModelList = menuModelList;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<MenuModel> getMenuModelList() {
        return menuModelList;
    }
    public void setHello_modelList(List<MenuModel> menuModelList) {
        this.menuModelList = menuModelList;
    }
    ///////MENU

    ///////home Category;

    private List<CategoryModel> categoryModelList;

    
    public HomeModel(int type, List<CategoryModel> categoryModelList,int type1 ) {
        this.type = type;
        this.type1=type1;
        this.categoryModelList = categoryModelList;
    }
    public static int getRECYCLER() {
        return RECYCLER;
    }
    public List<CategoryModel> getCategoryModelList() {
        return categoryModelList;
    }
    public void setCategoryModelList(List<CategoryModel> categoryModelList) {
        this.categoryModelList = categoryModelList;
    }
    ///////home Category;

    /////HOME RESTAURANT
    private List<RestaurantModel> restaurantModelList;

    public HomeModel( int type, List<RestaurantModel> restaurantModelList) {
        this.type = type;
        this.restaurantModelList = restaurantModelList;
    }

    public List<RestaurantModel> getRestaurantModelList() {
        return restaurantModelList;
    }

    public void setRestaurantModelList(List<RestaurantModel> restaurantModelList) {
        this.restaurantModelList = restaurantModelList;
    }
    /////HOME RESTAURANT


    /////HOME chef_special
private String ChefSpecialTitle;
    private List<ChefSpecialModel>chefSpecialModelList;

    public HomeModel(int type, int type2, String chefSpecialTitle, List<ChefSpecialModel> chefSpecialModelList) {
        this.type = type;
        this.type2 = type2;
        ChefSpecialTitle = chefSpecialTitle;
        this.chefSpecialModelList = chefSpecialModelList;
    }

    public String getChefSpecialTitle() {
        return ChefSpecialTitle;
    }

    public void setChefSpecialTitle(String chefSpecialTitle) {
        ChefSpecialTitle = chefSpecialTitle;
    }

    public List<ChefSpecialModel> getChefSpecialModelList() {
        return chefSpecialModelList;
    }

    public void setChefSpecialModelList(List<ChefSpecialModel> chefSpecialModelList) {
        this.chefSpecialModelList = chefSpecialModelList;
    }
    /////HOME chef_special


    ///////home oFFER_Category;

    private List<OfferCategoryModel> offerCategoryModelList;

    public HomeModel(int type, int type1, int type2, List<OfferCategoryModel> offerCategoryModelList) {
        this.type = type;
        this.type1 = type1;
        this.type2 = type2;
        this.offerCategoryModelList = offerCategoryModelList;
    }

    public List<OfferCategoryModel> getOfferCategoryModelList() {
        return offerCategoryModelList;
    }

    public void setOfferCategoryModelList(List<OfferCategoryModel> offerCategoryModelList) {
        this.offerCategoryModelList = offerCategoryModelList;
    }
    ///////home oFFER_Category;



    ////HOME_CATEGORY_RESTAURANT

    private List<CategoryRestaurantModel> categoryRestaurantModelList;

    public HomeModel(int type, List<CategoryRestaurantModel> categoryRestaurantModelList,int type1, int type2, int type3) {
        this.type = type;
        this.type1 = type1;
        this.type2 = type2;
        this.type3 = type3;
        this.categoryRestaurantModelList = categoryRestaurantModelList;
    }

    public List<CategoryRestaurantModel> getCategoryRestaurantModelList() {
        return categoryRestaurantModelList;
    }

    public void setCategoryRestaurantModelList(List<CategoryRestaurantModel> categoryRestaurantModelList) {
        this.categoryRestaurantModelList = categoryRestaurantModelList;
    }
////HOME_CATEGORY_RESTAURANT

////HOME_BOTTOM_LAYOUT

    private String bottomText;

    public HomeModel(int type, String bottomText) {
        this.type = type;
        this.bottomText = bottomText;
    }

    public String getBottomText() {
        return bottomText;
    }

    public void setBottomText(String bottomText) {
        this.bottomText = bottomText;
    }
    ////HOME_BOTTOM_LAYOUT

    /////HOME_VIEW_ALL
    private String viewAlltxt;
    private String viewAllRestaurantCount;

    public HomeModel(int type, int type1, String viewAllRestaurantCount) {
        this.type = type;
        this.type1 = type1;
        this.viewAllRestaurantCount = viewAllRestaurantCount;
    }

    public String getViewAlltxt() {
        return viewAlltxt;
    }

    public void setViewAlltxt(String viewAlltxt) {
        this.viewAlltxt = viewAlltxt;
    }

    public String getViewAllRestaurantCount() {
        return viewAllRestaurantCount;
    }

    public void setViewAllRestaurantCount(String viewAllRestaurantCount) {
        this.viewAllRestaurantCount = viewAllRestaurantCount;
    }
    ////HOME_VIEW_ALL
}



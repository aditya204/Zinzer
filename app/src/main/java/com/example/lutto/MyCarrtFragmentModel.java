package com.example.lutto;

import java.util.List;

public class MyCarrtFragmentModel {

    public static final int MENU_RESTAURANT=0;
    public static final int BILL=1;
    public static final int ADDRESS=2;

    private int type;


    ////MENU_RESTAURANT

    private String cartRestaurantName;
    private String cartRestaurantcategory;
    private int cartRestaurantImage;
    private List<MyCartMenuRestaurantModel> myCartMenuRestaurantModelList;

    public MyCarrtFragmentModel(int type, int cartRestaurantImage, String cartRestaurantName, String cartRestaurantcategory, List<MyCartMenuRestaurantModel> myCartMenuRestaurantModelList) {
        this.type = type;
        this.cartRestaurantName = cartRestaurantName;
        this.cartRestaurantcategory = cartRestaurantcategory;
        this.cartRestaurantImage = cartRestaurantImage;
        this.myCartMenuRestaurantModelList = myCartMenuRestaurantModelList;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCartRestaurantName() {
        return cartRestaurantName;
    }

    public void setCartRestaurantName(String cartRestaurantName) {
        this.cartRestaurantName = cartRestaurantName;
    }

    public String getCartRestaurantcategory() {
        return cartRestaurantcategory;
    }

    public void setCartRestaurantcategory(String cartRestaurantcategory) {
        this.cartRestaurantcategory = cartRestaurantcategory;
    }

    public int getCartRestaurantImage() {
        return cartRestaurantImage;
    }

    public void setCartRestaurantImage(int cartRestaurantImage) {
        this.cartRestaurantImage = cartRestaurantImage;
    }

    public List<MyCartMenuRestaurantModel> getMyCartMenuRestaurantModelList() {
        return myCartMenuRestaurantModelList;
    }

    public void setMyCartMenuRestaurantModelList(List<MyCartMenuRestaurantModel> myCartMenuRestaurantModelList) {
        this.myCartMenuRestaurantModelList = myCartMenuRestaurantModelList;
    }
    ///MENU_RESTAURANT


    ////BILL

    private String itemTotalPrice;
    private String taxPrice;
    private String grandTotalPrice;

    public MyCarrtFragmentModel(int type, String itemTotalPrice, String taxPrice, String grandTotalPrice) {
        this.type = type;
        this.itemTotalPrice = itemTotalPrice;
        this.taxPrice = taxPrice;
        this.grandTotalPrice = grandTotalPrice;
    }

    public String getItemTotalPrice() {
        return itemTotalPrice;
    }

    public void setItemTotalPrice(String itemTotalPrice) {
        this.itemTotalPrice = itemTotalPrice;
    }

    public String getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(String taxPrice) {
        this.taxPrice = taxPrice;
    }

    public String getGrandTotalPrice() {
        return grandTotalPrice;
    }

    public void setGrandTotalPrice(String grandTotalPrice) {
        this.grandTotalPrice = grandTotalPrice;
    }

    ////BILL

    ///ADDRESS

    private String address ;
    private String addressChange;

    public MyCarrtFragmentModel(int type, String address) {
        this.type = type;
        this.address = address;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressChange() {
        return addressChange;
    }

    public void setAddressChange(String addressChange) {
        this.addressChange = addressChange;
    }

    ///ADDRESS



}

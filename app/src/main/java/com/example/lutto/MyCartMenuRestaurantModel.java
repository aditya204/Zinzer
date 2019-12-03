package com.example.lutto;

public class MyCartMenuRestaurantModel {
    private String MyCartMenuRestaurantproductName;
    private String MyCartMenuRestaurantProductPrice;
    private String MyCartMenuRestaurantProductQuantity;
    private String MyCartMenuRestaurantTotalPrice;
    private String add,noCount;

    public MyCartMenuRestaurantModel(String myCartMenuRestaurantproductName, String myCartMenuRestaurantProductPrice, String myCartMenuRestaurantProductQuantity, String myCartMenuRestaurantTotalPrice) {
        MyCartMenuRestaurantproductName = myCartMenuRestaurantproductName;
        MyCartMenuRestaurantProductPrice = myCartMenuRestaurantProductPrice;
        MyCartMenuRestaurantProductQuantity = myCartMenuRestaurantProductQuantity;
        MyCartMenuRestaurantTotalPrice = myCartMenuRestaurantTotalPrice;

    }

    public String getMyCartMenuRestaurantproductName() {
        return MyCartMenuRestaurantproductName;
    }

    public void setMyCartMenuRestaurantproductName(String myCartMenuRestaurantproductName) {
        MyCartMenuRestaurantproductName = myCartMenuRestaurantproductName;
    }

    public String getMyCartMenuRestaurantProductPrice() {
        return MyCartMenuRestaurantProductPrice;
    }

    public void setMyCartMenuRestaurantProductPrice(String myCartMenuRestaurantProductPrice) {
        MyCartMenuRestaurantProductPrice = myCartMenuRestaurantProductPrice;
    }

    public String getMyCartMenuRestaurantProductQuantity() {
        return MyCartMenuRestaurantProductQuantity;
    }

    public void setMyCartMenuRestaurantProductQuantity(String myCartMenuRestaurantProductQuantity) {
        MyCartMenuRestaurantProductQuantity = myCartMenuRestaurantProductQuantity;
    }

    public String getMyCartMenuRestaurantTotalPrice() {
        return MyCartMenuRestaurantTotalPrice;
    }

    public void setMyCartMenuRestaurantTotalPrice(String myCartMenuRestaurantTotalPrice) {
        MyCartMenuRestaurantTotalPrice = myCartMenuRestaurantTotalPrice;
    }

    public String getAdd() {
        return add;
    }

    public String getNoCount(){
        return noCount;
    }



}

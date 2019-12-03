package com.example.lutto;

import android.widget.TextView;

public class MyOrderModel {

    private String myOrderProductName;
    private String myOrderRestaurantName;
    private String myOrderId;

    public MyOrderModel(String myOrderProductName, String myOrderRestaurantName, String myOrderId) {
        this.myOrderProductName = myOrderProductName;
        this.myOrderRestaurantName = myOrderRestaurantName;
        this.myOrderId = myOrderId;
    }

    public String getMyOrderProductName() {
        return myOrderProductName;
    }

    public void setMyOrderProductName(String myOrderProductName) {
        this.myOrderProductName = myOrderProductName;
    }

    public String getMyOrderRestaurantName() {
        return myOrderRestaurantName;
    }

    public void setMyOrderRestaurantName(String myOrderRestaurantName) {
        this.myOrderRestaurantName = myOrderRestaurantName;
    }

    public String getMyOrderId() {
        return myOrderId;
    }

    public void setMyOrderId(String myOrderId) {
        this.myOrderId = myOrderId;
    }
}

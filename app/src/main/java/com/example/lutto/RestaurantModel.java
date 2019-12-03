package com.example.lutto;

import android.widget.ImageView;
import android.widget.TextView;

public class RestaurantModel {

    private int restImage;
    private String restName;

    public RestaurantModel(int restImage, String restName) {
        this.restImage = restImage;
        this.restName = restName;

    }

    public int getRestImage() {
        return restImage;
    }

    public void setRestImage(int restImage) {
        this.restImage = restImage;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }


}

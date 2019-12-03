package com.example.lutto;

import android.widget.ImageView;
import android.widget.TextView;

public class CategoryRestaurantModel {
    private String categoryRestName;
    private int categoryRestImage;
    private String categoryRestcategory;
    private String categoryRestOffer;
    private String categoryRest_not_accepting_orders;
    private String categoryRestRating;

    public CategoryRestaurantModel(String categoryRestName, int categoryRestImage, String categoryRestcategory, String categoryRestOffer, String categoryRest_not_accepting_orders, String categoryRestRating) {
        this.categoryRestName = categoryRestName;
        this.categoryRestImage = categoryRestImage;
        this.categoryRestcategory = categoryRestcategory;
        this.categoryRestOffer = categoryRestOffer;
        this.categoryRest_not_accepting_orders = categoryRest_not_accepting_orders;
        this.categoryRestRating = categoryRestRating;
    }

    public String getCategoryRestName() {
        return categoryRestName;
    }

    public void setCategoryRestName(String categoryRestName) {
        this.categoryRestName = categoryRestName;
    }

    public int getCategoryRestImage() {
        return categoryRestImage;
    }

    public void setCategoryRestImage(int categoryRestImage) {
        this.categoryRestImage = categoryRestImage;
    }

    public String getCategoryRestcategory() {
        return categoryRestcategory;
    }

    public void setCategoryRestcategory(String categoryRestcategory) {
        this.categoryRestcategory = categoryRestcategory;
    }

    public String getCategoryRestOffer() {
        return categoryRestOffer;
    }

    public void setCategoryRestOffer(String categoryRestOffer) {
        this.categoryRestOffer = categoryRestOffer;
    }

    public String getCategoryRest_not_accepting_orders() {
        return categoryRest_not_accepting_orders;
    }

    public void setCategoryRest_not_accepting_orders(String categoryRest_not_accepting_orders) {
        this.categoryRest_not_accepting_orders = categoryRest_not_accepting_orders;
    }

    public String getCategoryRestRating() {
        return categoryRestRating;
    }

    public void setCategoryRestRating(String categoryRestRating) {
        this.categoryRestRating = categoryRestRating;
    }
}

package com.example.lutto;

public class CategoryModel {

    private int CategoryImagelink;
    private String categoryName;


    public CategoryModel(int categoryImagelink, String categoryName) {
        CategoryImagelink = categoryImagelink;
        this.categoryName = categoryName;
    }


    public int getCategoryImagelink() {
        return CategoryImagelink;
    }

    public void setCategoryImagelink(int categoryImagelink) {
        CategoryImagelink = categoryImagelink;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


}
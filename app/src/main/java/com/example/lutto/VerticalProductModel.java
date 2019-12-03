package com.example.lutto;



public class VerticalProductModel {

    private int productImmage;
    private String productName;
    private String productCategory;
    private String productDescription;
    private String productRating;

    public VerticalProductModel(int productImmage, String productName, String productCategory, String productDescription, String productRating) {
        this.productImmage = productImmage;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
        this.productRating = productRating;
    }

    public int getProductImmage() {
        return productImmage;
    }

    public void setProductImmage(int productImmage) {
        this.productImmage = productImmage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductRating() {
        return productRating;
    }

    public void setProductRating(String productRating) {
        this.productRating = productRating;
    }
}

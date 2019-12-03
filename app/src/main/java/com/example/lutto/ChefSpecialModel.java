package com.example.lutto;

public class ChefSpecialModel {

    private int chefSpecialImage;
    private  String chefSpecialName;
    private String chefSpecialRestaurnt;

    public ChefSpecialModel(int chefSpecialImage, String chefSpecialName, String chefSpecialRestaurnt) {
        this.chefSpecialImage = chefSpecialImage;
        this.chefSpecialName = chefSpecialName;
        this.chefSpecialRestaurnt = chefSpecialRestaurnt;
    }

    public int getChefSpecialImage() {
        return chefSpecialImage;
    }

    public void setChefSpecialImage(int chefSpecialImage) {
        this.chefSpecialImage = chefSpecialImage;
    }

    public String getChefSpecialName() {
        return chefSpecialName;
    }

    public void setChefSpecialName(String chefSpecialName) {
        this.chefSpecialName = chefSpecialName;
    }

    public String getChefSpecialRestaurnt() {
        return chefSpecialRestaurnt;
    }

    public void setChefSpecialRestaurnt(String chefSpecialRestaurnt) {
        this.chefSpecialRestaurnt = chefSpecialRestaurnt;
    }
}

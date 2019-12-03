package com.example.lutto;

public class RestaurantMenuStartOfferModel {

    private String OfferAmmount;
    private String offerOn;


    public RestaurantMenuStartOfferModel(String offerAmmount, String offerOn) {
        OfferAmmount = offerAmmount;
        this.offerOn = offerOn;
    }

    public String getOfferAmmount() {
        return OfferAmmount;
    }

    public void setOfferAmmount(String offerAmmount) {
        OfferAmmount = offerAmmount;
    }

    public String getOfferOn() {
        return offerOn;
    }

    public void setOfferOn(String offerOn) {
        this.offerOn = offerOn;
    }
}

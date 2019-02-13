package com.company.stories.shop;

import java.util.ArrayList;
import java.util.List;

public class BikeShop {

    private List<Purchase> purchases = new ArrayList<>();


    public void addPurchase(Purchase purchase) {
        purchases.add(purchase);
    }


    public String printAllPurchesesFrom(Date date) {
        StringBuilder builder = new StringBuilder();
        for (Purchase purchase : purchases) {
            if (purchase.getDate().equals(date)) builder.append(purchase);
        }
        return builder.toString();
    }

}

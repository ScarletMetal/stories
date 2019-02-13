package com.company.stories.shop;

public class Main {
    public static void main(String... args) {
        BikeShop shop = new BikeShop();

        Purchase p = new Purchase(500, new Date(5, 9, 2002),
                new CashPayment(250),
                new VisaPayment(2212, new Date(3, 3, 2010), 250));

        shop.addPurchase(p);
        System.out.println(p.checkPrice());
        System.out.println(shop.printAllPurchesesFrom(new Date(3, 3, 2010)));
    }
}

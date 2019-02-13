package com.company.stories.shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Purchase {

    private List<Payment> payments;

    private int price;

    private Date date;

    public Purchase(int price, Date date, Payment... payments) {
        this.price = price;
        this.date = date;
        this.payments = new ArrayList<>(Arrays.asList(payments));
    }

    public boolean checkPrice() {
        int paymentPrice = 0;

        for (Payment payment : payments) {
            paymentPrice += payment.getAmount();
        }


        return paymentPrice == price;
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        for (Payment payment : payments) {
            builder.append(payment);
        }

        return "Purchase{" +
                "payments=" + builder.toString() +
                ", price=" + price +
                '}';
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

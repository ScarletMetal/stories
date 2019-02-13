package com.company.stories.shop;

public abstract class Payment {

    private int amount;

    public Payment(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                '}';
    }
}

package com.company.stories.shop;

public class CheckPayment extends Payment{

    private int id;
    private String bankName;
    private Date paymentDate;

    public CheckPayment(int id, String bankName, Date paymentDate, int amount) {
        super(amount);

        this.id = id;
        this.bankName = bankName;
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "CheckPayment{" +
                "id=" + id +
                ", bankName='" + bankName + '\'' +
                ", paymentDate=" + paymentDate +
                '}';
    }
}

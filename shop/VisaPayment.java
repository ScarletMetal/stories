package com.company.stories.shop;

public class VisaPayment extends Payment {

    private Date experationDate;
    private int cardId;

    public VisaPayment(int cardId, Date experationDate,
                       int amount) {
        super(amount);
        this.cardId = cardId;
        this.experationDate = experationDate;
    }

    public Date getExperationDate() {
        return experationDate;
    }

    public void setExperationDate(Date experationDate) {
        this.experationDate = experationDate;
    }


    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "VisaPayment{" +
                "experationDate=" + experationDate +
                ", cardId=" + cardId +
                '}';
    }
}

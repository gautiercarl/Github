package com;

public class CreditCard {
    private String cardHolder;


        public CreditCard(String cardHolder){
            this.cardHolder=cardHolder;
        }
    public void payWithCreditCard(double amount){
        if(amount>0){
            System.out.println(cardHolder+" paid " +amount +" EUR by credit card");

        }
    }
}


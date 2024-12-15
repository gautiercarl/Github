package com.carl;

public class PayPal {
    private String accountHolder;

    public PayPal(String accountHolder){
        this.accountHolder=accountHolder;
    }
    public void payWithPayPal(double amount){
        if(amount>0){
            System.out.println(accountHolder+" paid " +amount +" EUR using Paypal");

        }
    }
  
}

package com.htw;

public class CreditCard extends PaymentMethod {
private static String name= "Credit Card";

    public CreditCard(String Holder) {
        super(Holder);
    } 

    public String getName(){
        return name;
    }
    

   

}

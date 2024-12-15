package com.htw;

public class PayPal extends PaymentMethod {
    private static String name= "Paypal";
   
    public PayPal(String Holder) {
        super(Holder);
    }
    public String getName(){
        return name;
    }
}

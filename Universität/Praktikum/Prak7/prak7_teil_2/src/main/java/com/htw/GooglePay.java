package com.htw;

public class GooglePay extends PaymentMethod {
    private static String name= "Google Pay";
   
    public GooglePay(String Holder) {
        super(Holder);
    }
    public String getName(){
        return name;
    }
}

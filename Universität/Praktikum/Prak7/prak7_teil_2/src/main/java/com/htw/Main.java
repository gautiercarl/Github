package com.htw;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard= new CreditCard("Tony");
        PaymentMethod paypal=new PayPal("Carl");
        PaymentMethod googlePay=new GooglePay("tutor");

       String creditCardUser= creditCard.getHolder();
       String paypalUser= paypal.getHolder();
       String googlePayUser= googlePay.getHolder();

       System.out.println("Credit card user: "+creditCardUser);
       System.out.println("Paypal user: "+paypalUser);
       System.out.println("Google pay user: "+googlePayUser);



        ArrayList<PaymentMethod> paymentMethods= new ArrayList<>();
        paymentMethods.add(creditCard);
        paymentMethods.add(paypal); 
        paymentMethods.add(googlePay); 
        // jedes Object im Array hat jetzt den Typ PaymentMethods deswegen müssen wir für die nutzung der Objekten casting nutzen
        System.out.println("paymentMethods Schleife");
        for(Object paymentMethod: paymentMethods){
            if(paymentMethod instanceof CreditCard){
                CreditCard newCreditCard =(CreditCard)paymentMethod;
                newCreditCard.processPayment(500, newCreditCard.getName());
                newCreditCard.refundPayment(50.00,newCreditCard.getName());
            } else if (paymentMethod instanceof PayPal) {
                PayPal newPaypal=(PayPal)paymentMethod;
                newPaypal.processPayment(500,newPaypal.getName());
                newPaypal.refundPayment(50.00,newPaypal.getName());

            }
            if(paymentMethod instanceof GooglePay){
                GooglePay newGooglePay=(GooglePay)paymentMethod;
                newGooglePay.processPayment(500,newGooglePay.getName());
                newGooglePay.refundPayment(50.00,newGooglePay.getName());

            }
        }

    }
    

}
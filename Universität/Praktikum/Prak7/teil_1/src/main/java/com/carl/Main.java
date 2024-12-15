package com.carl;

import java.util.ArrayList;

import com.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard= new CreditCard("Tony");
        PayPal paypal=new PayPal("Carl");
        creditCard.payWithCreditCard(500);
        paypal.payWithPayPal(500);

        ArrayList<Object> paymentMethods= new ArrayList<>();
        paymentMethods.add(creditCard);
        paymentMethods.add(paypal); // jedes Object im Array hat jetzt den Typ Object deswegen müssen wir für die nutzung der Objekten casting nutzen
        System.out.println("paymentMethods Schleife");
        for(Object paymentMethod: paymentMethods){
            if(paymentMethod instanceof CreditCard){
                CreditCard newCreditCard =(CreditCard)paymentMethod;
                newCreditCard.payWithCreditCard(500);
            } else if (paymentMethod instanceof PayPal) {
                PayPal newPaypal=(PayPal)paymentMethod;
                newPaypal.payWithPayPal(500);
            }
        }

    }
    
}

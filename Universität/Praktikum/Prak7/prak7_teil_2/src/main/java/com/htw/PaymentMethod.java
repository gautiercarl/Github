package com.htw;

abstract public class PaymentMethod {
    private String Holder;
      
    public String getHolder(){
        return Holder;
    }

        public PaymentMethod(String Holder){
            this.Holder=Holder;
        }
    public void processPayment(double amount, String paymentMethod){
        if(amount>0){
            System.out.println(Holder+" paid " +amount +" EUR by "+ paymentMethod);

        }
    }
    public void refundPayment(double amount, String paymentMethod){
        if(amount>0){
            System.out.println(Holder+" received a refund of " +amount +" EUR by "+ paymentMethod);

        }
    }
    
}

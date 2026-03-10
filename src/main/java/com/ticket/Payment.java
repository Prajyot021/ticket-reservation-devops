package com.ticket;

public class Payment {

    private double amount;
    private String method;

    public Payment(double amount,String method){
        this.amount = amount;
        this.method = method;
    }

    public void processPayment(){

        System.out.println("Payment of " + amount + " processed via " + method + " V.01");
    }
}
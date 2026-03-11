package com.ticket;

public class Payment {

    private double amount;
    private String method;

    public Payment(double amount,String method){
        this.amount = amount;
        this.method = method;
    }

    public boolean processPayment(){
        System.out.println("Payment of " + amount + " processed via " + method + " V.04");

        return true;

    }
}
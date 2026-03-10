package com.ticket;

public class Passenger {

    private String name;
    private int age;
    private String address;

    public Passenger(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void searchTrains(){
        System.out.println(name + " searching trains");
    }

    public void reserveSeat(Train train){
        System.out.println(name + " reserving seat on " + train.getTrainId());
    }

    public void purchaseTicket(Ticket ticket){
        System.out.println(name + " purchased ticket " + ticket.getTicketId());
    }

    public void cancelTicket(Ticket ticket){
        System.out.println(name + " cancelled ticket " + ticket.getTicketId());
    }

    public void makePayment(Payment payment){
        payment.processPayment();
    }
}
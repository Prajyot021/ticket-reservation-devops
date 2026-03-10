package com.ticket;

public class Ticket {

    private String ticketId;
    private Train train;
    private Passenger passenger;

    public Ticket(String ticketId, Train train, Passenger passenger){
        this.ticketId = ticketId;
        this.train = train;
        this.passenger = passenger;
    }

    public String getTicketId(){
        return ticketId;
    }

    public void printTicket(){

        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger V.01: " + passenger);
        System.out.println("Train: " + train);
    }
}
package com.ticket;

public class Main {

    public static void main(String[] args) {

        Train train = new Train("T102", "Express", 5);

        Passenger passenger = new Passenger("Mark", 25, "Chennai");

        TicketClerk clerk = new TicketClerk("Alice");

        Ticket ticket = clerk.issueTicket("TK001", train, passenger);

        Payment payment = new Payment(500, "UPI");

        passenger.makePayment(payment);

        if(ticket != null){
            ticket.printTicket();
        }
    }
}

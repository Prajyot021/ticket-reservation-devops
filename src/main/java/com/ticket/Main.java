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
        while (true) {
            try {
                Thread.sleep(60000); // sleep 1 minute, repeat forever
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

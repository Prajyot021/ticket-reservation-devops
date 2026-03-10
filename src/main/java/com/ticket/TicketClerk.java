package com.ticket;

public class TicketClerk {

    private String name;

    public TicketClerk(String name){
        this.name = name;
    }

    public Ticket issueTicket(String ticketId, Train train, Passenger passenger){

        if(train.reserveSeat()){

            Ticket ticket = new Ticket(ticketId,train,passenger);

            System.out.println(name + " issued ticket " + ticketId);

            return ticket;
        }

        System.out.println("No seats available");
        return null;
    }

    public void cancelTicket(Ticket ticket, Train train){

        train.cancelSeat();

        System.out.println(name + " cancelled ticket " + ticket.getTicketId());
    }
}
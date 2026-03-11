package com.ticket;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    @Test
    void testTrainSeatReservation(){

        Train train = new Train("T101","Express",5);

        boolean reserved = train.reserveSeat();

        assertTrue(reserved);
    }

    @Test
    void testTrainSeatFull(){

        Train train = new Train("T101","Express",1);

        train.reserveSeat(); // first seat
        boolean reserved = train.reserveSeat(); // second attempt

        assertFalse(reserved);
    }

    @Test
    void testPassengerCreation(){

        Passenger p = new Passenger("Rahul",25,"Chennai");

        assertEquals("Rahul", p.getName());
    }

    @Test
    void testTicketCreation(){

        Train train = new Train("T101","Express",5);
        Passenger passenger = new Passenger("Rahul",25,"Chennai");

        Ticket ticket = new Ticket("TK100", train, passenger);

        assertNotNull(ticket);
    }

    @Test
    void testPaymentProcessing(){

        Payment payment = new Payment(500, "UPI");

        boolean result = payment.processPayment();

        assertTrue(result);
    }
}

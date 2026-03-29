package com.ticket;

public class Train {

    private String trainId;
    private String model;
    private int availableSeats;

    public Train(String trainId, String model, int availableSeats) {
        this.trainId = trainId;
        this.model = model;
        this.availableSeats = availableSeats;
    }

    public String getTrainId() {
        return trainId;
    }

    public boolean reserveSeat() {

        if(availableSeats > 0){
            availableSeats--;
            return true;
        }

        return false;
    }

    public void cancelSeat(){
        availableSeats++;
    }

    @Override
    public String toString(){
        return "Train[ID=" + trainId + ", Model=" + model + "]" + " for V.08";
    }
}
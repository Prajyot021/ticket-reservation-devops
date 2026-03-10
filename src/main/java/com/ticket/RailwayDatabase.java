package com.ticket;

import java.util.ArrayList;
import java.util.List;

public class RailwayDatabase {

    private List<Train> trains = new ArrayList<>();

    public void addTrain(Train train){
        trains.add(train);
    }

    public Train searchTrain(String id){

        for(Train t : trains){
            if(t.getTrainId().equals(id)){
                return t;
            }
        }

        return null;
    }

    public void showAllTrains(){

        for(Train t : trains){
            System.out.println(t);
        }
    }
}
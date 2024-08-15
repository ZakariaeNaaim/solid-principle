package com.solid.di.solution;

/**
 * Created by Zakariae Naaim on 14-08-2024.
 */
public class Driver {

    private Vehicle vehicle;

    public Driver(final Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}

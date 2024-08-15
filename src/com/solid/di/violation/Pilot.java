package com.solid.di.violation;

/**
 * Created by Zakariae Naaim on 14-08-2024.
 */
public class Pilot {

    private RacingCar vehicle;

    public Pilot(){
        this.vehicle = new RacingCar(100);
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}

package com.solid.di.violation;

/**
 * Created by Zakariae Naaim on 14-08-2024.
 */
public class RacingCar {

    private final int maxFuel;
    private int remainingFuel;
    private int power;

    public RacingCar(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public void accelerate(){
        power++;
        remainingFuel--;
    }

}
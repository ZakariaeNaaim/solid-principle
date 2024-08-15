package com.solid.sr.solution;

/**
 * Created by Zakariae Naaim on 14-08-2024.
 */
public class FuelPump {

    public void reFuel(final Vehicle vehicle){
        final int remainingFuel = vehicle.getRemainingFuel();
        final int additionalFuel = vehicle.getMaxFuel() - remainingFuel;
        vehicle.setRemainingFuel(remainingFuel + additionalFuel);
    }
}

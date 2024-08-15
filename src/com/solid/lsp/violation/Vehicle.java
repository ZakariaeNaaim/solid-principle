package com.solid.lsp.violation;

/**
 * Created by Zakariae Naaim on 14-08-2024.
 */
public class Vehicle {

    private Gear gear;

    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        this.gear = gear;
    }

}
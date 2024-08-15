package com.solid.lsp.solution;

/**
 * Created by Zakariae Naaim on 14-08-2024.
 */
public class Vehicle {

    private boolean isMoving;
    private Gear gear;

    public void move(){
        isMoving = true;
    }

    public void stop(){
        isMoving = false;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        this.gear = gear;
    }

}
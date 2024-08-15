package com.solid.is.violation;

/**
 * Created by Zakariae Naaim on 14-08-2024.
 */
public abstract class Vehicle implements Switches {

    private boolean engineRunning;

    public boolean isEngineRunning() {
        return engineRunning;
    }

    @Override
    public void startEngine() {
        engineRunning = true;
    }

    @Override
    public void shutDownEngine() {
        engineRunning = false;
    }

}
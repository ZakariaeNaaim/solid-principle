package com.solid.oc.solution;

/**
 * Created by Zakariae Naaim on 14-08-2024.
 */
public class Sport implements DrivingMode {

    private static final int POWER = 500;
    private static final int SUSPENSION_HEIGHT = 10;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getSuspensionHeight() {
        return SUSPENSION_HEIGHT;
    }
}

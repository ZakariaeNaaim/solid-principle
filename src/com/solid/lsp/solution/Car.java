package com.solid.lsp.solution;

/**
 * Created by Zakariae Naaim on 14-08-2024.
 */
public class Car extends Vehicle {

    @Override
    public void changeGear(Gear gear) {
        Gear actualGear = getGear();
        if (isMovingForwards(gear, actualGear)
                || isMovingBackwards(gear, actualGear)) {
            stop();
        }
        super.changeGear(gear);
    }

    private boolean isMovingBackwards(Gear gear, Gear actualGear) {
        return isMoving() && Gear.R.equals(actualGear) && Gear.D.equals(gear);
    }

    private boolean isMovingForwards(Gear gear, Gear actualGear) {
        return isMoving() && Gear.D.equals(actualGear) && Gear.R.equals(gear);
    }
}

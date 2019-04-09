package com.vehicle.bridge;

import com.vehicle.bridge.Garage;

abstract class Vehicle implements Garage {
    protected Garage garage1;
    protected Garage garage2;

    protected Vehicle(Garage garage1, Garage garage2)
    {
        this.garage1 = garage1;
        this.garage2 = garage2;
    }

    abstract public void manufacture();
}

package com.vehicle.bridge;

import com.vehicle.bridge.Garage;

class Produce implements Garage {
    @Override
    public void work()
    {
        System.out.print("Produced");
    }
}

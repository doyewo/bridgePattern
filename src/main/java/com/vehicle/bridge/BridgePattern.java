package com.vehicle.bridge;

import com.vehicle.bridge.Assemble;
import com.vehicle.bridge.Bike;
import com.vehicle.bridge.Boat;

public class BridgePattern {
    public static void main(String[] args)
    {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();
        Vehicle vehicle2 = new Boat(new Produce(),new Assemble());
        vehicle2.manufacture();
        Vehicle vehicle3 = new Bike(new Produce(), new Assemble());
        vehicle3.manufacture();
    }
}

package com.vehicle.bridge;

class Boat extends Vehicle {
    public Boat(Garage garage1, Garage garage2)
    {
        super(garage1, garage2);
    }

    @Override
    public void manufacture()
    {
        System.out.print("Boat ");
        garage1.work();
        garage2.work();
    }
}

package com.vehicle.bridge;

class Bike extends Vehicle {
    public Bike(Garage garage1, Garage garage2)
    {
        super(garage1, garage2);
    }
    @Override
    public void manufacture()
    {
        System.out.print("Bike ");
        garage1.work();
        garage2.work();
    }
}

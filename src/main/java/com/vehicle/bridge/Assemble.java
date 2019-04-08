package com.vehicle.bridge;

class Assemble implements Garage {
    @Override
    public void work()
    {
        System.out.print(" And");
        System.out.println(" Assembled.");
    }
}

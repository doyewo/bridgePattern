class Car extends Vehicle {
    public Car(Garage garage1, Garage garage2)
    {
        super(garage1, garage2);
    }

    @Override
    public void manufacture()
    {
        System.out.print("Car ");
        garage1.work();
        garage2.work();
    }
}

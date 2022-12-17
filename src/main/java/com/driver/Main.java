package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        Car BMW=new Car("BMW",4,4,6,false,"car",4);
        BMW.changeSpeed(50,0);
        BMW.changeGear(3);

        Boat b=new Boat("ab",4);
        b.getVehicleName();
        b.getVehicleCapacity();

    }
}
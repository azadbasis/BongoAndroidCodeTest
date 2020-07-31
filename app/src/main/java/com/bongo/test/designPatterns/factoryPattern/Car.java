package com.bongo.test.designPatterns.factoryPattern;

import com.bongo.test.designPatterns.Vehicle;

public class Car implements Vehicle {
    public static boolean hasGas;
    public static int carWheels;
    public static int carPassengers;

    @Override
    public int set_num_of_wheels() {
        if (carWheels == 0) {
            System.out.println("There is no wheels in this car");
        } else {
            System.out.println("There are "+carWheels +" wheels in this car"  );
        }
        return carWheels;
    }

    @Override
    public int set_num_of_passengers() {
        if (carPassengers==0){
            System.out.println("There is no passengers in this car");
        }else {

            System.out.println("There are "+carPassengers+" passenger in this car " );
        }
        return carPassengers;
    }

    @Override
    public boolean has_gas() {
        if (hasGas){
            System.out.println("This car is filled with gas");
        }else {
            System.out.println("There is no gas in this car");
        }
        return hasGas;
    }
}

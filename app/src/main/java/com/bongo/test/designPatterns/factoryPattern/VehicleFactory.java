package com.bongo.test.designPatterns.factoryPattern;

import com.bongo.test.designPatterns.Vehicle;

import static com.bongo.test.utils.Constants.*;

public class VehicleFactory {

    //use getShape method to get object of type shape
    public Vehicle getVehicle(String vehicleType){
        if(vehicleType == null){
            System.out.println("There is null vehicle!");
            return null;
        }
        if(vehicleType.equalsIgnoreCase(CAR)){
            System.out.println("Here is a new car");
            return new Car();

        } else if(vehicleType.equalsIgnoreCase(PLANE)){
            System.out.println("Here is a new plane");
            return new Plane();

        }
        System.out.println("There is empty vehicle!");
        return null;
    }
}

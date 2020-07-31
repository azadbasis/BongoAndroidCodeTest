package com.bongo.test.designPatterns.singletonPattern;

import com.bongo.test.designPatterns.Vehicle;

public class PlaneSingleton implements Vehicle{
    public static int planeWheels;
    public static int planePassengers;
    public static boolean hasGas;
    private static PlaneSingleton ourInstance = new PlaneSingleton();

    public static PlaneSingleton getInstance() {
        return ourInstance;
    }

    private PlaneSingleton() {
    }

    @Override
    public int set_num_of_wheels() {
        if (planeWheels == 0) {
            System.out.println("There is no wheels in this plane");
        } else {
            System.out.println("There are "+planeWheels +" wheels in this plane"  );
        }
        return planeWheels;
    }

    @Override
    public int set_num_of_passengers() {
        if (planePassengers==0){
            System.out.println("There is no passengers in this plan");
        }else {

            System.out.println("There are "+planePassengers+" passenger in this plan " );
        }
        return planePassengers;
    }

    @Override
    public boolean has_gas() {
        if (hasGas){
            System.out.println("This plane is filled with gas");
        }else {
            System.out.println("There is no gas in this plane");
        }
        return hasGas;
    }
}

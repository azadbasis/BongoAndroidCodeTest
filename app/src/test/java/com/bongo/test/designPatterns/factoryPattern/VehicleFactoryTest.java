package com.bongo.test.designPatterns.factoryPattern;

import com.bongo.test.designPatterns.Vehicle;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.bongo.test.utils.Constants.CAR;
import static com.bongo.test.utils.Constants.PLANE;
import static org.junit.Assert.*;

public class VehicleFactoryTest {
    private VehicleFactory vehicleFactory;

    @Before
    public void setUp() throws Exception {
        vehicleFactory = new VehicleFactory();
        System.out.println("Ready for testing... ");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Done with unit test");
    }

    @Test
    public void testGetVehicleWithNull() {
        Vehicle vehicle = vehicleFactory.getVehicle(null);
        Assert.assertEquals(null, vehicle);
    }
    @Test
    public void testGetVehicleWithEmpty() {
        Vehicle vehicle = vehicleFactory.getVehicle("");
        Assert.assertEquals(null, vehicle);
    }

    @Test
    public void getVehicle() {
        Vehicle vehicleCar = vehicleFactory.getVehicle(CAR);
        Vehicle vehiclePlan = vehicleFactory.getVehicle(PLANE);
        Car car = new Car();
        car.hasGas = true;
        car.carWheels = 4;
        car.carPassengers = 5;
        assertEquals(true, vehicleCar.has_gas());
        assertEquals(4, vehicleCar.set_num_of_wheels());
        assertEquals(5, vehicleCar.set_num_of_passengers());

        Plane plane = new Plane();
        plane.hasGas = true;
        plane.planeWheels = 14;
        plane.planePassengers = 150;
        assertEquals(true, vehiclePlan.has_gas());
        assertEquals(14, vehiclePlan.set_num_of_wheels());
        assertEquals(150, vehiclePlan.set_num_of_passengers());
    }

    @Test
    public void testGetVehicle_with_zero_and_false() {
        Vehicle vehicleCar = vehicleFactory.getVehicle(CAR);
        Vehicle vehiclePlan = vehicleFactory.getVehicle(PLANE);
        Car car = new Car();
        car.hasGas = false;
        car.carWheels = 0;
        car.carPassengers = 0;
        assertEquals(false, vehicleCar.has_gas());
        assertEquals(0, vehicleCar.set_num_of_wheels());
        assertEquals(0, vehicleCar.set_num_of_passengers());

        Plane plane = new Plane();
        plane.hasGas = false;
        plane.planeWheels = 0;
        plane.planePassengers = 0;
        assertEquals(false, vehiclePlan.has_gas());
        assertEquals(0, vehiclePlan.set_num_of_wheels());
        assertEquals(0, vehiclePlan.set_num_of_passengers());
    }


}
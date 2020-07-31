package com.bongo.test.designPatterns.singletonPattern;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarSingletonTest {
    CarSingleton carSingleton;

    @Before
    public void setUp() throws Exception {
        carSingleton = CarSingleton.getInstance();
        System.out.println("Ready for testing");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Done with unit test");
    }

    @Test
    public void getInstance() {
        CarSingleton instance = CarSingleton.getInstance();
        Assert.assertEquals(carSingleton, instance);
    }

    @Test
    public void set_num_of_wheels() {
        CarSingleton.carWheels = 4;
        Assert.assertEquals("CarWheels", 4, carSingleton.set_num_of_wheels());
    }

    @Test
    public void test_set_num_of_wheels_with_zero() {
        CarSingleton.carWheels = 0;
        Assert.assertEquals("CarWheels", 0, carSingleton.set_num_of_wheels());
    }

    @Test
    public void set_num_of_passengers() {
        CarSingleton.carPassengers = 5;
        Assert.assertEquals("CarHasPassenger", 5, carSingleton.set_num_of_passengers());
    }

    @Test
    public void test_set_num_of_passengers_by_zero() {
        CarSingleton.carPassengers = 0;
        Assert.assertEquals("CarHasPassenger", 0, carSingleton.set_num_of_passengers());
    }

    @Test
    public void has_gas() {
        CarSingleton.hasGas = true;
        assertTrue("CarHasGas", carSingleton.has_gas());


    }

    @Test
    public void test_has_gas_with_false() {
        CarSingleton.hasGas = false;
        assertFalse("CarHasGas", carSingleton.has_gas());
    }
}
package com.bongo.test.designPatterns.singletonPattern;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneSingletonTest {
    PlaneSingleton planeSingleton;

    @Before
    public void setUp() throws Exception {
        planeSingleton = PlaneSingleton.getInstance();
        System.out.println("Ready for testing");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Done with unit test");
    }

    @Test
    public void getInstance() {
        PlaneSingleton instance = PlaneSingleton.getInstance();
        Assert.assertEquals(planeSingleton, instance);
    }

    @Test
    public void set_num_of_wheels() {
        PlaneSingleton.planeWheels = 10;
        Assert.assertEquals("Plane wheels:", 10, planeSingleton.set_num_of_wheels());
    }

    @Test
    public void test_set_num_of_wheels_with_zero() {
        PlaneSingleton.planeWheels = 0;
        Assert.assertEquals("Plane wheels:", 0, planeSingleton.set_num_of_wheels());
    }

    @Test
    public void set_num_of_passengers() {
        PlaneSingleton.planePassengers = 100;
        Assert.assertEquals("Plane passengers: ", 100, planeSingleton.set_num_of_passengers());
    }

    @Test
    public void test_set_num_of_passengers_with_zero() {
        PlaneSingleton.planePassengers = 0;
        Assert.assertEquals("Plane passengers: ", 0, planeSingleton.set_num_of_passengers());
    }

    @Test
    public void has_gas() {
        PlaneSingleton.hasGas = true;
        Assert.assertTrue("Plane has gas: ", planeSingleton.has_gas());
    }

    @Test
    public void test_has_gas_with_false() {
        PlaneSingleton.hasGas = false;
        Assert.assertFalse("Plane has gas: ", planeSingleton.has_gas());
    }
}
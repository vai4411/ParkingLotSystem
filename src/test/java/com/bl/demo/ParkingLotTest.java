package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class ParkingLotTest {

    @Test
    public void givenAVehicle_WhenParked_ShouldReturnTrue() {
        ParkingSystem parkingSystem = new ParkingSystem();
        boolean isPark = parkingSystem.park(new Object());
        Assert.assertTrue(isPark);
    }

    @Test
    public void givenAVehicle_WhenUnparked_ShouldReturnTrue() {
        ParkingSystem parkingSystem = new ParkingSystem();
        boolean isUnparked = parkingSystem.unpark(new Object());
        Assert.assertTrue(isUnparked);
    }
}

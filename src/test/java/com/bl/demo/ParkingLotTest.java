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
}

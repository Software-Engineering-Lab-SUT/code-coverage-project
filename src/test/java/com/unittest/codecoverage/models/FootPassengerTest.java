package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FootPassengerTest {
    @Test
    public void testSetterAndGetterCrossedTheCrosswalk() {
        FootPassenger footPassenger = new FootPassenger();

        footPassenger.setCrossedTheCrosswalk(true);
        assertTrue(footPassenger.crossedTheCrosswalk());

        footPassenger.setCrossedTheCrosswalk(false);
        assertFalse(footPassenger.crossedTheCrosswalk());
    }
    
    @Test
    public void testSetterAndGetterCrossedTrafficLight() {
        FootPassenger footPassenger = new FootPassenger();

        footPassenger.setCrossedTrafficLight(TrafficLight.GREEN);
        assertEquals(TrafficLight.GREEN, footPassenger.getCrossedTrafficLight());

        footPassenger.setCrossedTrafficLight(TrafficLight.RED);
        assertEquals(TrafficLight.RED, footPassenger.getCrossedTrafficLight());

        footPassenger.setCrossedTrafficLight(TrafficLight.YELLOW);
        assertEquals(TrafficLight.YELLOW, footPassenger.getCrossedTrafficLight());
    }

    @Test
    public void testSetterAndGetterLookedToTheRight() {
        FootPassenger footPassenger = new FootPassenger();

        footPassenger.setLookedToTheRight(true);
        assertTrue(footPassenger.lookedToTheRight());

        footPassenger.setLookedToTheRight(false);
        assertFalse(footPassenger.lookedToTheRight());
    }

    @Test
    public void testSetterAndGetterLookedToTheLeft() {
        FootPassenger footPassenger = new FootPassenger();

        footPassenger.setLookedToTheLeft(true);
        assertTrue(footPassenger.lookedToTheLeft());

        footPassenger.setLookedToTheLeft(false);
        assertFalse(footPassenger.lookedToTheLeft());
    }

    @Test
    public void testSetterAndGetterCrossedTheRoad() {
        FootPassenger footPassenger = new FootPassenger();

        footPassenger.setCrossedTheRoad(true);
        assertTrue(footPassenger.crossedTheRoad());

        footPassenger.setCrossedTheRoad(false);
        assertFalse(footPassenger.crossedTheRoad());
    }
}

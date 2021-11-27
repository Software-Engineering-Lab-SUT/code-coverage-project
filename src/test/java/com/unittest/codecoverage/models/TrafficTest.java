package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrafficTest {
    @Test
    public void testSetterAndGetterCurrentTrafficLight() {
        Traffic traffic = new Traffic();

        traffic.setCurrentTrafficLight(TrafficLight.RED);
        assertEquals(TrafficLight.RED, traffic.getCurrentTrafficLight());

        traffic.setCurrentTrafficLight(TrafficLight.GREEN);
        assertEquals(TrafficLight.GREEN, traffic.getCurrentTrafficLight());

        traffic.setCurrentTrafficLight(TrafficLight.YELLOW);
        assertEquals(TrafficLight.YELLOW, traffic.getCurrentTrafficLight());
    }

    @Test
    public void testSetterAndGetterIntenseCarTraffic() {
        Traffic traffic = new Traffic();

        traffic.setIntenseCarTraffic(true);
        assertTrue(traffic.intenseCarTraffic());

        traffic.setIntenseCarTraffic(false);
        assertFalse(traffic.intenseCarTraffic());
    }

    @Test
    public void testSetterAndGetterMaxSpeedAllowed() {
        Traffic traffic = new Traffic();

        traffic.setMaxSpeedAllowed((short) 60);
        assertEquals((short) 60, traffic.getMaxSpeedAllowed());

        traffic.setMaxSpeedAllowed((short) 40);
        assertEquals((short) 40, traffic.getMaxSpeedAllowed());
    }

    @Test
    public void testSetterAndGetterMinSpeedAllowed() {
        Traffic traffic = new Traffic();

        traffic.setMinSpeedAllowed((short) 60);
        assertEquals((short) 60, traffic.getMinSpeedAllowed());

        traffic.setMinSpeedAllowed((short) 40);
        assertEquals((short) 40, traffic.getMinSpeedAllowed());
    }

    @Test
    public void testSetterAndGetterStreetDirectionFlow() {
        Traffic traffic = new Traffic();

        traffic.setStreetDirectionFlow(StreetDirectionFlow.ONE_WAY);
        assertEquals(StreetDirectionFlow.ONE_WAY, traffic.getStreetDirectionFlow());

        traffic.setStreetDirectionFlow(StreetDirectionFlow.TWO_WAY);
        assertEquals(StreetDirectionFlow.TWO_WAY, traffic.getStreetDirectionFlow());
    }
}

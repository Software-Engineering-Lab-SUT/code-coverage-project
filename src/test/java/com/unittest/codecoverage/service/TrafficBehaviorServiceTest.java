package com.unittest.codecoverage.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.unittest.codecoverage.exceptions.BehaviorException;
import com.unittest.codecoverage.models.FootPassenger;
import com.unittest.codecoverage.models.Traffic;
import com.unittest.codecoverage.models.TrafficLight;
import com.unittest.codecoverage.services.TrafficBehaviorService;
import com.unittest.codecoverage.services.impl.TrafficBehaviorServiceImpl;

public class TrafficBehaviorServiceTest {

	private TrafficBehaviorService trafficBehaviorService = new TrafficBehaviorServiceImpl();

	@Test
	public void testFootPassengerCrossTheStreet_shouldThrowBehaviorExceptionWhenFootPassengerCrossesTheRoadDuringHeavyTrafficAndWhileTheTrafficLightIsRed() {

		Traffic currentTraffic = new Traffic();
		currentTraffic.setIntenseCarTraffic(true);

		FootPassenger currentFootPassengerBehavior = new FootPassenger();
		currentFootPassengerBehavior.setCrossedTheRoad(true);
		currentFootPassengerBehavior.setCrossedTrafficLight(TrafficLight.RED);

		Assertions.assertThatThrownBy(() -> trafficBehaviorService.footPassengerCrossTheStreet(currentTraffic, currentFootPassengerBehavior))
				.isInstanceOf(BehaviorException.class)
				.hasMessageContaining("You shouldn't do that, reckless person");

	}

	@Test
	@DisplayName("Should throw exception when footPassenger crosses the road during heavy traffic without attention")
	public void testFootPassengerCrossTheStreet_shouldThrowBehaviorExceptionWhenFootPassengerCrossesTheRoadDuringHeavyTrafficWithoutLookSides() {

		Traffic currentTraffic = new Traffic();
		currentTraffic.setIntenseCarTraffic(true);

		FootPassenger currentFootPassengerBehavior = new FootPassenger();
		currentFootPassengerBehavior.setCrossedTheRoad(true);
		currentFootPassengerBehavior.setCrossedTrafficLight(TrafficLight.GREEN);
		currentFootPassengerBehavior.setLookedToTheLeft(false);
		currentFootPassengerBehavior.setLookedToTheRight(false);

		Assertions.assertThatThrownBy(() -> trafficBehaviorService.footPassengerCrossTheStreet(currentTraffic, currentFootPassengerBehavior))
				.isInstanceOf(BehaviorException.class)
				.hasMessage("You should be more careful");

	}
}

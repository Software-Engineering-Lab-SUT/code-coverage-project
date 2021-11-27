package com.unittest.codecoverage.services.impl;

import com.unittest.codecoverage.exceptions.BehaviorException;
import com.unittest.codecoverage.models.FootPassenger;
import com.unittest.codecoverage.models.Traffic;
import com.unittest.codecoverage.models.TrafficLight;
import com.unittest.codecoverage.services.TrafficBehaviorService;

public class TrafficBehaviorServiceImpl implements TrafficBehaviorService {

	@Override
	public void footPassengerCrossTheStreet(Traffic currentTraffic, FootPassenger currentFootPassengerBehavior) {
		if (TrafficLight.RED.equals(currentFootPassengerBehavior.getCrossedTrafficLight()) &&
				currentFootPassengerBehavior.crossedTheRoad() &&
				currentTraffic.intenseCarTraffic()) {
			throw new BehaviorException("You shouldn't do that, reckless person");
		}

		if (TrafficLight.GREEN.equals(currentFootPassengerBehavior.getCrossedTrafficLight()) &&
				currentTraffic.intenseCarTraffic() &&
				!currentFootPassengerBehavior.lookedToTheLeft() &&
				!currentFootPassengerBehavior.lookedToTheRight()) {
			throw new BehaviorException("You should be more careful");
		}
	}
}

package com.unittest.codecoverage.services;

import com.unittest.codecoverage.models.FootPassenger;
import com.unittest.codecoverage.models.Traffic;

public interface TrafficBehaviorService {

	void footPassengerCrossTheStreet(Traffic currentTraffic, FootPassenger currentFootPassengerBehavior);
}

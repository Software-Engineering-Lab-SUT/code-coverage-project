package com.unittest.codecoverage.models;

public class FootPassenger {

	private boolean crossedTheCrosswalk;
	private TrafficLight crossedTrafficLight;
	private boolean lookedToTheRight;
	private boolean lookedToTheLeft;
	private boolean crossedTheRoad;

	public boolean crossedTheCrosswalk() {
		return crossedTheCrosswalk;
	}

	public void setCrossedTheCrosswalk(boolean crossedTheCrosswalk) {
		this.crossedTheCrosswalk = crossedTheCrosswalk;
	}

	public TrafficLight getCrossedTrafficLight() {
		return crossedTrafficLight;
	}

	public void setCrossedTrafficLight(TrafficLight crossedSignaling) {
		this.crossedTrafficLight = crossedSignaling;
	}

	public boolean lookedToTheRight() {
		return lookedToTheRight;
	}

	public void setLookedToTheRight(boolean lookedToTheRight) {
		this.lookedToTheRight = lookedToTheRight;
	}

	public boolean lookedToTheLeft() {
		return lookedToTheLeft;
	}

	public void setLookedToTheLeft(boolean lookedToTheLeft) {
		this.lookedToTheLeft = lookedToTheLeft;
	}

	public boolean crossedTheRoad() {
		return crossedTheRoad;
	}

	public void setCrossedTheRoad(boolean crossedTheStreet) {
		this.crossedTheRoad = crossedTheStreet;
	}
}

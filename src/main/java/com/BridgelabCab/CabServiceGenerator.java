package com.BridgelabCab;

/**
 * CabServiceGenerator class calculates total fare
 */
public class CabServiceGenerator {

	private static final double MINIMUM_COST_PER_KM = 10;
	private static final int COST_PER_MINUTE = 1;
	private static final double MINIMUM_FARE = 5;

	/**
	 * method to find total fare given distance and time
	 * 
	 * @param distance
	 * @param time
	 * @return
	 */
	public double calculateFare(double distance, int time) {

		double fare = distance * MINIMUM_COST_PER_KM + time * COST_PER_MINUTE;
		if (fare < 5) {
			return MINIMUM_FARE;
		} else
			return fare;

	}

	public double calculateFare(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += this.calculateFare(ride.distance, ride.time);
		}
		return totalFare;

	}

	public int count(Ride[] rides) {
		int count = 0;
		for (Ride ride : rides) {
			count += 1;
		}
		return count;
	}

	public double calculateAverage(double totalFare, int count) {
		return totalFare / count;
	}
}
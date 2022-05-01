package com.BridgelabCab;

import org.junit.Test;

import junit.framework.Assert;

public class CabServiceGeneratorTest {
	/**
	 * test case for calculating total fare
	 */
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		double distance = 2.0;
		int time = 5;
		CabServiceGenerator cabServiceGenerator = new CabServiceGenerator();
		double fare = cabServiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(25.0, fare);

	}

	/**
	 * test case total fare is less than minimum fare should return minimum fare
	 */
	@Test
	public void givenLessDistanceAndTime_ShouldReturnMiniumumFare() {
		double distance = 0.1;
		int time = 2;
		CabServiceGenerator cabServiceGenerator = new CabServiceGenerator();
		double fare = cabServiceGenerator.calculateFare(distance, time);
		System.out.println(fare);
		Assert.assertEquals(5.0, fare);
	}
	/**
	 * test case to calculate total fare for multiple rides
	 */
	@Test
	public void givenMultipleRides_ShouldReturnAggregateTotalFare() {
		CabServiceGenerator cabServiceGenerator = new CabServiceGenerator();
		Ride[] rides = { new Ride(2.0,5),
				         new Ride(0.1,1),
						};
		double fare = cabServiceGenerator.calculateFare(rides);
		System.out.println(fare);
		Assert.assertEquals(30.0, fare);
	}
	
	

}
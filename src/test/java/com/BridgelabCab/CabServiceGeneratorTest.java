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
		Assert.assertEquals(30.0, fare);
	}
	
	/**
	 * test case to calculate total no of rides and average fare
	 */
	@Test
	public void givenMultipleRides_ShouldreturnCountOfRidesAndAverageFarePerRide() {
		CabServiceGenerator cabServiceGenerator = new CabServiceGenerator();
		Ride[] rides = { new Ride(2.0,5),
				         new Ride(0.1,1),
						};
		double fare = cabServiceGenerator.calculateFare(rides);
		int count = cabServiceGenerator.count(rides);
		double average = cabServiceGenerator.calculateAverage(fare, count);
		Assert.assertEquals(15.0, average);
	}
	
	/**
	 * test case to calculate total no of rides and average fare and generate summary
	 */
	@Test
	public void givenMultipleRides_ShouldreturnSummary() {
		CabServiceGenerator cabServiceGenerator = new CabServiceGenerator();
		
		Ride[] rides = { new Ride(2.0,5),
				         new Ride(0.1,1),
						};
		double fare = cabServiceGenerator.calculateFare(rides);
		int count = cabServiceGenerator.count(rides);
		double average = cabServiceGenerator.calculateAverage(fare, count);
		InvoiceSummary invoiceSummary = new InvoiceSummary(fare,count,average);
		Assert.assertEquals(15.0, average);
		System.out.println(invoiceSummary);
	}

}
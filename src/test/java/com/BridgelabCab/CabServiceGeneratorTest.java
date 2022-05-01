package com.BridgelabCab;

import static org.junit.Assert.*;
import org.junit.Test;

import junit.framework.Assert;

import org.junit.Test;

public class CabServiceGeneratorTest {

			@Test
			public void givenDistanceAndTime_ShouldReturnTotalFare() {
				double distance = 2.0;
				int time = 5;
				CabServiceGenerator cabServiceGenerator = new CabServiceGenerator();
				double fare = cabServiceGenerator.calculateFare(distance,time);
				Assert.assertEquals(25.0, fare);
				
				
			}
	}



package com.epam.Task4_CalculateInterest;

import org.junit.Test;

import junit.framework.TestCase;

public class SimpleInterestTest extends TestCase 
{
	private static final double DELTA = 1e-15;
	CalculateInterest calculateInterest=Factory.interestType("Simple");
	@Test
	public void test() 
	{
		assertEquals(2500.00,calculateInterest.interest(5000,5,10),DELTA);
	}
}


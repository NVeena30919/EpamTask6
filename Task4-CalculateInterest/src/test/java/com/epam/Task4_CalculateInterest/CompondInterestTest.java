package com.epam.Task4_CalculateInterest;

import org.junit.Test;

import junit.framework.TestCase;

public class CompondInterestTest extends TestCase 
{
	private static final double DELTA = 1e-15;
	CalculateInterest calculateInterest=Factory.interestType("Compound");
	@Test
	public void test() 
	{
		assertEquals(3.02330875E11,calculateInterest.interest(5000,5,10),DELTA);
	}
}

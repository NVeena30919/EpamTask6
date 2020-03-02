package com.epam.Task4_CalculateInterest;

public class Factory 
{
	public static CalculateInterest interestType(String type)
	{
		if(type.equals("Simple"))
			return new SimpleInterest();
		else
			return new CompoundInterest();
	}

}
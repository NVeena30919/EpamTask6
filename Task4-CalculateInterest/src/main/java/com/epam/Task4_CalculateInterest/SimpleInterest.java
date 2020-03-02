package com.epam.Task4_CalculateInterest;

public class SimpleInterest extends CalculateInterest 
{

	@Override
	public double interest(double Principle, double Rate, double Years) 
	{
		return (Principle*Rate*Years)/100;
	}

}

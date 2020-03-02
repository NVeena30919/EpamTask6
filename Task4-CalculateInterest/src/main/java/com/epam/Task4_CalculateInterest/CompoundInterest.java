package com.epam.Task4_CalculateInterest;

public class CompoundInterest extends CalculateInterest {

	@Override
	public double interest(double principle, double rate, double years) 
	{
		return principle*Math.pow(rate+1,years)-principle;
	}

}

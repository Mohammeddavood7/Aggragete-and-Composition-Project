package com.customerExceptionn;

@SuppressWarnings("serial")
public class CarHeat extends Exception 
{
	public CarHeat()
	{
		super();
	}
	
	public CarHeat(String errorMessage)
	{
		super(errorMessage);
	}


}

package com.customerExceptionn;

@SuppressWarnings("serial")
public class CarStopped extends Exception
{
	public CarStopped()
	{
		super();
	}
	
	public CarStopped(String errorMessage)
	{
		super(errorMessage);
	}
	

}

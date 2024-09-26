package com.customerExceptionn;

@SuppressWarnings("serial")
public class CarPunctured extends Exception
{
	public CarPunctured()
	{
		super();
	}
	
	public CarPunctured(String errorMessage)
	{
		super(errorMessage);
	}

}

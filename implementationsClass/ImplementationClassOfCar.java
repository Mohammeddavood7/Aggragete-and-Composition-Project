package com.implementationsClass;

import com.carrequirements.CarRequirement;
import com.customerExceptionn.CarHeat;
import com.customerExceptionn.CarPunctured;
import com.customerExceptionn.CarStopped;

public class ImplementationClassOfCar implements CarRequirement
{

	@Override
	public void stop(String msg) throws CarStopped 
	{
		if(msg.equalsIgnoreCase("Stop"))
		{
			throw new CarStopped("Car is stopped...");
		}
		else
		{
			System.out.println("Car is not stopped");
		}

	}

	@Override
	public void puncture(String msg) throws CarPunctured 
	{
		if(msg.equalsIgnoreCase("puncture"))
		{
			throw new CarPunctured("Car is punctured.....");
		}
		else
		{
			System.out.println("Car is not punctured...");
		}

	}

	@Override
	public void carHeat(int temp) throws CarHeat 
	{
		if(temp > 50)
		{
			throw new CarHeat("Car is more then 50deg...");
		}
		else
		{
			System.out.println("Car is not more then 50deg....");
		}


	}

}

package com.carrequirements;

import com.customerExceptionn.CarHeat;
import com.customerExceptionn.CarPunctured;
import com.customerExceptionn.CarStopped;

public interface CarRequirement
{
	public void stop(String msg) throws CarStopped;
	public void puncture(String msg) throws CarPunctured;
	public void carHeat(int temp) throws CarHeat;

}

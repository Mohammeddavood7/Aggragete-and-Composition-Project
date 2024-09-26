package com.user;

import com.customerExceptionn.CarHeat;
import com.customerExceptionn.CarPunctured;
import com.customerExceptionn.CarStopped;
import com.implementationsClass.ImplementationClassOfCar;

public class CarUser
{
	public static void main(String[] args) 
	{
		ImplementationClassOfCar ic = new ImplementationClassOfCar();
		try {
			ic.stop("stop");
		} catch (CarStopped e) {
			
			System.err.println(e);
		}
		
		try {
			ic.puncture("puncture");
		} catch (CarPunctured e) {
			System.err.println(e);
		}
		
		
		try {
			ic.carHeat(60);
		} catch (CarHeat e) {
			System.err.println(e);
		}
		
	}

}

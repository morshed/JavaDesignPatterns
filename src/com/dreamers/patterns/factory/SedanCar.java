/**
 * 
 */
package com.dreamers.patterns.factory;

/**
 * Concrete Sedan Car.
 * 
 * @author Shekh
 *
 */
public class SedanCar extends Car {

	public SedanCar() {
		super(CarType.SEDAN);		
	}

	/* (non-Javadoc)
	 * @see com.dreamers.patterns.factory.Car#constructCar()
	 */
	@Override
	public void constructCar() {
		System.out.println("initialize Sedan car properties.");
	}

}

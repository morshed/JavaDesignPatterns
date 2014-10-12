/**
 * 
 */
package com.dreamers.patterns.factory;

/**
 * Concrete Sports Car.
 * 
 * @author Shekh
 *
 */
public class SportsCar extends Car {

	public SportsCar() {
		super(CarType.SPORTS);		
	}

	/* (non-Javadoc)
	 * @see com.dreamers.patterns.factory.Car#constructCar()
	 */
	@Override
	public void constructCar() {
		System.out.println("initialize Sports car properties.");
	}

}

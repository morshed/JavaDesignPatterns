/**
 * 
 */
package com.dreamers.patterns.factory;

/**
 * Concrete Estate Car.
 * 
 * @author Shekh
 *
 */
public class EstateCar extends Car {

	public EstateCar() {
		super(CarType.ESTATE);		
	}

	/* (non-Javadoc)
	 * @see com.dreamers.patterns.factory.Car#constructCar()
	 */
	@Override
	public void constructCar() {
		System.out.println("initialize Estate car properties.");

	}

}

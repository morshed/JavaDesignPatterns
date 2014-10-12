/**
 * 
 */
package com.dreamers.patterns.factory;

/**
 * Concrete HatchBack Car.
 * @author Shekh
 *
 */
public class HatchBackCar extends Car {

	public HatchBackCar() {
		super(CarType.HATCHBACK);		
	}

	/* (non-Javadoc)
	 * @see com.dreamers.patterns.factory.Car#constructCar()
	 */
	@Override
	public void constructCar() {
		System.out.println("initialize Hatchback car properties.");

	}

}

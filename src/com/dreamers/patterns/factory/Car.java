/**
 * 
 */
package com.dreamers.patterns.factory;

/**
 * Root Domain object.
 * 
 * @author Shekh
 *
 */
public abstract class Car {
	
	private CarType carType;
	
	public Car(CarType carType) {
		this.carType = carType;
	}
	
	// constructCar on specific individual implementation
	public abstract void constructCar();

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}
		
}

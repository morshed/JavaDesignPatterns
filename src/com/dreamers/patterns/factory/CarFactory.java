/**
 * 
 */
package com.dreamers.patterns.factory;

/**
 * 
 * Car factory to create different type of cars.
 * 
 * @author Shekh
 *
 */
public class CarFactory {

	public static Car buildCar(CarType carType) throws CarNotFoundException {
		
		Car car = null;
		
		switch(carType) {
			case HATCHBACK:
				car = new HatchBackCar();
				break;
				
			case SEDAN:
				car = new SedanCar();
				break;
				
			case ESTATE:
				car = new EstateCar();
				break;
				
			case SPORTS:
				car = new SportsCar();
				break;
				
			default:
				throw new CarNotFoundException("Invalid car type provided. Please check.");				
		}
		
		return car;
		
	}
}

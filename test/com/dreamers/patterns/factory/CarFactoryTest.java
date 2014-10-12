/**
 * 
 */
package com.dreamers.patterns.factory;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Shekh
 *
 */
public class CarFactoryTest {

	/**
	 * Test method for {@link com.dreamers.patterns.factory.CarFactory#buildCar(com.dreamers.patterns.factory.CarType)}.
	 */
	@Test
	public void testHatchbackBuildCar() {

		Car hatchBack = null;
		try {
			hatchBack = CarFactory.buildCar(CarType.HATCHBACK);			
			assertTrue("hatchback found", hatchBack.getCarType().equals(CarType.HATCHBACK));
			hatchBack.constructCar();
		} catch (CarNotFoundException e) {
			fail(e.getMessage());			
		}

	}
	
	
	@Test
	public void testDummyBuildCar() {
		Car dummy = null;
		
		try {
			dummy = CarFactory.buildCar(CarType.DUMMY);
		} catch (CarNotFoundException e) {
			
			assertTrue(dummy == null);
			//e.printStackTrace();
		}
		
	}
	
	

}

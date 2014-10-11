/**
 * 
 */
package com.dreamers.patterns;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test singleton functionality.
 * 
 * @author Shekh
 *
 */
public class EnumSingletonTest {

	/**
	 * Test method for {@link com.dreamers.patterns.EnumSingleton#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		DummySingleton dummySingleton = EnumSingleton.INSTANCE.getInstance();
		
		DummySingleton dummySingleton2 = EnumSingleton.INSTANCE.getInstance();
		
		assertTrue(dummySingleton.equals(dummySingleton2));
	}

}

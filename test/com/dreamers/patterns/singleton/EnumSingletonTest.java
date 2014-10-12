/**
 * 
 */
package com.dreamers.patterns.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dreamers.patterns.singleton.DummySingleton;
import com.dreamers.patterns.singleton.EnumSingleton;

/**
 * Test singleton functionality.
 * 
 * @author Shekh
 *
 */
public class EnumSingletonTest {

	/**
	 * Test method for {@link com.dreamers.patterns.singleton.EnumSingleton#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		DummySingleton dummySingleton = EnumSingleton.INSTANCE.getInstance();
		
		DummySingleton dummySingleton2 = EnumSingleton.INSTANCE.getInstance();
		
		assertTrue(dummySingleton.equals(dummySingleton2));
	}

}

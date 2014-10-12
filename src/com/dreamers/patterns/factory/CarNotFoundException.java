/**
 * 
 */
package com.dreamers.patterns.factory;

/**
 * Custom Exception class.
 * 
 * @author Shekh
 *
 */
public class CarNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CarNotFoundException(){
		
	}
	
	public CarNotFoundException(String message){
		super(message);
	}

}

/**
 * 
 */
package com.dreamers.patterns.command;

/**
 * Handle custom exception.
 * 
 * @author Shekh
 *
 */
public class StockOperationException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public StockOperationException() {
		super();
	}
	
	public StockOperationException(String message){
		super(message);
	}
	
	public StockOperationException(Throwable t) {
		super(t);
	}
	
	public StockOperationException(String message, Throwable t) {
		super(message, t);
	}
}

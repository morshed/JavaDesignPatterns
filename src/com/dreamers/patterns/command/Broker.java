/**
 * 
 */
package com.dreamers.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Broker will perform our operations, i.e. execute our order.
 * 
 * @author Shekh
 *
 */
public class Broker {
	
	private List<Order> orderHistory = new ArrayList<Order>();
	
	/**
	 * Place single order using broker
	 * 
	 * @param order
	 */
	public Broker(Order order) {		
		orderHistory.add(order);		
	}
	
	/**
	 * Broker will perform list of order (items) at once... for one user pov
	 * @param orders
	 */
	public Broker(List<Order> orders) {
		for(Order o : orders) {			
			orderHistory.add(o);
		}
	}

	public void placeOrders() {
		for(Order o : orderHistory) {
			o.execute();			
		}
	}
	
	public List<Order> getOrderHistory() {
		return orderHistory;
	}
	

}

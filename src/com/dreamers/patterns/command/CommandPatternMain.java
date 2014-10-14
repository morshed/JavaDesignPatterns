/**
 * 
 */
package com.dreamers.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Command pattern client. Perform buy and one sell operation on Google and Facebook stocks! 
 * 
 * @author Shekh
 *
 */
public class CommandPatternMain {

	public static void main(String[] args) {		
		
		Stock googleStock = new Stock("Google Inc.", 100, 12.65d);		
		Order buyStocks = new BuyStock(googleStock);
		
		Stock fbStock = new Stock("Facebook", 10, 9.67d);		
		Order saleStock = new SellStock(fbStock);
		
		List<Order> orders = new ArrayList<Order>();
		orders.add(buyStocks);
		orders.add(saleStock);
		
		System.out.println("Broker going to perform " + orders.size() + " operations...");
		Broker broker = new Broker(orders);		
		broker.placeOrders();
		System.out.println("Finished "+ broker.getOrderHistory().size() +" operations.");

	}

}

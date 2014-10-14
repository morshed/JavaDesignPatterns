/**
 * 
 */
package com.dreamers.patterns.command;

/**
 * The Receiver class. Perform operation based on supplied action.
 * 
 * @author Shekh
 *
 */
public class StockOperation {
	
	// TODO:: add user account that is being used for this transaction
	private Stock stock;
	private StockAction action;
	
	public StockOperation(Stock stock, StockAction action) {
		this.stock = stock;
		this.action = action;
	}
	
	public void operation() throws StockOperationException {
		switch(action) {
		case BUY:
			System.out.println("buy stock(s) :: company:  " + stock.getCompanyName() + " stock unit price: " + stock.getUnitPrice()
					+" quantity: "+stock.getQuantity() + " total cost - will be deducted from your account : "+ (stock.getUnitPrice() * stock.getQuantity() ));
			break;
			
		case SELL:
			System.out.println("sale stock(s) :: company:  " + stock.getCompanyName() + " stock unit price: " + stock.getUnitPrice()
					+" quantity: "+stock.getQuantity() + " total amount - will be added to your account: "+ (stock.getUnitPrice() * stock.getQuantity() ));
			break;
			
		default:
			throw new StockOperationException("Unimplemented operation!");
					
		} 
	}

}

/**
 * 
 */
package com.dreamers.patterns.command;

/**
 * Command to buy Stocks. Create concrete classes implementing the Order interface.
 * 
 * @author Shekh
 *
 */
public class BuyStock implements Order {

	private StockOperation stockOperation;
	
	public BuyStock(Stock stock) {
		
		this.stockOperation = new StockOperation(stock, StockAction.BUY);
	}
	
	@Override
	public void execute() {
		try {
			stockOperation.operation();
		} catch (StockOperationException e) {			
			e.printStackTrace();
		}
	}

}

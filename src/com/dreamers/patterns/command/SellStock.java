/**
 * 
 */
package com.dreamers.patterns.command;

/**
 * Command to sell Stocks. Create concrete classes implementing the Order interface.
 * 
 * @author Shekh
 *
 */
public class SellStock implements Order {

	private StockOperation stockOperation;
	
	public SellStock(Stock stock) {
		this.stockOperation = new StockOperation(stock, StockAction.SELL);
	}

	/* (non-Javadoc)
	 * @see com.dreamers.patterns.command.Order#execute()
	 */
	@Override
	public void execute() {
		try {
			stockOperation.operation();
		} catch (StockOperationException e) {
			e.printStackTrace();
		}
	}

}

/**
 * 
 */
package com.dreamers.patterns.command;

/**
 * This is our domain object. 
 * 
 * @author Shekh
 *
 */
public class Stock {
	
	private String companyName;	
	private Integer quantity;	
	private Double unitPrice;
	
	public Stock(){
		
	}
	
	public Stock(String companyName, Integer quantity, Double unitPrice) {
		this.companyName = companyName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	

}

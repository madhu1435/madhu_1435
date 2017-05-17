package com.product;

public class Product {
	
	int prodID;
	String prodName;
	double prodPrice;
	int prodQty;
	double totalCost;
	public Product(int prodID, String prodName, double prodPrice, int prodQty) {
		super();
		this.prodID = prodID;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
		
	}
	public double calTotal()
	{
	
		 totalCost=(prodQty*prodPrice);
		System.out.println("Total Price:"+ totalCost);
		return totalCost;
		
	}
	public void showDetails()
	{
		System.out.println("PRODUCT ID:"+prodID);
		System.out.println("PRODUCT NAME:"+prodName);
		System.out.println("PRODUCT PRICE:"+prodPrice);
		System.out.println("PRODUCT QUANTITY:"+prodQty);
		System.out.println("PRODUCT NUMBER:"+totalCost);
	}

}

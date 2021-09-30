package com.moglix.project1.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Orders{
	@Override
	public String toString() {
		return "Orders [orderID=" + orderID + ", userID=" + userID + ", invID=" + invID + ", productID=" + productID
				+ ", productQty=" + productQty + ", totalPrice=" + totalPrice + ", grandTotalPrice=" + grandTotalPrice
				+ "]";
	}

	private String orderID;
	private String userID;
	private String invID;
	private String productID;
	private int productQty;
	private double totalPrice;
	private double grandTotalPrice;
	
	//parameterized constructor
	
	public Orders(String orderID, String userID, String invID, String productID, int productQty, double totalPrice,
			double grandTotalPrice) {
		super();
		this.orderID = orderID;
		this.userID = userID;
		this.invID = invID;
		this.productID = productID;
		this.productQty = productQty;
		this.totalPrice = totalPrice;
		this.grandTotalPrice = grandTotalPrice;
	}
	
	//explicit default constructor
	public Orders() {
		
	}

	
}

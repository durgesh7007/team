package com.moglix.project1.repository;

import com.moglix.project1.dto.Orders;

public class OrdersDAO implements OrderRepositoryInterface{

	
	private static int counter=0;//counter
	Orders ordersArray[] = new Orders[10];// Orders Array
	
	private static OrderRepositoryInterface orderRI;
	
	
//Private Explicit default constructor.
	private OrdersDAO() {
		
	}
		
//Public Method for creating one object only.
		public static OrderRepositoryInterface getInstance() {
			if(orderRI==null) {
				orderRI = new OrdersDAO();
				return orderRI;
			}
			else 
				return orderRI;
		}
	
	
	
	
//Get index
		private int getIndex(String id) {
			for(int i =0;i<ordersArray.length;i++) {
				if(ordersArray[i]!=null && ordersArray[i].getOrderID().equals(id))
					return i;
			}
			return -1;
		}
//Add orders.
	@Override
	public String addOrder(Orders order) {
		if(counter<ordersArray.length) {
			ordersArray[counter++]=order;
			return "added";
		}
		else
			return "Array is full";

	}

//Update Orders.
	@Override
	public String updateOrders(String id, Orders orders) {
		int index= this.getIndex(id);
		if(index!=-1) {
			ordersArray[index]=orders;
			return "success";
		}
		else 
			return "not found";

	}

// Get Order By id.
	@Override
	public Orders getOrdersById(String id) {
		for (Orders order : ordersArray) {
			if(order!=null && id.equals(order.getOrderID())) {
				return order;		
			}	
		}
		return null;
	}
//Get Order Array
	@Override
	public Orders[] getOrders() {
		return ordersArray;
	}
//Delete Order By Id.
	@Override
	public String deleteOrdersById(String id) {

		int index=this.getIndex(id);
		if(index!=-1) {
			ordersArray[index]=null;
			return "success";
		}
		else
			return "not found";
	}
	
//Delete All Orders.
	@Override
	public void deleteAllOrders() {
		ordersArray =null;
	}
	
		
}

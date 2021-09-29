package com.moglix.project1.service;

import com.moglix.project1.dto.Orders;
import com.moglix.project1.repository.OrderRepositoryInterface;
import com.moglix.project1.repository.OrdersDAO;

public class OrderService implements OrderServiceInterface{
OrderRepositoryInterface ordersRI=OrdersDAO.getInstance();
	
	private static OrderServiceInterface orderServiceInterface; //Reference.
	
//Public Method to create one object.
	public static OrderServiceInterface getInstance() {
		if(orderServiceInterface==null) {
			orderServiceInterface=new OrderService();
			return orderServiceInterface;
		}
		else
		return orderServiceInterface;	
	}

	
//Constructor
	private OrderService() {
		
	}	
	
//Add Orders
		public String addOrder(Orders order) {
			return ordersRI.addOrder(order);
			
		}

//Update Orders
		@Override
		public String updateOrders(String id, Orders orders) {
			return ordersRI.updateOrders(id, orders);
		}
		@Override
		public Orders getOrdersById(String id) {
			return ordersRI.getOrdersById(id);
		}
		
//Get Orders Array.
		@Override
		public Orders[] getOrders() {
			return ordersRI.getOrders();
		}
		
//Delete Orders By Id.
		@Override
		public String deleteOrdersById(String id) {
			return ordersRI.deleteOrdersById(id);
		}
		
//Delete All Orders
		@Override
		public void deleteAllOrders() {
		
		}
}

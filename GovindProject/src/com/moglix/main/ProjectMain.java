package com.moglix.main;

import com.moglix.project1.dto.Orders;
import com.moglix.project1.service.OrderService;
import com.moglix.project1.service.OrderServiceInterface;

public class ProjectMain {

	public static void main(String[] args) {
		OrderServiceInterface orderServiceInterface= OrderService.getInstance();
		Orders order = new Orders();
		order.setOrderID("12111");
		order.setUserID("g1234");
		order.setInvID("2343");
		order.setProductID("dfh3423");
		order.setProductQty(50);
		order.setTotalPrice(120000.00);
		order.setGrandTotalPrice(125000.00);
		
		//Adding order to array.
		String orderString =orderServiceInterface.addOrder(order);
		if(orderString.equals("added"))
			System.out.println("Order Details added.");
		else
			System.out.println("can't add");
		
		//Getting order Details By id.
		System.out.println("Getting order details by id.");
		System.out.println(orderServiceInterface.getOrdersById("12111"));
		
		//Getting orders
		System.out.println("Getting orders:");
		//System.out.println(orderServiceInterface.getOrders().toString());
		Orders[] ordersArray= orderServiceInterface.getOrders();
		for (Orders orderVariable : ordersArray) {
			if(orderVariable!=null) {
				System.out.println(orderVariable);
				//System.out.println(orderVariable.toString());
			}
		}
		
		
		//Update Order by id.
		Orders order2=new Orders();
		order2.setGrandTotalPrice(175000);
		order2.setInvID("4555");
		order2.setOrderID("12111");
		String updtStatus =orderServiceInterface.updateOrders("12111", order2);
		System.out.println("Update "+updtStatus);
		System.out.println(order2.toString());
		
		//Delete Order By Id
		String dltStatus=orderServiceInterface.deleteOrdersById("12111");
		System.out.println("Delete "+dltStatus);
		System.out.println("After Delete:"+orderServiceInterface.getOrdersById("12111"));
		
		//Delete All
		orderServiceInterface.deleteAllOrders();
	
		
	
	}

}

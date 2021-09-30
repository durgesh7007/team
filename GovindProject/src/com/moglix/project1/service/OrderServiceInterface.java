package com.moglix.project1.service;

import com.moglix.project1.dto.Orders;

public interface OrderServiceInterface {
	public String addOrder(Orders order);
	public String updateOrders(String id, Orders orders);
	public Orders getOrdersById(String id);
	public Orders[] getOrders();
	public String deleteOrdersById(String id);
	public void deleteAllOrders();
}

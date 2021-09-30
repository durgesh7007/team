package com.moglix.project1.repository;

import com.moglix.project1.dto.Orders;

public interface OrderRepositoryInterface {
	public String addOrder(Orders order);
	public String updateOrders(String id, Orders orders);
	public Orders getOrdersById(String id);
	public Orders[] getOrders();
	public String deleteOrdersById(String id);
	public void deleteAllOrders();
}

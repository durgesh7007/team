package moglix.Employeemanagementsystem.repository;

import moglix.Employeemanagementsystem.dto.Orders;

public interface OrderRepository {
    public String createOrder(Orders order);
    public String updateOrderById(String orderId,Orders order);
    public Orders getOrderById(String orderId);
    public Orders[] getOrders();
    public String deleteOrderById(String orderId);
    public String deleteAllOrders();
}

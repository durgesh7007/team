package moglix.Employeemanagementsystem.service;

import moglix.Employeemanagementsystem.dto.Orders;
import moglix.Employeemanagementsystem.repository.OrderRepository;
import moglix.Employeemanagementsystem.repository.OrderRepositoryImpl;

public class OrderServiceImp implements OrderService{
    private static OrderService orderService;
    private OrderServiceImp(){};
    public static OrderService getInstance(){
        if(orderService==null){
            orderService=new OrderServiceImp();
            return orderService;
        }else {
            return orderService;
        }
    }
    OrderRepository orderRepository= OrderRepositoryImpl.getInstance();
    @Override
    public String createOrder(Orders order) {
        return orderRepository.createOrder(order);
    }

    @Override
    public String updateOrderById(String orderId, Orders order) {
        return orderRepository.updateOrderById(orderId,order);
    }

    @Override
    public Orders getOrderById(String orderId) {
        return orderRepository.getOrderById(orderId);
    }

    @Override
    public Orders[] getOrders() {
        return orderRepository.getOrders();
    }

    @Override
    public String deleteOrderById(String orderId) {
        return orderRepository.deleteOrderById(orderId);
    }

    @Override
    public String deleteAllOrders() {
        return orderRepository.deleteAllOrders();
    }
}

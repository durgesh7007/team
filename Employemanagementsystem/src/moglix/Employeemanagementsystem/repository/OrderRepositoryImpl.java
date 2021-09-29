package moglix.Employeemanagementsystem.repository;

import moglix.Employeemanagementsystem.dto.Orders;
import moglix.Employeemanagementsystem.service.OrderService;

public class OrderRepositoryImpl implements OrderRepository {
    private  static OrderRepository orderRepository;
    private OrderRepositoryImpl(){}
    public static OrderRepository getInstance(){
        if(orderRepository==null){
            orderRepository=new OrderRepositoryImpl();
            return orderRepository;
        }else
        {
            return  orderRepository;
        }
    }
    private static int counter=0;
    Orders orders[]=new Orders[16];
    @Override
    public String createOrder(Orders order) {
        if(counter<orders.length){
            this.orders[counter]=order;
            counter++;
            return "Added Successfully";
        }else{
            return "Not Added";

        }
    }
protected  int getIndex(String orderId){
        for (int i=0;i<orders.length;i++){
            if(orders[i]!=null &&orders[i].getOrder_id().equalsIgnoreCase(orderId)){
                return i;
            }
        }
        return -1;
}

    @Override
    public String updateOrderById(String orderId, Orders order) {
        int index=this.getIndex(orderId);
        if(index!= -1){
            orders[index]=order;
            return "updated successfully";
        }
        return "not updated";
    }

    @Override
    public Orders getOrderById(String orderId) {
        int index=this.getIndex(orderId);
        if(index!= -1){
           return  orders[index];
        }
        return null;
    }

    @Override
    public Orders[] getOrders() {
        return orders;
    }

    @Override
    public String deleteOrderById(String orderId) {
        int index=this.getIndex(orderId);
        if(index!= -1){
            orders[index]=null;
            return "Deleted successfully";
        }
        return "Not Deleted";
    }

    @Override
    public String deleteAllOrders() {
        orders=null;
        return "Deleted All Order successfully";
    }
}

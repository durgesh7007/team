package moglix.Employeemanagementsystem.controller;


import moglix.Employeemanagementsystem.dto.Orders;



import moglix.Employeemanagementsystem.service.OrderService;

import moglix.Employeemanagementsystem.service.OrderServiceImp;

public class MainOrder {
    private static Orders orders;

    public static void main(String[] args) {
        OrderService orderService= OrderServiceImp.getInstance();



         Orders orders = new Orders();
        orders.setOrder_id("12168");
        orders.setUser_id("abc");
        orders.setInv_id("chaudhary");
        orders.setProduct_id("12143");
        orders.setProduct_qty("10");
        orders.setTotal_price("40000");
        orders.setGrand_total_price("50000");
        System.out.println(orders.getOrder_id());
        System.out.println(orders.getUser_id());
        String result = orderService.createOrder(orders);
        System.out.println(result);

        Orders orders1 = orderService.getOrderById("12168");
        if (orders1== null) {
            System.out.println("emp id doesnot exist");
        } else {
            System.out.println("empid exist");
        }
        Orders order[] = orderService.getOrders();
        for (Orders orders3: order) {
            if (orders3 != null) {
                System.out.println(orders3);
            }

        }
        orders.setOrder_id("123456");
        orders.setInv_id("rahul");
        String updatestatus = orderService.updateOrderById("123456", orders);
        System.out.println(updatestatus);

        for (Orders orders3: orderService.getOrders()) {
            if (orders3 != null) {
                System.out.println(orders3);
            }

        }

        System.out.println(orderService.getOrderById("123456"));

        String deletestatus = orderService.deleteOrderById("123456" );
        System.out.println(deletestatus);
        System.out.println(orderService.getOrderById("123456"));

    }
}

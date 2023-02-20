package com.example.ECommerce.Controller;

import com.example.ECommerce.Model.Order;
import com.example.ECommerce.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ecom/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;



    @GetMapping("/get-order/orderId/{orderId}")
    public Order getOrderById(@PathVariable Integer orderId) {
        return orderService.getOrderById(orderId);
    }

    @PostMapping("/place-order")
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }
}

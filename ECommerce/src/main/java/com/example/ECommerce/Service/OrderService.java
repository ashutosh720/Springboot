package com.example.ECommerce.Service;

import com.example.ECommerce.Model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);
    Order createOrder(Order order);
}

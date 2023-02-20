package com.example.ECommerce.Service;


import com.example.ECommerce.Model.Address;
import com.example.ECommerce.Model.Order;
import com.example.ECommerce.Model.Product;
import com.example.ECommerce.Model.User;
import com.example.ECommerce.Repository.AddressRepository;
import com.example.ECommerce.Repository.OrderRepository;
import com.example.ECommerce.Repository.ProductRepository;
import com.example.ECommerce.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Order getOrderById(Integer orderId) {
        return orderRepository.findById(orderId).get();
    }

    @Override
    public Order createOrder(Order order) {

        return orderRepository.save(order);
    }
}

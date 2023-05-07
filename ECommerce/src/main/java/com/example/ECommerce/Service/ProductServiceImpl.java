package com.example.ECommerce.Service;

import com.example.ECommerce.Model.Product;
import com.example.ECommerce.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productRepository.deleteById(productId);
    }
    public List<Order> getOrdersByUserId(Long userId) {
    return orderRepository.findByUserId(userId);
}

public List<Order> getOrdersByProductId(Long productId) {
    return orderRepository.findByProductId(productId);
}

public List<Order> getOrdersByAddressId(Long addressId) {
    return orderRepository.findByAddressId(addressId);
}
}

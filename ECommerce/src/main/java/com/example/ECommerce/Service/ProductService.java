package com.example.ECommerce.Service;

import com.example.ECommerce.Model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product createProduct(Product product);
    void deleteProductById(Integer productId);

}


package com.example.ECommerce.Controller;

import com.example.ECommerce.Model.Product;
import com.example.ECommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ecom/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all-products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }




    @PostMapping("/add-product")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @DeleteMapping("/delete-product/productId/{productId}")
    public void deleteProductById(@PathVariable Integer productId) {
        productService.deleteProductById(productId);
    }
}

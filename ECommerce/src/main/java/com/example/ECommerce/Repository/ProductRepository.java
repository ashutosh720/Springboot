package com.example.ECommerce.Repository;

import com.example.ECommerce.Model.Product;
import com.example.ECommerce.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {


}

package com.example.ECommerce.Repository;


import com.example.ECommerce.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
 

  public List<Order> getOrdersByProductId(Long productId) 
    
  public List<Order> getOrdersByAddressId(Long addressId)
}

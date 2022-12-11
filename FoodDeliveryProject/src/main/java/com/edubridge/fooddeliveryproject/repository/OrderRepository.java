package com.edubridge.fooddeliveryproject.repository;

//import javax.persistence.criteria.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.fooddeliveryproject.model.Order;

//import com.example.fooddeliveryproject.model.Category;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long>{

	//com.example.fooddeliveryproject.model.Order save(com.example.fooddeliveryproject.model.Order order);

}

package com.edubridge.fooddeliveryproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.fooddeliveryproject.model.Cart;
import com.edubridge.fooddeliveryproject.model.Order;
//import com.example.fooddeliveryproject.service.CartService;
import com.edubridge.fooddeliveryproject.service.OrderService;



	
	@CrossOrigin(origins = "http://localhost:8089" )
	 @RestController
	 @RequestMapping("/api/Order")
	
	public class OrderController {
	
	
		 @Autowired
		 private OrderService orderService;

		
		public OrderController(OrderService orderService) {
			super();
			// TODO Auto-generated constructor stub
		this.orderService = orderService;
		}
		

		@PostMapping("/add")
		public ResponseEntity<Order> addOrder(@RequestBody Order order)
		{
			System.out.println("In controller"+ order);
			return new ResponseEntity<Order>(orderService.saveOrder(order),HttpStatus.CREATED);
		}
		
		@GetMapping
		public List<Order> getOrder()
		{
			return orderService.getOrder();
		}
		
		@GetMapping("{orderId}")
		public ResponseEntity<Order> getOrderById(@PathVariable("orderId") long OrderId)
		{
			return new ResponseEntity<Order>(orderService.getOrderById(OrderId),HttpStatus.OK);
		}
		
		@DeleteMapping("{orderId}")
		public ResponseEntity<String> deleteOrder(@PathVariable("orderId") long orderId)
		{
			orderService.deleteOrderById(orderId);
			return new ResponseEntity<String>("Order deleted successfully",HttpStatus.OK);
		}
	}
	



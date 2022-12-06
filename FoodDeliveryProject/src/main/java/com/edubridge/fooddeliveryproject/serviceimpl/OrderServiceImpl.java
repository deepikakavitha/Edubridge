package com.edubridge.fooddeliveryproject.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.fooddeliveryproject.exception.UserNotFoundException;
import com.edubridge.fooddeliveryproject.model.Order;
import com.edubridge.fooddeliveryproject.repository.OrderRepository;
import com.edubridge.fooddeliveryproject.service.OrderService;




	@Service
	public class OrderServiceImpl implements OrderService {

		@Autowired
		private OrderRepository orderRepository;
		
		
		public OrderServiceImpl(OrderRepository orderRepository) {
			super();
			this.orderRepository = orderRepository;
		}


		@Override
		public Order saveOrder(Order order) {
			// TODO Auto-generated method stub
			return orderRepository.save(order);
		}


		@Override
		public List<Order> getOrder() {
			// TODO Auto-generated method stub
			return orderRepository.findAll();
		}


		@Override
		public Order getOrderById(long orderId) {
			// TODO Auto-generated method stub
			return orderRepository.findById(orderId).orElseThrow(()-> new UserNotFoundException("Order", "OrderId", orderId));
		}


		@Override
		public void deleteOrderById(long orderId) {
			// TODO Auto-generated method stub
			orderRepository.findById(orderId).orElseThrow(()-> new UserNotFoundException("Order", "OrderId", orderId));
			orderRepository.deleteById(orderId);
		}
	}
		



package com.edubridge.fooddeliveryproject.service;

import java.util.List;

import com.edubridge.fooddeliveryproject.model.Category;
import com.edubridge.fooddeliveryproject.model.Order;

public interface OrderService {

	
	//List<Category> getCategory();

	//void deleteCategoryByID(long categoryID);

	//Category getCategoryByID(long categoryID);

	//Category saveCategory(Category category);

	Order saveOrder(Order order);

	List<Order> getOrder();

	Order getOrderById(long orderId);

	void deleteOrderById(long orderId);
	

}

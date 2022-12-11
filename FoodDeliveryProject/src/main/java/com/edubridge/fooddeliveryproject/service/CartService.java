package com.edubridge.fooddeliveryproject.service;

import java.util.List;
import java.util.Optional;

import com.edubridge.fooddeliveryproject.model.Cart;
//import com.example.fooddeliveryproject.model.Category;

public interface CartService {

	
	List<Cart> getCart();

	//void deleteCartByID(long cartId);

	//Cart getCartByID(long cartId);

	Cart saveCart(Cart cart);

	Cart getCartById(long cartId);

	void deleteCartById(long cartId);
	

}
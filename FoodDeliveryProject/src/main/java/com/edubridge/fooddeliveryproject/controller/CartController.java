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

import com.edubridge.fooddeliveryproject.model.Cart;
//import com.example.fooddeliveryproject.model.Category;
import com.edubridge.fooddeliveryproject.service.CartService;
//import com.example.fooddeliveryproject.service.CategoryService;

	@CrossOrigin(origins = "http://localhost:8089" )
	 @RestController
	 @RequestMapping("/api/cart")
	
	public class CartController {
	
		 @Autowired
		 private CartService cartService;

		public CartController(CartService cartService) {
			super();
			this.cartService = cartService;
		}
		@PostMapping("/add")
		public ResponseEntity<Cart> addCart(@RequestBody Cart cart)
		{
			System.out.println("In controller"+ cart);
			return new ResponseEntity<Cart>(cartService.saveCart(cart),HttpStatus.CREATED);
		}
		
		@GetMapping
		public List<Cart> getCart()
		{
			return cartService.getCart();
		}
		
		@GetMapping("{cartId}")
		public ResponseEntity<Cart> getCartById(@PathVariable("cartId") long cartId)
		{
			return new ResponseEntity<Cart>(cartService.getCartById(cartId),HttpStatus.OK);
		}
		
		@DeleteMapping("{cartID}")
		public ResponseEntity<String> deleteCartbyId(@PathVariable("cartId") long cartId)
		{
			cartService.deleteCartById(cartId);
			return new ResponseEntity<String>("Cart deleted successfully",HttpStatus.OK);
		}
	}
	

		 
		 



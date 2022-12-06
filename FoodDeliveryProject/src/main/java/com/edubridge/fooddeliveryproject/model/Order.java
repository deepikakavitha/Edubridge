package com.edubridge.fooddeliveryproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Order_Table")
public class Order {
	@Id
	@Column(name = "order_Id", unique = true)
	public long orderId;
	
	@Column(name = "email_Id")
	public String emailID;
	
	@Column(name = "cart_Id")
	public long cartId;
	
	@Column(name = "total_Price")
	public float totalPrice;

	public Order(long orderId, String emailID, long cartId, float totalPrice) {
		super();
		this.orderId = orderId;
		this.emailID = emailID;
		this.cartId = cartId;
		this.totalPrice = totalPrice;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
}
	
	

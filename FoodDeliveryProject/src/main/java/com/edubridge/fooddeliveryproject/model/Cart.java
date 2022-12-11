package com.edubridge.fooddeliveryproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
	@Table(name = "CartTable")

	public class Cart {
	
		@Id
		//@Generated
		//@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "Cart_ID" )
		private long cartId;
		@Column(name = "CartName")
		private String cartName;
		
		@Column(name = "FoodId")
		private String foodId;
		@Column(name = "Quantity")
		private String quantity;
		
		
		/*@OneToOne
		@JoinColumn(name="OrderId")
		Order order;
		public Order getOrder() {
			return order;
		}
		public void setOrder(Order order) {
			this.order = order;
		}*/
		public long getCartId() {
			return cartId;
		}
		public void setCartId(long cartId) {
			this.cartId = cartId;
		}
		public String getCartName() {
			return cartName;
		}
		public void setCartName(String cartName) {
			this.cartName = cartName;
		}
		public String getFoodId() {
			return foodId;
		}
		public void setFoodId(String foodId) {
			this.foodId = foodId;
		}
		public String getQuantity() {
			return quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		@Override
		public String toString() {
			return "Cart [cartId=" + cartId + ", cartName=" + cartName + ", foodId=" + foodId + ", quantity=" + quantity
					+ "]";
		}
		
		
		

		
		
		
		
		
	}




	
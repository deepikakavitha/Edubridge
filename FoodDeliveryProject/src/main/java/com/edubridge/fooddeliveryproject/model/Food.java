
package com.edubridge.fooddeliveryproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "food_Table")
public class Food {
	@Id
	@Column(name = "food_Id", unique = true)
	public String foodId;
	
	@Column(name = "food_name")
	public String foodName;
	
	@Column(name = "category_Id")
	public int categoryId;
	
	@Column(name = "price")
	public float price;

	public Food(String foodId, String foodName, int categoryId, float price) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.categoryId = categoryId;
		this.price = price;
	}

	public String getFoodId() {
		return foodId;
	}

	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
	


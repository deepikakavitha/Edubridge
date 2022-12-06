
package com.edubridge.fooddeliveryproject.service;

import java.util.List;

import com.edubridge.fooddeliveryproject.model.Food;

public interface FoodService {

	Food saveFood(Food food);

	List<Food> getFood();

	//void deleteCategoryById(long foodId);

	Food getFoodById(long foodId);

	void deleteFoodById(long foodId);

	//void deleteFoodById(long foodId);

}

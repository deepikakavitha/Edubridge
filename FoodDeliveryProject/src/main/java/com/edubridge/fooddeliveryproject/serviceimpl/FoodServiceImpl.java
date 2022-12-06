package com.edubridge.fooddeliveryproject.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.fooddeliveryproject.exception.UserNotFoundException;
//import com.example.fooddeliveryproject.model.Category;
import com.edubridge.fooddeliveryproject.model.Food;
//import com.example.fooddeliveryproject.respository.CategoryRepository;
import com.edubridge.fooddeliveryproject.repository.FoodRepository;
//import com.example.fooddeliveryproject.service.CategoryService;
import com.edubridge.fooddeliveryproject.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {

	@Autowired
	private FoodRepository foodRepository;
	
	
	public FoodServiceImpl(FoodRepository foodRepository) {
		super();
		this.foodRepository = foodRepository;
	}

	@Override
	public Food saveFood(Food food) {
		// TODO Auto-generated method stub
		//System.out.println("In service"+ food);
		return foodRepository.save(food);
	}

	@Override
	public List<Food> getFood() {
		// TODO Auto-generated method stub
		return foodRepository.findAll()  ;
	}

	@Override
	public Food getFoodById(long foodId) {
		// TODO Auto-generated method stub
		return foodRepository.findById(foodId).orElseThrow(()->new UserNotFoundException("Food","FoodId",foodId)); 
	}

	
	

	@Override
	public void deleteFoodById(long foodId) {
		// TODO Auto-generated method stub
		foodRepository.findById(foodId).orElseThrow(()->new UserNotFoundException("Food","FoodId",foodId)); 
		foodRepository.deleteById(foodId);
	}

	
}



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

import com.edubridge.fooddeliveryproject.model.Food;
import com.edubridge.fooddeliveryproject.service.FoodService;


@CrossOrigin(origins = "http://localhost:8089" )
@RestController
@RequestMapping("/api/food")

public class FoodController {
	 @Autowired
	 private FoodService foodService;

	public FoodController(FoodService foodService) {
		super();
		this.foodService = foodService;
	}
	@PostMapping("/add")
	public ResponseEntity<Food> addFood(@RequestBody Food food)
	{
		//System.out.println("In controller"+ food);
		return new ResponseEntity<Food>(foodService.saveFood(food),HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Food> getFood()
	{
		return foodService.getFood();
	}
	
	@GetMapping("{foodId}")
	public ResponseEntity<Food> getFoodById(@PathVariable("foodId") long foodId)
	{
		return new ResponseEntity<Food>(foodService.getFoodById(foodId),HttpStatus.OK);
	}
	
	@DeleteMapping("{foodId}")
	public ResponseEntity<String> deleteFood(@PathVariable("foodId") long foodId)
	{
		foodService.deleteFoodById(foodId);
		return new ResponseEntity<String>("Food deleted successfully",HttpStatus.OK);
	}

	 
	 

}





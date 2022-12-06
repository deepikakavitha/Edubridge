
package com.edubridge.fooddeliveryproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.example.fooddeliveryproject.model.Category;
import com.edubridge.fooddeliveryproject.model.Food;


	public interface FoodRepository extends JpaRepository<Food,Long>{
}

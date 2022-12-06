package com.edubridge.fooddeliveryproject.service;

import java.util.List;

import com.edubridge.fooddeliveryproject.model.Category;

public interface CategoryService {

	Category saveCategory(Category category);
	List<Category> getCategory();
	Category getCategoryByID(long categoryID);
	void deleteCategoryByID(long categoryID);
}

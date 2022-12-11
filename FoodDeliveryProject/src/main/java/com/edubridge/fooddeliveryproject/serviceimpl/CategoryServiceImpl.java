package com.edubridge.fooddeliveryproject.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.fooddeliveryproject.exception.UserNotFoundException;
import com.edubridge.fooddeliveryproject.model.Category;
import com.edubridge.fooddeliveryproject.repository.CategoryRepository;
import com.edubridge.fooddeliveryproject.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Category saveCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> getCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll()  ;
	}

	@Override
	public Category getCategoryByID(long categoryID) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(categoryID).orElseThrow(()->new UserNotFoundException("Category","CategoryID",categoryID)); 
	}

	@Override
	public void deleteCategoryByID(long categoryID) {
		// TODO Auto-generated method stub
		categoryRepository.findById(categoryID).orElseThrow(()->new UserNotFoundException("Category","CategoryID",categoryID)); 
		categoryRepository.deleteById(categoryID);
	}
}

	

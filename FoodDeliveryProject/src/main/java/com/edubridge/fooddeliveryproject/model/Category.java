
package com.edubridge.fooddeliveryproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CategoryTable")


public class Category {
	@Id
	//@Generated
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "Category_ID",unique = true )
	private long categoryId;
	@Column(name = "CategoryName")
	private String categoryName;
	
	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}

	
	
	
	
	
}

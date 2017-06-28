package com.onlineshopping.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.onlineshopping.bean.Category;
import com.onlineshopping.dao.CategoryDao;
@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {
	 private static List<Category> categories = new ArrayList<>();	
	
	 static{
		Category category = new Category();

		category.setId(101);
		category.setName("Mobile");
		category.setDescription("Samsung");
		category.setImageUrl("mobile.png");

		categories.add(category);

		category = new Category();
		category.setId(102);
		category.setName("Laptop");
		category.setDescription("Samsung");
		category.setImageUrl("mobile.png");

		categories.add(category);
	}
	@Override
	public  List<Category> categoryList() { 
		return categories; 
 	}

	@Override
	public Category get(int id) {
		for(Category category:categories){
			if(category.getId()==id) return category;
		}
		return null;
	}

}

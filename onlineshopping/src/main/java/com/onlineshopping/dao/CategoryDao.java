package com.onlineshopping.dao;

import java.util.List;

import com.onlineshopping.bean.Category;

public interface CategoryDao {

	public List<Category> categoryList();

	public Category get(int id);

}

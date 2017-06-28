package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.bean.Category;

public interface CategoryService {

	public  List<Category> categoryList();

	public Category get(int id);

}

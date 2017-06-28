package com.onlineshopping.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlineshopping.bean.Category;
import com.onlineshopping.dao.CategoryDao;
import com.onlineshopping.service.CategoryService;
@Component("categoryService")
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public List<Category> categoryList() {
		return categoryDao.categoryList();
	}

	@Override
	public Category get(int id) {
		return categoryDao.get(id);
	}

}

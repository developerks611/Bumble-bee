package com.web.bumble.bee.service;

import java.sql.SQLException;
import java.util.List;

import com.web.bumble.bee.db.CategoryDataBase;
import com.web.bumble.bee.model.Category;

public class CategoryService {

	public boolean addCat(Category category) throws ClassNotFoundException, SQLException {
		return CategoryDataBase.addCat(category);
		
		
	} 
	
	public List<Category> getAllCat() throws ClassNotFoundException, SQLException{
		return CategoryDataBase.getAllCat();
		
	}
	
	public Category searchCategory(Category cate) throws ClassNotFoundException, SQLException {
		
		return CategoryDataBase.searchCategory(cate);
	}
}

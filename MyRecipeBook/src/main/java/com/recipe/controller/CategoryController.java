package com.recipe.controller;

import java.sql.ResultSet;
import java.util.List;

import com.recipe.dao.CategoryDAO;
import com.recipe.model.Category;

public class CategoryController {
	
	CategoryDAO catdao = new CategoryDAO();

	public void addCategory(Category category) {
		
		catdao.addCategory(category);
		
	}
	
	
	public void updateCategory(int uid, String uname) {
        catdao.updateCategory(uid, uname);
    }
	
	public void deleteCategory(int id) {
		catdao.deleteCategory(id);
	}


	public List<Category> getAllCategories() {

		return catdao.getAllCategories() ;

	}

}

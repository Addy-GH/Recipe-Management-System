package com.recipe.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.recipe.dao.RecipeDAO;
import com.recipe.model.Recipe;

public class RecipeController {
	
	RecipeDAO redao = new RecipeDAO();
	
	public void addRecipe(Recipe recp) {
		
		redao.addRecipe(recp);
		
	}

	
	public List<Recipe> getAllRecipes(){
		
		return redao.getAllRecipes();
		
	}
	
	
	public List<Recipe> searchRecipes(String keyword){
		
		return redao.searchRecipes(keyword);
		
	}


	public void updateRecipe(Recipe recipe) {
		
		redao.updateRecipe(recipe);
		
	}
	
	
	public void deleteRecipe(int id) {
		
		redao.deleteRecipe(id);
		
	}

}

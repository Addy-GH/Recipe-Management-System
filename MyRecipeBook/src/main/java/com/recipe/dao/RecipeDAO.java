package com.recipe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.recipe.model.Recipe;
import com.recipe.util.DBConnection;

public class RecipeDAO {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private Statement st;
	
	
	public RecipeDAO() {
		conn = DBConnection.getConnection();
	}
	
	
//	Adding the recipes using this method
	public void addRecipe(Recipe recipe) {
		
		String query = "insert into Recipes (Rname, Category, Ingredients, Instructions) values (?,?,?,?)";
		
		try {
			
			ps = conn.prepareStatement(query);
			ps.setString(1, recipe.getRname());
			ps.setString(2, recipe.getCategory());
			ps.setString(3, recipe.getIngredients());
			ps.setString(4, recipe.getInstructions());
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
//	To get all recipes we are using this method
	public List<Recipe> getAllRecipes(){
		
		List<Recipe> recipe = new ArrayList<Recipe>();
		String query = "select * from Recipes";
		
		try {
			
			st = conn.createStatement();
			rs = st.executeQuery(query);
			
//			constructor approach
			while(rs.next()) {
				recipe.add(new Recipe(rs.getInt("rid"), rs.getString("rname"), rs.getString("category"), rs.getString("ingredients"), rs.getString("instructions")));
				
			}
			
//			setter approach
//			while (rs.next()) {
//			    Recipe rec = new Recipe();
//			    rec.setRid(rs.getInt("id"));
//			    rec.setRname(rs.getString("name"));
//			    rec.setCategory(rs.getString("category"));
//			    rec.setIngredients(rs.getString("ingredients"));
//			    rec.setInstructions(rs.getString("instructions"));
//			    recipe.add(rec);
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return recipe;
		
	}
	
	
//	we will search recipes by keyword using this method
	public List<Recipe> searchRecipes(String keyword){
		
		List<Recipe> recipe = new ArrayList<Recipe>();
		String query = "select * from Recipes where Rname Like ? or Category Like ?";
		
		try {
			
			ps = conn.prepareStatement(query);
			ps.setString(1, "%" + keyword + "%");
			ps.setString(2, "%" + keyword + "%");
			
			rs = ps.executeQuery();
			
//			constructor approach
			while(rs.next()) {
				recipe.add(new Recipe(rs.getInt("rid"), rs.getString("rname"), rs.getString("category"), rs.getString("ingredients"), rs.getString("instructions")));
				
			}
			
//			setter approach
//			while (rs.next()) {
//			    Recipe rec = new Recipe();
//			    rec.setRid(rs.getInt("id"));
//			    rec.setRname(rs.getString("name"));
//			    rec.setCategory(rs.getString("category"));
//			    rec.setIngredients(rs.getString("ingredients"));
//			    rec.setInstructions(rs.getString("instructions"));
//			    recipe.add(rec);
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return recipe;
		
	}
	
	
//	updating the recipes using this method
	public void updateRecipe(Recipe recipe) {
		
		String query = "update Recipes set Rname = ?, Category = ?, Ingredients = ?, Instructions = ? where Rid = ?";
		
		try {
			
			ps = conn.prepareStatement(query);
			ps.setString(1, recipe.getRname());
			ps.setString(2, recipe.getCategory());
			ps.setString(3, recipe.getIngredients());
			ps.setString(4, recipe.getInstructions());
			ps.setInt(5, recipe.getRid()); 
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
//	deleting the recipes using this method
	public void deleteRecipe(int id) {
		
		String query = "delete from Recipes where Rid = ?";
		
		try {
			
			ps = conn.prepareStatement(query);
			ps.setInt(1, id); 
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
	
	
}

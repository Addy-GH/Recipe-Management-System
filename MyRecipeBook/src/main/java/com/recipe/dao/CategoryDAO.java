package com.recipe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.recipe.model.Category;
import com.recipe.model.Recipe;
import com.recipe.util.DBConnection;

public class CategoryDAO {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private Statement st;
	
	
	public CategoryDAO() {
		conn = DBConnection.getConnection();
	}

	
//	Add category using this method 
	public void addCategory(Category category) {
		
		String query = "insert into Categories (Cname) values (?)";
		
		try {
			
			ps = conn.prepareStatement(query);
			ps.setString(1, category.getCname());
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

//	Update category using this method 
	public void updateCategory(int uid , String uname) {
		
		String query = "update Categories set Cname = ? where Cid = ?";
		
		try {
			
			ps = conn.prepareStatement(query);
			ps.setString(1, uname);
			ps.setInt(2, uid);
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
//	Delete category using this method 	
	public void deleteCategory(int id) {
		
		String query = "delete from Categories where Cid = ?";
		
		try {
			
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
//	Get all categories using this method 
	public List<Category> getAllCategories() {
		
		List<Category> categories = new ArrayList<>();
		String query = "Select * from Categories";
		
		try {
			
			st = conn.createStatement();
			rs = st.executeQuery(query);
			
			while(rs.next()) {
				categories.add(new Category(rs.getInt("cid"), rs.getString("cname")));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return categories;

	}
	
	
}
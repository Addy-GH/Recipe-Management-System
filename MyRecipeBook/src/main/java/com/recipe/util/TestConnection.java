package com.recipe.util;

import java.sql.Connection;

public class TestConnection {
	
	public static void main(String[] args) {
		
		Connection con = DBConnection.getConnection();
		if (con != null) {
			System.out.println("Database connected successfully!");
		} else {
			System.out.println("Failed to connect to the database.");
		}
		
	}

}

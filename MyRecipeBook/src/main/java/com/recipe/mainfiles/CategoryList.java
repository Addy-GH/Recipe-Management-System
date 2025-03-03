package com.recipe.mainfiles;

import java.util.List;
import java.util.Scanner;

import com.recipe.controller.CategoryController;
import com.recipe.model.Category;

public class CategoryList {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CategoryController catcon = new CategoryController();
		
		while (true) {
			
			System.out.println("\nCategory Management System");
			System.out.println("1. Add Category");
			System.out.println("2. Delete Category");
			System.out.println("3. Delete Category");
			System.out.println("4. View All Categories");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			
			switch(choice) {
			
				case 1:
					System.out.println("Enter category name: ");
					String catgoryName =  sc.nextLine();
					Category cat = new Category();
					
					cat.setCname(catgoryName);
					catcon.addCategory(cat);
					System.out.println("Category added successfully!");
				
					break;
					
				case 2:
					System.out.println("Enter the Id of the category you want to update: ");
					int uid =  sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the new category name: ");
					String uname = sc.nextLine();
					catcon.updateCategory(uid, uname);
					System.out.println("Category updated successfully!");
					
					
					break;
					
				case 3:
					System.out.println("Enter the Id of the category you want to delete: ");
					int catid =  sc.nextInt();
					
					catcon.deleteCategory(catid);
					System.out.println("Category deleted successfully!");
					
					
					break;
					
				case 4:
					List<Category> catli = catcon.getAllCategories();
					System.out.println("Categories : ");
					for (Category c : catli) {
						System.out.println(c.getCid() + ": " + c.getCname());
					}

					break;
					
					
				case 5:
					System.out.println("Existing... Goodbye!");
					sc.close();				
					
					break;
					
				default:
					System.out.println("Invalid choice. Please try again.");
					
					
			
			}
			
			
		}
		
	}

}

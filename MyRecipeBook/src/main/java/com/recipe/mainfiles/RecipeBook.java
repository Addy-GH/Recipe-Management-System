package com.recipe.mainfiles;

import java.util.List;
import java.util.Scanner;

import com.recipe.controller.RecipeController;
import com.recipe.model.Recipe;

public class RecipeBook {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RecipeController recon = new RecipeController();
		
		
		while(true) {
			
			System.out.println("===============================");
			System.out.println(" My Recipe Book :) ");
			System.out.println("===============================");
			System.out.println("1. Add Recipe.");
			System.out.println("2. Get All Recipe.");
			System.out.println("3. Search Recipe.");
			System.out.println("4. Update Recipe.");
			System.out.println("5. Delete Recipe.");
			System.out.println("6. Exit...");
		
			
			System.out.println("Enter the number from above list to perfom any operation.");
			int choice = sc.nextInt();
			sc.nextLine();
			
			
			switch (choice) {
			case 1: 
				System.out.println("Enter the recipe name : ");
				String rname = sc.nextLine();
				System.out.println("Enter the recipe category : ");
				String category = sc.nextLine();
				System.out.println("Enter the recipe ingredients : ");
				String ingredients = sc.nextLine();
				System.out.println("Enter the recipe instructions : ");
				String instructions = sc.nextLine();
				
				Recipe rec = new Recipe();
				rec.setRname(rname);
				rec.setCategory(category);
				rec.setIngredients(ingredients);
				rec.setInstructions(instructions);
				
				recon.addRecipe(rec);
				System.out.println("Recipe added successfully...!");
				
				break;
				
			case 2:
				List<Recipe> recl = recon.getAllRecipes();
				System.out.println("Recipes : ");
				for (Recipe r : recl) {
					System.out.println("ID : " + r.getRid() + ", Name : " + r.getRname() +
							", Category : " + r.getCategory() + 
							", Ingredients : " + r.getIngredients() +
							", Intructions : " + r.getInstructions());
				}
				
				
				break;
				
			case 3:
				System.out.println("Enter keyword to search: ");
				String keyword = sc.nextLine();
				List<Recipe> searchResults = recon.searchRecipes(keyword);
				System.out.println("Search Results : ");
				for (Recipe r : searchResults) {
					System.out.println("ID : " + r.getRid() + ", Name : " + r.getRname() +
							", Category : " + r.getCategory() + 
							", Ingredients : " + r.getIngredients() +
							", Intructions : " + r.getInstructions());
				}
				
				break;
				
				
			case 4: 
				System.out.println("Enter the recipe ID to update : ");
				int updateId = sc.nextInt();
				sc.nextInt();
				
				System.out.println("Enter the recipe name : ");
				String newName = sc.nextLine();
				System.out.println("Enter the recipe category : ");
				String newCategory = sc.nextLine();
				System.out.println("Enter the recipe ingredients : ");
				String newIngredients = sc.nextLine();
				System.out.println("Enter the recipe instructions : ");
				String newInstructions = sc.nextLine();
				
				Recipe updateRecipe = new Recipe(updateId, newName, newCategory, newIngredients, newInstructions);
				recon.updateRecipe(updateRecipe);
				System.out.println("Recipe updated successfully!");	
				
				break;
				
				
			case 5:
				System.out.println("Enter recipe ID to delete: ");
				int deleteId = sc.nextInt();
				recon.deleteRecipe(deleteId);
				System.out.println("Recipe deleted successfully!");
				
				break;
				
				
			case 6: 
				System.out.println("Exiting... Goodbye!");
				sc.close();
				
				break;
				
			default:
				System.out.println("Invalid choice. Please try again.");
			}
			
		}
		
		
	}

}

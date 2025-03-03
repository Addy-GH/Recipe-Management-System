package com.recipe.model;

public class Recipe {
	
	private int rid;
	private String rname;
	private String category;
	private String ingredients;
	private String instructions;
	

//	Constructor without ID because ID is auto increment 
	public Recipe(String rname, String category, String ingredients, String instructions) {
		this.rname = rname;
		this.category = category;
		this.ingredients = ingredients;
		this.instructions = instructions;
	}
	
	
//	Constructor with ID for updating
	public Recipe(int rid, String rname, String category, String ingredients, String instructions) {
		this.rid = rid;
		this.rname = rname;
		this.category = category;
		this.ingredients = ingredients;
		this.instructions = instructions;
	}


//	Getters and Setters for setting and getting the values because the variables are private
	public int getRid() {
		return rid;
	}


	public void setRid(int rid) {
		this.rid = rid;
	}


	public String getRname() {
		return rname;
	}


	public void setRname(String rname) {
		this.rname = rname;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getIngredients() {
		return ingredients;
	}


	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}


	public String getInstructions() {
		return instructions;
	}


	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}


//	To String
	@Override
	public String toString() {
		return "Recipe [rid=" + rid + ", rname=" + rname + ", category=" + category + ", ingredients=" + ingredients
				+ ", instructions=" + instructions + "]";
	}

//	Empty Constructor
	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

package com.recipe.model;

public class Category {

	private int cid;
	private String cname;
	
	
//	Constructor without ID because ID is auto increment 
	public Category(String cname) {
		this.cname = cname;
	}
	
	
//	Constructor with ID for updating	
	public Category(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}


//	Getters and Setters
	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


//	To String
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
	
//	Empty Constructor
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

}

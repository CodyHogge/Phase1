package com.test2.model;

public class Recipe {
	
	private Long id;
	private String name;
	private String description;
	private Integer cookTime;
	
	public Recipe() {}
	
	public Recipe (String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getCookTime() {
		return cookTime;
	}
	public void setCookTime(Integer cookTime) {
		this.cookTime = cookTime;
	}
	
	

}

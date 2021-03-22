package com.test2.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test2.model.Recipe;

@Repository
public interface RecipeRepository {

	List<Recipe> findAll();
	
	void addNewRecipe(Recipe recipe);
	
	void editRecipe(Recipe recipe);
	
	void deleteRecipe(Recipe recipe);
	
}
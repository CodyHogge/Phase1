package com.test2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test2.model.Recipe;
import com.test2.repository.HibernateRecipeRepositoryImpl;
import com.test2.repository.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {
	
	private RecipeRepository recipeRepository;
	
	@Override
	public List<Recipe> findAll(){
		return recipeRepository.findAll();
	}
	
	@Override
	public void addNewRecipe(Recipe recipe){
		this.recipeRepository.addNewRecipe(recipe);
		System.out.println("^^RecipeServiceImpl^^");
	}

	public RecipeRepository getRecipeRepository() {
		return recipeRepository;
	}

	public void setRecipeRepository(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}
	
	

}

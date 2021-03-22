package com.test2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test2.model.Recipe;

@Service
public interface RecipeService {

	List<Recipe> findAll();

	void addNewRecipe(Recipe recipe);	

}
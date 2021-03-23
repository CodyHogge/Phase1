package com.test2.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test2.model.Recipe;
import com.test2.repository.RecipeRepository;

@RestController
public class RecipeController {
	
	@Autowired
	RecipeRepository recipeRepository;
	
	@RequestMapping("/RecipeController/AllRecipeList")
	public String AllRecipeList(Model model) {
		System.out.println("^^RecipeController/AllRecipeList^^");
		List<Recipe> recipes = recipeRepository.findAll();
		
		model.addAttribute("recipes", recipes);
		return "RecipeBook";
	}
	
	@RequestMapping(value = "/RecipeController/AllRecList", method = RequestMethod.GET)
	public ResponseEntity<List<Recipe>> AllRecList() {
		List<Recipe> recipes = recipeRepository.findAll();
		
		ResponseEntity<List<Recipe>> resp = new ResponseEntity<List<Recipe>>(recipes, HttpStatus.OK);
		return resp;
	}
	
	@RequestMapping(value = "/RecipeController/createRecipe", method = RequestMethod.POST)
	public String createRecipe(@RequestBody Recipe recipe) {
		System.out.println("^^RecipeController hit^^");
		recipeRepository.addNewRecipe(recipe);
		
		return "Post Successfully";
	}

	
}

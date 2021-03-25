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
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test2.model.Recipe;
import com.test2.repository.RecipeRepository;

@RestController
@EnableAsync
public class RecipeController {
	
	@Autowired
	RecipeRepository recipeRepository;
	
	//GET METHOD FOR FreshService.js LIST	
	@RequestMapping(value = "/RecipeController/AllRecList", method = RequestMethod.GET)
	public ResponseEntity<List<Recipe>> AllRecList() {
		List<Recipe> recipes = recipeRepository.findAll();
		
		ResponseEntity<List<Recipe>> resp = new ResponseEntity<List<Recipe>>(recipes, HttpStatus.OK);
		return resp;
	}
	
	//POST METHOD FOR FreshService.js ADD
	@RequestMapping(value = "/RecipeController/createRecipe", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public ResponseEntity<String> createRecipe(@RequestBody Recipe recipe) {
		System.out.println("^^RecipeController hit - createRecipe^^"); 

		recipeRepository.addNewRecipe(recipe);
		
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	
}

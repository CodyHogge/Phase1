package com.test2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.test2.model.Recipe;
import com.test2.repository.RecipeRepository;
import com.test2.service.RecipeService;

 
@Controller
@EnableAsync
public class MainController {
	
	@Autowired RecipeRepository recipeRepository;
	@Autowired RecipeService recipeService;
		
	
	@RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("home", "IS THIS HOME MODEL WORKING?");
		
		String content = "myHome Landing";
		
		model.addAttribute("content", content);
		model.addAttribute("recipes", recipeRepository.findAll());
		
		return "home";
	}
	
	
			
	
	
	
	
	
	//ROOM: KITCHEN MAPPING BEGIN
	
	@RequestMapping("/kitchen")
	public String kitchen(Model model) {
		String room = "Kitchen";
		String content = null;
		String[] roomTasks = {"Meal Planner", "Recipe Book", "Pantry List", "Grocery List", "Placeholder 2"};		
		model.addAttribute("roomName", room);
		model.addAttribute("content", content);
		model.addAttribute("roomTasks", roomTasks);
		
		
		return room.toLowerCase();
	}
	
	
	//Recipe Book Actions
	@RequestMapping("/RecipeBook")
	public String recipeBook(Model model) {
		String room = "Kitchen";
		String content = "Recipe Book";
		String[] roomTasks = {"Meal Planner", "Recipe Book", "Pantry List", "Grocery List", "Placeholder 2"};		
		model.addAttribute("roomName", room);
		model.addAttribute("content", content);
		model.addAttribute("roomTasks", roomTasks);		
		
		model.addAttribute("recipes", recipeRepository.findAll());
		
		return "RecipeBook";		
	}
	
	
	//Look at moving this information to the REST controller since it is a CRUD function
	//SYNC FORM ADDITION BEGIN
	@GetMapping("/addRecipe")
	public String addRecipe(Model model) {
		String content = "Sync Form";
		model.addAttribute("msg", "Get mapping - /addRecipe");
				
		model.addAttribute("content", content);
		model.addAttribute("recipes", recipeRepository.findAll());
		model.addAttribute("recipe", new Recipe());
		
		return "addRecipe";
	}
	
	@PostMapping("/addRecipe")
	public String addRecipe(@ModelAttribute("recipe") Recipe recipe, Model model, RedirectAttributes ra) {
		String content = "Sync Form";

		

		recipeRepository.addNewRecipe(recipe);		
		model.addAttribute("content", content);
		model.addAttribute("recipes", recipeRepository.findAll());
		ra.addFlashAttribute("msg", "Post mapping - /addRecipe");
				
		
		return "redirect:/home";
	}
	//SYNC FORM ADDITION END
	
	//ROOM: KITCHEN MAPPING END
	
	

}

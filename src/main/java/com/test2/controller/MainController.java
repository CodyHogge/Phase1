package com.test2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.test2.config.AppConfig;
import com.test2.model.Recipe;
import com.test2.repository.RecipeRepository;
import com.test2.service.RecipeService;

 

@Controller
@EnableAsync
public class MainController {
	
	@Autowired RecipeRepository recipeRepository;
	

		
	@RequestMapping({"/","/home"})
	public String home(Model model) {
		model.addAttribute("home", "IS THIS HOME MODEL WORKING?");
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		RecipeService service = appContext.getBean("recipeService", RecipeService.class);
		
		
		model.addAttribute("recipes", recipeRepository.findAll());
		
		return "home";
	}
	
	
	
	@GetMapping("/addRec")
	public String addRec(Model model) {
		model.addAttribute("msg", "Get map add");
		model.addAttribute("recipe", new Recipe());
		
		return "addRecipe";
	}
	
	@PostMapping("/addRec")
	public String addRec(@ModelAttribute("recipe")Recipe recipe, Model model, RedirectAttributes ra) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		RecipeService service = appContext.getBean("recipeService", RecipeService.class);
		
		
		return "/home";
	}
		
	
	@RequestMapping("/add")
	public String add(Model model, RedirectAttributes red, @RequestParam(name = "v1")Integer v1,
			@RequestParam(name = "v2")Integer v2, @RequestParam(name = "v3", required = false, defaultValue = "0")Integer v3) {
		
		System.out.println("************** HIT THE ADD CONTROLLER******************");
		System.out.println(v1 + " - " + v2 + " - " + v3);
		
		Integer sum = v1 + v2;
		if(v3 != null) {
			sum = sum + v3;
		}
		
		model.addAttribute("msg1", sum);
		
		return "index";
	}
	
	
	
	
	
	
	//App development final
	
	//ROOM: KITCHEN 
	@RequestMapping("/kitchen")
	public String kitchen(Model model) {
		String room = "Kitchen";
		String[] roomTasks = {"Meal Planner", "Recipe Book", "Pantry List", "Grocery List", "Placeholder 2"};		
		model.addAttribute("roomName", room);
		model.addAttribute("roomTasks", roomTasks);
		
		
		return room.toLowerCase();
	}
	
	@RequestMapping("/RecipeBook")
	public String recipeBook(Model model) {
		String room = "Kitchen";
		String[] roomTasks = {"Meal Planner", "Recipe Book", "Pantry List", "Grocery List", "Placeholder 2"};		
		model.addAttribute("roomName", room);
		model.addAttribute("roomTasks", roomTasks);		
		
		model.addAttribute("recipes", recipeRepository.findAll());
		
		return "RecipeBook";		
	}
	
	@RequestMapping("/RecipeBook/{action}")
	public String recipeAdd(@PathVariable("action") String action, Model model) {
		
		return "redirect:/RecipeBook";
	}
	
	@GetMapping("/addRecipe")
	public String addRecipe(Model model) {
		model.addAttribute("msg", "Get mapping - /addRecipe");
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		RecipeService service = appContext.getBean("recipeService", RecipeService.class);
		

		model.addAttribute("recipes", recipeRepository.findAll());

		model.addAttribute("recipe", new Recipe());
		
		return "addRecipe";
	}
	
	@PostMapping("/addRecipe")
	public String addRecipe(@ModelAttribute("recipe") Recipe recipe, Model model, RedirectAttributes ra) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		RecipeService service = appContext.getBean("recipeService", RecipeService.class);
		
		System.out.println("**********************");
		System.out.println("POST Mapping adding new recipe from form.");
		System.out.println(recipe.getName());
		System.out.println(recipe.getDescription());
		System.out.println("**********************");
		recipeRepository.addNewRecipe(recipe);
		
		

		model.addAttribute("recipes", recipeRepository.findAll());
		ra.addFlashAttribute("msg", "Post mapping - /addRecipe");
				
		
		return "redirect:/home";
	}
	
	
	

}

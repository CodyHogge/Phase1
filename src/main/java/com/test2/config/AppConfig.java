package com.test2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import com.test2.repository.HibernateRecipeRepositoryImpl;
import com.test2.repository.RecipeRepository;
import com.test2.service.RecipeService;
import com.test2.service.RecipeServiceImpl;

@Configuration
@EnableAsync
public class AppConfig {
	
	@Bean(name = "recipeService")
	public RecipeService getRecipeService() {
		RecipeServiceImpl recipeService = new RecipeServiceImpl();
		recipeService.setRecipeRepository(getRecipeRepository());
		
		return recipeService;
	}
	
	@Bean(name = "recipeRepository")
	public RecipeRepository getRecipeRepository() {
		return new HibernateRecipeRepositoryImpl();
	}

}

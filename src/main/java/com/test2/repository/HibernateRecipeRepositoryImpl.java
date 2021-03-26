package com.test2.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.test2.model.Recipe;
import com.test2.service.RecipeService;

@Repository
public class HibernateRecipeRepositoryImpl implements RecipeRepository {
	
	public List<Recipe> recipes;	
	
	private List<Recipe> initStaticList() {
		List<Recipe> recipes = new ArrayList<Recipe>();
		Recipe rec1 = new Recipe("Chicken Parmesan", "Delicious breaded chicken dish");
		rec1.setId(new Long(1));
		Recipe rec2 = new Recipe("Steak Tacos", "Carne Asada wrapped in flour tortillas");
		rec2.setId(new Long(2));
		Recipe rec3 = new Recipe("Tofu Burgers", "Vegetarian friendly burger");
		rec3.setId(new Long(3));
		Recipe rec4 = new Recipe("Chicken Sammies", "Delicacies that sparked a war");
		rec4.setId(new Long(4));
		
		recipes.add(rec1);
		recipes.add(rec2);
		recipes.add(rec3);
		recipes.add(rec4);
		
		
		return recipes;
	}
	
	
	@Override
	public List<Recipe> findAll(){
		
		List<Recipe> recipes = this.recipes;

		if(recipes == null) {
			recipes = initStaticList();
			System.out.println("^^initStaticList() -> HibRecRepImp called^^");
		}

		this.recipes = recipes;
		return recipes;
	}
	

	@Override
	public void addNewRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		System.out.println("^^addNewRecipe -> HibRecRepImp^^");		
		recipe.setId(new Long(this.recipes.size()+1));
		this.recipes.add(recipe);
		System.out.println("^^addNewRecipe() -> HibRecRepImp COMPLETE^^");
	}

	@Override
	public void editRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		
	}
	

}

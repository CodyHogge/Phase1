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
		Recipe rec1 = new Recipe("Chicken Parm", "Delicious breaded chicken dish");
		rec1.setId(new Long(1));
		Recipe rec2 = new Recipe("Steak Tacos", "Burrito de carne asada?");
		rec2.setId(new Long(2));
		Recipe rec3 = new Recipe("Tofu Burgers", "What even is tofu");
		rec3.setId(new Long(3));
		Recipe rec4 = new Recipe("Chicken Sammies", "Not as good as Noble Beasts tho... RIP");
		rec4.setId(new Long(4));
		
		recipes.add(rec1);
		recipes.add(rec2);
		recipes.add(rec3);
		recipes.add(rec4);
		
		
		return recipes;
	}
	
	
	@Override
	public List<Recipe> findAll(){
		System.out.println("^^findAll() -> HibRecRepImp called^^");
		List<Recipe> recipes = this.recipes;
		System.out.println(recipes);
		if(recipes == null) {
			recipes = initStaticList();
			System.out.println(recipes);
		}

		this.recipes = recipes;
		return recipes;
	}
	

	@Override
	public void addNewRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		System.out.println("^^addNewRecipe -> HibRecRepImp^^");		
//		List<Recipe> recipes = this.recipes;
//		System.out.println("^^this.recipes within addNewRecipe() -> HibRecRepImp^^");
//		recipes.add(recipe);
//		this.recipes = recipes;
		recipe.setId(new Long(this.recipes.size()+1));
		this.recipes.add(recipe);
		
		System.out.println("this.recipes after the add : ");
		recipes.forEach(u->{
			System.out.println(u.getName());
		});
		System.out.println("^^addNewRecipe() -> HibRecRepImp BREAK^^");
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

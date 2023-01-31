package com.codingz2m.RecipeApp.domain.course;

import com.codingz2m.RecipeApp.domain.Category;
import com.codingz2m.RecipeApp.domain.Ingredient;
import com.codingz2m.RecipeApp.domain.Notes;

public class Appetizer extends Course {
	

	public Appetizer(Long id, Category category, String menuName, String itemName, Ingredient ingredient, Notes notes) {
		
		super(id, category, menuName, itemName, ingredient, notes);

	}
	
	@Override
public String showIngredients() {
		
		return this.getIngredient().getDescription();
	}
	
	@Override
	public String showNotes() {
		
		return this.getNotes().getRecipeNotes();
	}
	

}

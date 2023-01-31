package com.codingz2m.RecipeApp.domain.featured;

import com.codingz2m.RecipeApp.domain.Category;
import com.codingz2m.RecipeApp.domain.Ingredient;
import com.codingz2m.RecipeApp.domain.Notes;


public class Grilling extends Featured {
	
private Ingredient ingredient; 
private Notes notes;

public Grilling (Long id, Category category, String menuName, String itemName, Ingredient ingredient, Notes notes) {
	
	super(id, category, menuName, itemName);
	
	this.ingredient = ingredient;
	this.notes = notes;
}

@Override
public String showIngredients() {
	
	return this.ingredient.getDescription();
}

@Override
public String showNotes() {
	return this.notes.getRecipeNotes();
}

}

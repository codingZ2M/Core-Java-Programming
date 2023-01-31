package com.codingz2m.RecipeApp.domain;

public abstract class Recipe { // Abstraction..
	
	private Long id;
	private Category category; // Composition...
	

	public Recipe(Long id, Category category) {
		this.id = id;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

      public String getCategoryDetails() {
    	  
    	  return this.category.getCategory() + " : " + this.category.getDescription();
    	  
      }
      
  	public abstract String showIngredients();
  	public abstract String showNotes();
  	
  	
}

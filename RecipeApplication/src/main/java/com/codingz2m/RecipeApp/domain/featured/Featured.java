package com.codingz2m.RecipeApp.domain.featured;

import com.codingz2m.RecipeApp.domain.Category;
import com.codingz2m.RecipeApp.domain.Recipe;

public abstract class Featured extends Recipe {
	
	private String menuName;
	private String itemName;
	
	public Featured(Long id, Category category, String menuName, String itemName) {
		
		super (id, category);
		this.menuName = menuName;
		this.itemName = itemName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getMenuName() {
		return menuName;
	}

	public String getItemName() {
		return itemName;
	}
	

	
}

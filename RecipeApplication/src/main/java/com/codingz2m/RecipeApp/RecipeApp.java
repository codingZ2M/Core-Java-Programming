package com.codingz2m.RecipeApp;

import com.codingz2m.RecipeApp.domain.Category;
import com.codingz2m.RecipeApp.domain.Ingredient;
import com.codingz2m.RecipeApp.domain.Notes;
import com.codingz2m.RecipeApp.domain.Recipe;
import com.codingz2m.RecipeApp.domain.course.Appetizer;
import com.codingz2m.RecipeApp.domain.course.Sandwich;
import com.codingz2m.RecipeApp.repository.impl.RecipeCourseRepository;


public class RecipeApp  {
    public static void main( String[] args ) {
        
    	Recipe recipe; 
    	String recipeDetails;
  
    	//Data given by the user..
    
    	String categoryType =" Course";
    	String categoryDesc ="Select one of the items under course category";
    	
    	String ingredientDesc = "1 dozen hard boiled eggs" + "  1 teaspoon Dijon mustard" + " 1 tablespoon Buffalo sauce" +
                                "1/4 cup mayonnaise" + " 2 tablespoons crumbled blue cheese" + " 2 tablespoons finely diced celery";
    	
    	String notesDesc = "This Buffalo Blue Cheese version might be one of my favorite (and easiest) riffs on the classic." +
                           "It’s a simple spin: deviled eggs with a dice of celery, some blue cheese, and buffalo sauce";
    	String menuName ="Appetizer";
    	String itemName ="Buffalo Blue Cheese Deviled Eggs";
   
/*
    	String categoryType ="Course";
    	String categoryDesc ="Select one of the items under course category";
    	
    	String ingredientDesc = "1 Tbsp olive oil" + "  1/2 cup minced carrots (can sub chopped bell pepper)" + " 1 cup finely chopped onion (about 1 medium onion)" +
                                "1/2 cup finely chopped celery" + " 2 cloves garlic, minced" + " 1/2 teaspoon salt";
    	
    	String notesDesc = "The best sloppy joe recipe and the one I love is the one I’m presenting here—a sweet and tangy ground beef "
    			              + "concoction that you ladle onto a hamburger bun";
    	String menuName ="Sandwich";
    	String itemName ="Best Ever Sloppy Joes";
  */
    
    	Category category = new Category();
    	            category.setCategory(categoryType);
    	            category.setDescription(categoryDesc);
    	                   
       Ingredient ingredient = new Ingredient(); 
    	           ingredient.setDescription(ingredientDesc);
    	           
       Notes notes = new Notes();
                  notes.setRecipeNotes(notesDesc);
    	
     recipe = new Appetizer(1L, category, menuName, itemName, ingredient, notes);
                           
   // recipe = new Sandwich(2L, category, menuName, itemName, ingredient, notes);
                  
                recipeDetails =  new RecipeCourseRepository().getRecipe(recipe);
                System.out.println(recipeDetails);
                
    
    	
    }
}

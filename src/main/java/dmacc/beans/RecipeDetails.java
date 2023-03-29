package dmacc.beans;

import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author  Andrew Steele aeste - aesteele
 * CIS175 - Fall 2021
 * Mar 29, 2023
 */

// created a basic class for storing the recipes in the database using a map to store all of the ingredients (3/29/23 AS)

@Entity
@Data
public class RecipeDetails {
	@Id
	@GeneratedValue
	public long id;
	public Map<String, Ingredient> listOfIngredients;
	public String recipeDirections;
	public String recipeNames;
	
	// setters getters commented out, I can not get the @Data annotation to work right for me
	/*
	 * public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public Map<String, Ingredient> getListOfIngredients() {
		return listOfIngredients;
	}
	public void setListOfIngredients(Map<String, Ingredient> listOfIngredients) {
		this.listOfIngredients = listOfIngredients;
	}
	public String getRecipeDirections() {
		return recipeDirections;
	}
	public void setRecipeDirections(String recipeDirections) {
		this.recipeDirections = recipeDirections;
	}
	public String getRecipeNames() {
		return recipeNames;
	}
	public void setRecipeNames(String recipeNames) {
		this.recipeNames = recipeNames;
	}
	@Override
	public String toString() {
		return "RecipeDetails [id=" + id + ", listOfIngredients=" + listOfIngredients + ", recipeDirections="
				+ recipeDirections + ", recipeNames=" + recipeNames + "]";
	}
	 */
	
}

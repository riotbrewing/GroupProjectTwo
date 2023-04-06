package dmacc.beans;


import java.util.ArrayList;
import java.util.List;



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
	//public Ingredient ingredients;
	public String recipeNames;
	public String recipeDirections;
	public String item;
	public double quantity;
	public String quantityType;
	
	
	


	public RecipeDetails() {
		super();
		
	}
	// setters getters commented out, I can not get the @Data annotation to work right for me
	 public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getItem() {
		return item;
	}
	public void setItem(String ingredient) {
		this.item = ingredient;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getQuantityType() {
		return quantityType;
	}
	public void setQuantityType(String quantityType) {
		this.quantityType = quantityType;
	}
	@Override
	public String toString() {
		return "RecipeDetails [id=" + id  + ", recipeDirections="
				+ recipeDirections + ", recipeNames=" + recipeNames + "]";
	}
	 
	
}

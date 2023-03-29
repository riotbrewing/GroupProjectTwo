package dmacc.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author  Andrew Steele aeste - aesteele
 * CIS175 - Fall 2021
 * Mar 29, 2023
 */

//class for creating ingredients 
@Data
@NoArgsConstructor
public class Ingredient {
	//used an enum for the volumes of measurement to ensure the only the allowed units can be added
	public enum Measurement 
	{
		ounces,
		pounds,
		Tbls,
		tsp,
		cups,
		pieces,
		dash
	}
	
	public String ingredientDescription;
	public double ingredientQuantity;
	public Measurement ingredientAmount;
	
	public Ingredient() {
		super();
	}
	public Ingredient(String ingredientDescription, double ingredientQuantity, Measurement ingredientAmount) {
		this.ingredientDescription = ingredientDescription;
		this.ingredientQuantity = ingredientQuantity;
		this.ingredientAmount = ingredientAmount;
	}
	
	
	// setters getters commented out, I can not get the @Data annotation to work right for me
	/*
	 * public String getIngredientDescription() {
		return ingredientDescription;
	}
	public void setIngredientDescription(String ingredientDescription) {
		this.ingredientDescription = ingredientDescription;
	}
	public double getIngredientQuantity() {
		return ingredientQuantity;
	}
	public void setIngredientQuantity(double ingredientQuantity) {
		this.ingredientQuantity = ingredientQuantity;
	}
	public Measurement getIngredientAmount() {
		return ingredientAmount;
	}
	public void setIngredientAmount(Measurement ingredientAmount) {
		this.ingredientAmount = ingredientAmount;
	}
	@Override
	public String toString() {
		return "Ingredient [ingredientDescription=" + ingredientDescription + ", ingredientQuantity="
				+ ingredientQuantity + ", ingredientAmount=" + ingredientAmount + "]";
	}
	 */
	
	
	
	
}



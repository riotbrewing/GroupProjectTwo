package dmacc.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import lombok.Data;

/**
 * @author Andrew Steele aeste - aesteele CIS175 - Fall 2021 Mar 29, 2023
 */

// created a basic class for storing the recipes in the database using a map to store all of the ingredients (3/29/23 AS)

@Entity
@Data
public class RecipeDetails {

	@Id
	@GeneratedValue
	public long id;
	// public Ingredient ingredients;
	public String recipeNames;
	public String recipeDirections;
	public String ingredients;
	public String desciption;
	public RecipeDetails() {
		super();
	}

	// setters getters commented out, I can not get the @Data annotation to work
	// right for me
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

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	@Override
	public String toString() {
		return "RecipeDetails [id=" + id + ", recipeDirections=" + recipeDirections + ", recipeNames=" + recipeNames
				+ "]";
	}
}

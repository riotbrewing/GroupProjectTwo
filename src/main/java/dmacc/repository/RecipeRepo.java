package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.RecipeDetails;

/**
 * @author  Andrew Steele aeste - aesteele
 * CIS175 - Fall 2021
 * Apr 3, 2023
 */

public interface RecipeRepo extends JpaRepository<RecipeDetails, Long>{

	RecipeDetails findByRecipeNames(String name);			
	
}


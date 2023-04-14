package dmacc.contoller;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Ingredients;
import dmacc.beans.RecipeDetails;


/**
 * @author  Andrew Steele aeste - aesteele
 * CIS175 - Fall 2021
 * Apr 3, 2023
 */
@Configuration
public class BeanConfig {


	@Bean
	RecipeDetails rd()
	{
		RecipeDetails bean = new RecipeDetails();
		
		return bean;
	}
     
	@Bean
	Ingredients ing()
	{
		Ingredients bean2 = new Ingredients();
		return bean2;
	}
	
	
	
}

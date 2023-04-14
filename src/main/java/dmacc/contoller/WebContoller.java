package dmacc.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Ingredients;
import dmacc.beans.RecipeDetails;

import dmacc.repository.RecipeRepo;

/**
 * @author  Andrew Steele aeste - aesteele
 * CIS175 - Fall 2021
 * Mar 29, 2023
 */
@Controller
public class WebContoller {
	@Autowired
	RecipeRepo repo;

	
	@GetMapping("/viewAll")
		public String viewAllRecipes(Model model)
		{
			if (repo.findAll().isEmpty())
			{
				return addNewRecipe(model);
			}
			
			model.addAttribute("recipe", repo.findAll());
			return "AllRecipes";
		}
	
	@GetMapping("/home")
		public String goHome()
		{
			return "index";
		}
	
	@GetMapping("/addRecipe")
		public String addNewRecipe(Model model)
		{
			RecipeDetails add = new RecipeDetails();
			model.addAttribute("addNew", add);
			return "CreateRecipe";
		}
	
	@GetMapping("/summary/{id}")
		public String recipe(@PathVariable long id, Model model)
		{
		RecipeDetails r = repo.findById(id).orElse(null);
		model.addAttribute("addNew", r);
		return "summary";
		}
	
	@PostMapping("/addRecipe")
		public String addNewRecipe(@ModelAttribute RecipeDetails r, Model model)
		{
			repo.save(r);
			return viewAllRecipes(model);
		}
	@GetMapping("/edit/{id}")
	public String showUpdateContact(@PathVariable("id") long id, Model model)
	{
		RecipeDetails r = repo.findById(id).orElse(null);
		model.addAttribute("addNew", r);
		return "CreateRecipe";
	}
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model)
	{
		RecipeDetails r = repo.findById(id).orElse(null);
		System.out.println(r.id);
		repo.deleteById(r.id);
		return viewAllRecipes(model);
	}
	@PostMapping("/update/{id}")
	public String reviseContact(RecipeDetails c, Model model)
	{
		repo.save(c);
		return viewAllRecipes(model);
	}
	
}

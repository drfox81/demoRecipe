package com.example.demorecipedrfox.controllers;

import com.example.demorecipedrfox.model.Ingredients;
import com.example.demorecipedrfox.model.Recipe;
import com.example.demorecipedrfox.services.IngredientService;
import com.example.demorecipedrfox.services.RecipeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recip")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping("/add")
    public String addRec(@RequestBody Recipe recipe) {
        recipeService.addRecipe(recipe);
        return recipe.getNameRecipre()+" - внесен в книгу рецептов";
    }

    @GetMapping("/get")
    public Recipe getRec(String recipeName) {
        return recipeService.getRecipe(recipeName);
    }

}
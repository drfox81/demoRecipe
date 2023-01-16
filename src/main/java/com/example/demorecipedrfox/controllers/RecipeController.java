package com.example.demorecipedrfox.controllers;

import com.example.demorecipedrfox.model.Ingredients;
import com.example.demorecipedrfox.model.Recipe;
import com.example.demorecipedrfox.services.IngredientService;
import com.example.demorecipedrfox.services.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recip")
public class RecipeController {

    private RecipeService recipeService;
    private IngredientService ingredients;

    public RecipeController(RecipeService recipeService, IngredientService ingredients) {
        this.recipeService = recipeService;
        this.ingredients = ingredients;
    }

    @GetMapping
    public String hw() {
        return "start";
    }

    @GetMapping("/ingr")
    public Ingredients getIngr(int id) {
        return ingredients.getIngredient(id);
    }

    @GetMapping("/ingr/add")
    public void addIngr(@RequestParam String name, @RequestParam int quantity, @RequestParam String measure) {
        Ingredients ingredients1 = new Ingredients(name, quantity, measure);
        ingredients.addIngredient(ingredients1);
    }

    @GetMapping("/recipe")
    public void addRec(Recipe recipe) {
        recipeService.addRecipe(recipe);
    }

    @GetMapping("/recipe/get")
    public Recipe getRec(String recipeName) {
        return recipeService.getRecipe(recipeName);
    }

}
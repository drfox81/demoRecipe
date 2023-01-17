package com.example.demorecipedrfox.controllers;

import com.example.demorecipedrfox.model.Ingredients;
import com.example.demorecipedrfox.services.IngredientService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ingr/get")
public class IngridientsController {

    private final IngredientService ingredientService;

    public IngridientsController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/get")
    public Ingredients getIngr(int id) {
        return ingredientService.getIngredient(id);
    }

    @PostMapping("/add")
    public String addIngr(@RequestBody Ingredients ingredients) {
        ingredientService.addIngredient(ingredients);
        return ingredients.getNameIngredients() + " - внесен";
    }

}

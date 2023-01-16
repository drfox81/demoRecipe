package com.example.demorecipedrfox.services;

import com.example.demorecipedrfox.model.Recipe;

public interface RecipeService {

    void addRecipe(Recipe recipe);
    Recipe getRecipe(String recipe);

}
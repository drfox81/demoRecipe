package com.example.demorecipedrfox.services.Impl;

import com.example.demorecipedrfox.model.Recipe;
import com.example.demorecipedrfox.services.RecipeService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class RecipeServiceImpl implements RecipeService {

    private static int couner;

    private static final Map<String, Recipe> recipeMap = new LinkedHashMap<>();



    @Override
    public void addRecipe(Recipe recipe) {
        recipeMap.put(recipe.getNameRecipre(), recipe);
    }

    @Override
    public Recipe getRecipe(String recipe) {
        return recipeMap.getOrDefault(recipe,null);
    }
}

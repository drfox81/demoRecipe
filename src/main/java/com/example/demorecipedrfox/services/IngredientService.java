package com.example.demorecipedrfox.services;

import com.example.demorecipedrfox.model.Ingredients;

public interface IngredientService {

    void addIngredient(Ingredients ingredient);

    Ingredients getIngredient(int id);

}
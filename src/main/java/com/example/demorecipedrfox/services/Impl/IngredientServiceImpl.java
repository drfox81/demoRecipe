package com.example.demorecipedrfox.services.Impl;

import com.example.demorecipedrfox.model.Ingredients;

import com.example.demorecipedrfox.services.IngredientService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {

    private static int idIngredient = 0;


    private static final Map<Integer, Ingredients> ingredientMap = new HashMap<>();


    public static int getIdIngredient() {
        return idIngredient;
    }

    public static Map<Integer, Ingredients> getIngredientMap() {
        return ingredientMap;
    }

    @Override
    public void addIngredient(Ingredients ingredient) {
        ingredientMap.put(getIdIngredient(), ingredient);
        idIngredient++;
    }

    @Override
    public Ingredients getIngredient(int id) {
        return getIngredientMap().getOrDefault(id,null);
    }
}
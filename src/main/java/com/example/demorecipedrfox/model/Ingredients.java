package com.example.demorecipedrfox.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingredients {
    private String nameIngredients;
    private int quantityIngr;
    private String measureUnit;

}
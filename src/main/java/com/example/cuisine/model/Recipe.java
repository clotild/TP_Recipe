package com.example.cuisine.model;

public class Recipe {
    private int idrecipe;
    private String recipename;
    private String recipedescription;
    private String recipeingredients;
    private String urlpicture;

    public Recipe(int idrecipe, String recipename, String recipedescription, String recipeingredients, String urlpicture) {
        this.idrecipe = idrecipe;
        this.recipename = recipename;
        this.recipedescription = recipedescription;
        this.recipeingredients = recipeingredients;
        this.urlpicture = urlpicture;
    }

    public int getIdrecipe() {
        return idrecipe;
    }

    public String getRecipename() {
        return recipename;
    }

    public String getRecipedescription() {
        return recipedescription;
    }

    public String getRecipeingredients() {
        return recipeingredients;
    }

    public String getUrlpicture() {
        return urlpicture;
    }
}

package com.example.cuisine.service;

import com.example.cuisine.model.Recipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecipeService {
    private static int idSequence = 0;
    private static List<Recipe> recipes= new ArrayList<>(Arrays.asList(
            new Recipe(++idSequence, "Pancake Moelleux", "Ce plat est supposé être dégusté au petit-déjeuner mais convient aussi comme dessert. Les pancakes sont traditionnellement accommodés avec du sirop d'érable et une noix de beurre mais rien n'empêche de les dévorer au sucre, au jus de citron ou avec de la pâte à tartiner.", "semoule, farine, oeuf, sucre, lait", "https://assets.afcdn.com/recipe/20221027/136756_w1000h667c1cx2933cy1783cxb5500cyb3671.webp"),
            new Recipe(++idSequence,"Quiche aux poireaux","Mon bon Marcel je pense que comme pour toutes les quiches (Lorraine ou autres) on fait suer les dés de jambon et on répartis sir les poireaux avant de recouvrir avec le mélange crème et oeufs . Amicalement, de Bernard", "pate brisé poireau creme fraiche beurre sel lait oeufs chaplure", "https://assets.afcdn.com/recipe/20200907/113826_w1000h667c1cx2880cy1920cxb5760cyb3840.webp"),
            new Recipe(++idSequence, "Une tartine gourmande", "Trouver la bonne idée recette pour le soir est souvent un casse-tête, il faut qu'elle soit rapide, facile à faire, avec si possible une liste de courses qui n'est pas à rallonge. Notre objectif est simple, proposer 5 idées de repas saines, rapides, faciles et pas chères pour se régaler !", "légumes et lait de coco","https://assets.afcdn.com/story/20190520/2006041_w944h530c1cx2000cy3000cxt0cyt1947cxb4000cyb4547.webp" ),
            new Recipe(++idSequence,"Verrines saumon concombre","Qui dit printemps, dit apéro, dit verrines ! Rien de plus efficaces que ces petits amuse-bouches pour se mettre en appétit du bout de la cuillère. Les verrines peuvent correspondre à toutes les occasions et sont idéales pour recevoir, qu'il s'agisse de la famille ou des amis.","fruits de mer fromage blanc et saumon ", "https://assets.afcdn.com/recipe/20131214/61985_w1000h750c1cx1632cy1224.webp")
    ));
    public List<Recipe> fetchAllRecipes(){
        return recipes;
    }
    public Recipe createRecipe (String recipename, String recipedescription, String recipeingredients, String urlpicture) {
        Recipe r = new Recipe(++idSequence, recipename, recipedescription, recipeingredients, urlpicture + idSequence);
        recipes.add(r);
        return r;
    }
}

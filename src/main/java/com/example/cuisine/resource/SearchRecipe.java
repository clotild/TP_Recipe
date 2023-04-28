package com.example.cuisine.resource;

import com.example.cuisine.model.Recipe;
import com.example.cuisine.service.RecipeService;

@Path ("recipes")
public class SearchRecipe {
    RecipeService recipeService = new RecipeService();
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response findRandomLastSixDayRecipes(){
        Recipe randomRecipe = recipeService.fetchRandomLastSixDayRecipes();
        RecipeDto recipeDto = randomRecipe.toDto();
        return Response.ok(recipeDto).build();
    }
}

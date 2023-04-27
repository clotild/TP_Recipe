package com.example.cuisine.servlet;

import com.example.cuisine.service.RecipeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(urlPatterns = "/add-recipe")
public class AddRecipeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Affiche la vue
        request
                .getRequestDispatcher("WEB-INF/add-recipe.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Recupere les données provenant du formulaire
        String recipename = req.getParameter("recipename");
        String recipedescription = req.getParameter("recipedescription");
        String recipeingredients = req.getParameter("recipeingredients");
        String urlpicture = req.getParameter("urlpicture");

        // Ajoute l'article via le service
        new RecipeService().createRecipe(recipename, recipedescription, recipeingredients, urlpicture);

        // Redirige vers la page /posts
        resp.sendRedirect("/recipe-list-add");
    }
}

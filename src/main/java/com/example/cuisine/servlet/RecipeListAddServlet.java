package com.example.cuisine.servlet;

import com.example.cuisine.model.Recipe;
import com.example.cuisine.service.RecipeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet (urlPatterns = RecipeListAddServlet.URL)
public class RecipeListAddServlet extends HttpServlet {
    public static final String URL = "/recipe-list-add";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RecipeService recipeService = new RecipeService();
        List<Recipe> recipeListAdd = recipeService.fetchAllRecipes();
        req.setAttribute("recipes", recipeListAdd);
        req
                .getRequestDispatcher("WEB-INF/recipe-list-add.jsp")
                .forward(req, resp);
    }
}

package com.example.cuisine.servlet;

import com.example.cuisine.service.NewUserService;
import com.example.cuisine.service.RecipeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(urlPatterns = "/registration")
public class AddNewUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Affiche la vue
        request
                .getRequestDispatcher("WEB-INF/registration.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Recupere les données provenant du formulaire
        String name = req.getParameter("name");
        String firstname = req.getParameter("firstname");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String urlphoto = req.getParameter("urlphoto");
        // Ajoute l'article via le service
        new NewUserService().createNewUser(name, firstname, email, password, urlphoto);
        // Redirige vers la page /posts
        resp.sendRedirect("/login");
    }
}

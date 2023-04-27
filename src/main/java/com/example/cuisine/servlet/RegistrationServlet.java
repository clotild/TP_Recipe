package com.example.cuisine.servlet;

import com.example.cuisine.model.NewUser;
import com.example.cuisine.model.Recipe;
import com.example.cuisine.service.NewUserService;
import com.example.cuisine.service.RecipeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet (urlPatterns = RegistrationServlet.URL)
public class RegistrationServlet extends HttpServlet {
    public static final String URL = "/add-user";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NewUserService newUserService =new NewUserService();
        List<NewUser> newUserList = newUserService.fetchAllNewUsers();
        req.setAttribute("newusers", newUserList);
        req
                .getRequestDispatcher("WEB-INF/registration.jsp")
                .forward(req, resp);
    }
}
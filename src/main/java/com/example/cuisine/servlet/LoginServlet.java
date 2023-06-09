package com.example.cuisine.servlet;

import com.example.cuisine.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(urlPatterns = LoginServlet.URL)
public class LoginServlet extends HttpServlet {

    public static final String URL = "/login";
    public static final String LOGIN_JSP = "WEB-INF/login.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(LOGIN_JSP).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        UserService userService = new UserService();
        boolean isLogged = userService.login(email, password);
        if(isLogged){
            HttpSession session = req.getSession();
            session.setAttribute("email", email);
           resp.sendRedirect(req.getContextPath() + RecipeListAddServlet.URL);
        }else {
            req.setAttribute("login_error", true);
            req.getRequestDispatcher(LOGIN_JSP).forward(req, resp);
        }
    }
}
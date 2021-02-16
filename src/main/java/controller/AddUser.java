package controller;

import entity.User;
import persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.*;

/**
 * A simple servlet to welcome the user.
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/addUser"}
)

public class AddUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        String userName = req.getParameter("userNameInput");
        String email = req.getParameter("emailInput");
        String password = req.getParameter("passwordInput");
        User newUser = new User(userName, email, password,0,  0);
        try {
            req.setAttribute("users", userDao.insert(newUser));
            RequestDispatcher dispatcher = req.getRequestDispatcher("/added.jsp");
            dispatcher.forward(req, resp);
        } catch (Exception e) {
            System.err.println("User already has that name");
            RequestDispatcher dispatcher = req.getRequestDispatcher("/signup.jsp");
            dispatcher.forward(req, resp);
        }



    }
}
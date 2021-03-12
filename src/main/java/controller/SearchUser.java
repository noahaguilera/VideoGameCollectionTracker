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

/**
 * A servlet that searches through the database based on the username entered.
 */

@WebServlet(
        urlPatterns = {"/searchUser"}
)

public class SearchUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userNameInput");
        String email = req.getParameter("emailInput");
        String password = req.getParameter("passwordInput");
        UserDao userDao = new UserDao();
        if (req.getParameter("search") != null) {
            req.setAttribute("users", userDao.getByPropertyLike("userName", userName));
        } else if (req.getParameter("all") != null) {
            req.setAttribute("users", userDao.getAll());
        } else if (req.getParameter("signup") != null) {
            User newUser = new User(userName, email, password,0);
            req.setAttribute("users", userDao.insert(newUser));
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/users.jsp");
        dispatcher.forward(req, resp);
    }
}
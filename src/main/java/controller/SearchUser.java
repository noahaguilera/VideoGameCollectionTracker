package controller;

import persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * A simple servlet to welcome the user.
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/searchUser"}
)

public class SearchUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String output = req.getParameter("userNameInput");
        UserDao userDao = new UserDao();
        if (req.getParameter("search") != null) {
            req.setAttribute("users", userDao.getByPropertyLike("userName", output));
        } else if (req.getParameter("all") != null) {
            req.setAttribute("users", userDao.getAll());
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/users.jsp");
        dispatcher.forward(req, resp);
    }
}
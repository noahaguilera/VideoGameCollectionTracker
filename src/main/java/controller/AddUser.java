package controller;

import entity.User;
import entity.Role;
import persistence.RoleDao;
import persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.*;
import java.util.List;

/**
 * A class that adds a user to the database.
 */

@WebServlet(
        urlPatterns = {"/addUser"}
)

public class AddUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        RoleDao roleDao = new RoleDao();
        String userName = req.getParameter("userNameInput");
        String email = req.getParameter("emailInput");
        String password = req.getParameter("passwordInput");

        List<User> userCheck = userDao.getByPropertyEqual("userName", userName);
        if(userCheck.isEmpty() == true) {
            User newUser = new User(userName, email, password,0,"");
            try {
                req.setAttribute("users", userDao.insert(newUser));
                List<User> newUserRole = userDao.getByPropertyEqual("userName", userName);
                Role newRole = new Role(0, userName, "User", newUserRole.get(0));
                roleDao.insert(newRole);
                RequestDispatcher dispatcher = req.getRequestDispatcher("/added.jsp");
                dispatcher.forward(req, resp);
            } catch (Exception e) {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/signup.jsp");
                dispatcher.forward(req, resp);
            }
        } else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/userExsists.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
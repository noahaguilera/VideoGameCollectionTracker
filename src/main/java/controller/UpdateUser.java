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
import java.util.List;

/**
 * A servlet that updates the user's password.
 */

@WebServlet(
        urlPatterns = {"/updateUser"}
)

public class UpdateUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        String userName = req.getParameter("userNameInput");
        String password = req.getParameter("passwordInput");
        List<User> userUpdate = userDao.getByPropertyEqual("userName", userName);
        User userUpdated = userUpdate.get(0);
        userUpdated.setPassword(password);
        userDao.saveOrUpdate(userUpdated);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/password.jsp");
        dispatcher.forward(req, resp);
    }


}
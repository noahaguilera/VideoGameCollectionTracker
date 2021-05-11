package controller;

import entity.User;
import entity.Role;
import persistence.UserDao;
import persistence.RoleDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

/**
 * A servlet that deletes a user from the database.
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/deleteUser"}
)

public class DeleteUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        RoleDao roleDao = new RoleDao();
        int id = Integer.parseInt(req.getParameter("trashcan"));
        User userInfo = userDao.getById(id);
        List<Role> userRole = roleDao.getByPropertyEqual("user_name", userInfo.getUserName());
        try {
            userDao.delete(userDao.getById(id));
            if (userRole.isEmpty() == false) {
                roleDao.delete(userRole.get(0));
            } else {

            }
            RequestDispatcher dispatcher = req.getRequestDispatcher("/deleted.jsp");
            dispatcher.forward(req, resp);
        } catch (Exception e) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/search.jsp");
            dispatcher.forward(req, resp);
        }

    }
}
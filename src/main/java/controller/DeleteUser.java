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
        int id = Integer.parseInt(req.getParameter("trashcan"));
        userDao.delete(userDao.getById(id));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/deleted.jsp");
        dispatcher.forward(req, resp);
    }
}
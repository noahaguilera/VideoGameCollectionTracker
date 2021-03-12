package controller;

import entity.UserGameList;
import persistence.GameListDao;
import persistence.UserGameListDao;

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
        urlPatterns = {"/deleteUserGame"}
)

public class DeleteUserGame extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserGameListDao userGameListDao = new UserGameListDao();
        int id = Integer.parseInt(req.getParameter("trashcan"));
        userGameListDao.delete(userGameListDao.getById(id));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/usergame.jsp");
        dispatcher.forward(req, resp);
    }
}
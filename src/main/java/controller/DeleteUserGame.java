package controller;

import persistence.UserGameListDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * A class that deletes the user's game from their gamelist
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
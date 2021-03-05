package controller;

import entity.GameList;
import persistence.GameListDao;
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
        urlPatterns = {"/deleteGame"}
)

public class DeleteGame extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GameListDao gameListDao = new GameListDao();
        int id = Integer.parseInt(req.getParameter("trashcan"));
        gameListDao.delete(gameListDao.getById(id));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/game.jsp");
        dispatcher.forward(req, resp);
    }
}
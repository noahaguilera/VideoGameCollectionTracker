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
        urlPatterns = {"/deleteGame"}
)

public class DeleteGame extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GameListDao gameListDao = new GameListDao();
        UserGameListDao userGameListDao = new UserGameListDao();
        int id = Integer.parseInt(req.getParameter("trashcan"));
        gameListDao.delete(gameListDao.getById(id));
        List<UserGameList> deleteUserGame = userGameListDao.getByPropertyEqual("gameList", id);
        for (int i = 0; i < deleteUserGame.size(); i++) {
            UserGameList deletedUserGame = deleteUserGame.get(i);
            userGameListDao.delete(deletedUserGame);
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/game.jsp");
        dispatcher.forward(req, resp);
    }
}
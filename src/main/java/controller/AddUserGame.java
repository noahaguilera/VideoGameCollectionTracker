package controller;

import entity.User;
import entity.UserGameList;
import persistence.GameListDao;
import persistence.UserDao;
import persistence.UserGameListDao;

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
 * A class that adds a user's game to the database.
 */

@WebServlet(
        urlPatterns = {"/addUserGame"}
)

public class AddUserGame extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserGameListDao userGameListDao = new UserGameListDao();
        GameListDao gameListDao = new GameListDao();
        UserDao userDao = new UserDao();
        String userName = req.getUserPrincipal().getName();
        String platform = req.getParameter("platformInput");
        int gameId = Integer.parseInt(req.getParameter("idInput"));
        List<User> userUpdate = userDao.getByPropertyEqual("userName", userName);
        User userUpdated = userUpdate.get(0);
        UserGameList newUserGame = new UserGameList(userUpdated, gameListDao.getById(gameId), platform);
        try {
            req.setAttribute("games", userGameListDao.insert(newUserGame));
            RequestDispatcher dispatcher = req.getRequestDispatcher("/usergame.jsp");
            dispatcher.forward(req, resp);
        } catch (Exception e) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/game.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
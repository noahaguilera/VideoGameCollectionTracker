package controller;

import entity.GameList;
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

/**
 * A servlet that allows you to edit a game.
 */

@WebServlet(
        urlPatterns = {"/editUserGame"}
)

public class EditUserGame extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserGameListDao dao = new UserGameListDao();
        String platform = req.getParameter("platformInput");
        int gameId = Integer.parseInt(req.getParameter("idInput"));
        UserGameList gameUpdated = dao.getById(gameId);
        gameUpdated.setPlatform(platform);
        dao.saveOrUpdate(gameUpdated);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/usergame.jsp");
        dispatcher.forward(req, resp);
    }
}
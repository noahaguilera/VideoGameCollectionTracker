package controller;

import entity.GameList;
import entity.User;
import persistence.GameListDao;
import persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.*;

/**
 * A servlet that adds a user to the database.
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/addGame"}
)

public class AddGame extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GameListDao gameListDao = new GameListDao();
        String title = req.getParameter("titleInput");
        String platform = req.getParameter("platformInput");
        String rating = req.getParameter("ratingInput");
        String description = req.getParameter("descriptionInput");
        String date = req.getParameter("releaseDateInput");
        GameList newGame = new GameList(0, title, platform, rating, description, "", date);
        try {
            req.setAttribute("games", gameListDao.insert(newGame));
            RequestDispatcher dispatcher = req.getRequestDispatcher("/game.jsp");
            dispatcher.forward(req, resp);
        } catch (Exception e) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/addgame.jsp");
            dispatcher.forward(req, resp);
        }



    }
}
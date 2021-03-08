package controller;

import entity.GameList;
import persistence.GameListDao;

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
        urlPatterns = {"/editGame"}
)

public class EditGame extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GameListDao gameListDao = new GameListDao();
        String title = req.getParameter("titleInput");
        String platform = req.getParameter("platformInput");
        String rating = req.getParameter("ratingInput");
        String description = req.getParameter("descriptionInput");
        String release_date = req.getParameter("releaseDateInput");
        int gameId = Integer.parseInt(req.getParameter("idInput"));
        GameList gameUpdated = gameListDao.getById(gameId);
        gameUpdated.setTitle(title);
        gameUpdated.setPlatform(platform);
        gameUpdated.setRating(rating);
        gameUpdated.setDescription(description);
        gameUpdated.setRelease_date(release_date);
        gameListDao.saveOrUpdate(gameUpdated);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/game.jsp");
        dispatcher.forward(req, resp);
        }
    }
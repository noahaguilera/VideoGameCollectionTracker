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
 * A servlet that searches through the database based on the username entered.
 */

@WebServlet(
        urlPatterns = {"/searchGame"}
)

public class SearchGame extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("titleInput");
        GameListDao gameListDao = new GameListDao();
        if (req.getParameter("search") != null) {
            req.setAttribute("games", gameListDao.getByPropertyLike("title", title));
        } else if (req.getParameter("all") != null) {
            req.setAttribute("games", gameListDao.getAll());
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/games.jsp");
        dispatcher.forward(req, resp);
    }
}

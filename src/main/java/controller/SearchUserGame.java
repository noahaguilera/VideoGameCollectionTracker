package controller;

import entity.GameList;
import entity.User;
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
import java.util.List;

/**
 * A servlet that searches through the database based on the username entered.
 */

@WebServlet(
        urlPatterns = {"/searchUserGame"}
)

public class SearchUserGame extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GameListDao gameListDao = new GameListDao();
        UserDao userDao = new UserDao();
        UserGameListDao userGameListDao =new UserGameListDao();
        String username = req.getParameter("usernameInput");
        if (req.getParameter("search") != null) {
            List<User> user = userDao.getByPropertyEqual("userName", username);
            if (user.isEmpty()) {

            } else {
                User correctUser = user.get(0);
                int userId = correctUser.getId();

                req.setAttribute("games", userGameListDao.getByPropertyEqual("user", userId));
                RequestDispatcher dispatcher = req.getRequestDispatcher("/usersgames.jsp");
                dispatcher.forward(req, resp);
            }

        }

    }
}


package controller;

import entity.GameList;
import entity.User;
import persistence.GameListDao;
import persistence.UserDao;
import persistence.UserGameListDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * A servlet that searches through the users game database based on their username.
 */

@WebServlet(
        urlPatterns = {"/searchUserGame"}
)

public class SearchUserGame extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        UserDao userDao = new UserDao();
        UserGameListDao userGameListDao =new UserGameListDao();
        String userName = req.getUserPrincipal().getName();
        if (req.getParameter("search") != null) {
            List<User> user = userDao.getByPropertyEqual("userName", userName);
            if (user.isEmpty()) {
                out.print("User Not Found");
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
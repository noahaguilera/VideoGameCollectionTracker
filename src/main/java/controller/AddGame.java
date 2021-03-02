package controller;

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




    }
}
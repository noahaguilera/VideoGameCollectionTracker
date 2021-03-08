package controller;

import persistence.GameListDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * A servlet that fills form values
 */

@WebServlet(
        urlPatterns = {"/formFill"}
)

public class FormFill extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GameListDao gameListDao = new GameListDao();
        int id = Integer.parseInt(req.getParameter("pencil"));
        req.setAttribute("games", gameListDao.getByPropertyEqual("id", "" + id + ""));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/editgame.jsp");
        dispatcher.forward(req, resp);




    }


}
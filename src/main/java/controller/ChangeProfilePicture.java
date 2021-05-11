package controller;

import entity.User;
import persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

/**
 * A class that retrieves the entered image url then sets it as the user's profile picture
 */

@WebServlet(
        urlPatterns = {"/changeProfilePicture"}
)

public class ChangeProfilePicture extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao dao = new UserDao();
        String pictureInput = req.getParameter("pictureInput");
        String userName = req.getUserPrincipal().getName();
        List<User> user = dao.getByPropertyEqual("userName", userName);
        User mainUser = user.get(0);
        mainUser.setProfilePicture(pictureInput);
        dao.saveOrUpdate(mainUser);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/home.jsp");
        dispatcher.forward(req, resp);
    }
}
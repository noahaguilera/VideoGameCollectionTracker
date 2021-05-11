import entity.User;
import entity.UserGameList;
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
 * sends user's name to the profile jsp
 */

@WebServlet(
        urlPatterns = {"/profile"}
)

public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getUserPrincipal().getName();
        UserDao userDao = new UserDao();
        List<User> searchUser = userDao.getByPropertyEqual("userName", userName);
        User mainUser = searchUser.get(0);
        req.setAttribute("user", mainUser);


        RequestDispatcher dispatcher = req.getRequestDispatcher("/profile.jsp");
        dispatcher.forward(req, resp);
    }
    }
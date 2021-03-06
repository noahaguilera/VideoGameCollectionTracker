package controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.GameList;
import persistence.GameListDao;
import rest.Game;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.lang.*;

/**
 * A class that allows the admin to add a game from the api
 */
@WebServlet(
        urlPatterns = {"/adminAddGame"}
)

public class AdminAddGame extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GameListDao gameListDao = new GameListDao();
        String title = req.getParameter("titleInput");

        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://rawg.io/api/games/" + title + "?key=2644a128aa664045a3bdaff09e8e8fb9");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Game game = mapper.readValue(response, Game.class);
        String esrb;
        String backgroundImage;
        /**
         * Checks if esrb or background image are null that it still inputs into the database
         */
        try {
            esrb = game.getEsrbRating().getName();
        } catch(NullPointerException e) {
            esrb = "";
        }

        try {
                backgroundImage = game.getBackgroundImage();
        } catch(NullPointerException e) {
            backgroundImage = "";
        }
        GameList newGame = new GameList(0, game.getName(), esrb, game.getDescription(), backgroundImage, game.getReleased());
        try {
            req.setAttribute("games", gameListDao.insert(newGame));
            RequestDispatcher dispatcher = req.getRequestDispatcher("/adminAddGame.jsp");
            dispatcher.forward(req, resp);
        } catch (Exception e) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/adminAddGame.jsp");
            dispatcher.forward(req, resp);
        }



    }
}
package persistence;

import entity.GameList;
import entity.User;
import entity.UserGameList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import test.util.Database;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User game list dao test.
 */
class UserGameListDaoTest {

    /**
     * The Dao.
     */
    UserGameListDao dao;

    /**
     * Creating the dao and setting up a clean version of the test database
     */
    @BeforeEach
    void setUp() {



        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new UserGameListDao();
    }

    /**
     * Gets user game by id.
     */
    @Test
    void getById() {
        UserGameList retrievedUser = dao.getById(4);
        assertNotNull(retrievedUser);
        assertEquals("ElonMusk", retrievedUser.getUser().getUserName());
    }

    /**
     * Updates which game is selected for the first id.
     */
    @Test
    void saveOrUpdate() {
        UserGameListDao userGameListDao = new UserGameListDao();
        GameListDao gameListDao = new GameListDao();
        UserGameList retrievedUser = dao.getById(1);
        retrievedUser.setGameList(gameListDao.getById(3));
        userGameListDao.saveOrUpdate(retrievedUser);
        assertEquals(gameListDao.getById(3).getTitle(), dao.getById(1).getGameList().getTitle());
    }

    /**
     * Insert a new user's game into the list.
     */
    @Test
    void insert() {
        dao = new UserGameListDao();
        GameListDao gameListDao = new GameListDao();
        UserDao userDao = new UserDao();
        UserGameList userNewGame = new UserGameList(userDao.getById(2), gameListDao.getById(3));
        dao.insert(userNewGame);
        List<UserGameList> usersGames = dao.getAll();
        assertEquals(7, usersGames.size());
    }

    /**
     * Delete users game from the database.
     */
    @Test
    void delete() {
        UserGameListDao userGameListDao = new UserGameListDao();
        UserGameList user_game_to_delete = userGameListDao.getById(2);
        userGameListDao.delete(user_game_to_delete);
        List<UserGameList> usersGames = dao.getAll();
        assertEquals(5, usersGames.size());
        UserGameList deleted_user_game = userGameListDao.getById(2);
        assertNull(deleted_user_game);
    }

    /**
     * Gets all users games.
     */
    @Test
    void getAll() {
        List<UserGameList> usersGames = dao.getAll();
        assertEquals(6, usersGames.size());
    }

    /**
     * Gets users games based on the users id.
     */
    @Test
    void getByPropertyEqual() {
        List<UserGameList> usersGames = dao.getByPropertyEqual("user", 1);
        assertEquals(2, usersGames.size());
    }

}
package persistence;

import entity.GameList;
import test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Game list dao test.
 */
class GameListDaoTest {

    /**
     * The Dao.
     */
    GameListDao dao;

    /**
     * Creating the dao and setting up a clean version of the test database
     */
    @BeforeEach
    void setUp() {



        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new GameListDao();
    }

    /**
     * Tests to make sure game can be retrieved by id.
     */
    @Test
    void getById() {
        GameList  retrievedGame = dao.getById(2);
        assertNotNull(retrievedGame);
        assertEquals("Call of Duty: Modern Warfare", retrievedGame.getTitle());
    }

    /**
     * Tests to make sure games title can be edited.
     */
    @Test
    void saveOrUpdate() {
        GameListDao gameListDao = new GameListDao();
        List<GameList> gameListUpdate = gameListDao.getByPropertyEqual("title", "Minecraft");
        GameList gameListUpdated = gameListUpdate.get(0);
        gameListUpdated.setPlatform("PC");
        gameListDao.saveOrUpdate(gameListUpdated);

        List<GameList> test_gameList = gameListDao.getByPropertyEqual("platform", "PC");
        GameList test_gameListUpdated = test_gameList.get(0);
        assertEquals("Minecraft", test_gameListUpdated.getTitle());
    }

    /**
     * Tests to make sure game is inserted into the database.
     */
    @Test
    void insert() {
        dao = new GameListDao();
        GameList newGame = new GameList(0, "Halo 4", "Xbox 360", "M", "Halo 4 is a shooter game in which players predominantly experience gameplay from a first-person perspective; the game perspective switches to third-person when using certain weapons, abilities and vehicles.", "", "2012-11-06");
        dao.insert(newGame);
        List<GameList> games = dao.getAll();
        assertEquals(4, games.size());
    }

    /**
     * Tests to make sure game is deleted from the database.
     */
    @Test
    void delete() {
        GameListDao gameListDao = new GameListDao();
        List<GameList> game_to_delete = gameListDao.getByPropertyEqual("title", "Super Mario Bro");
        GameList delete_game = game_to_delete.get(0);
        gameListDao.delete(delete_game);
        List<GameList> deleted_game = gameListDao.getByPropertyEqual("title", "Super Mario Bro");
        assertEquals(true , deleted_game.isEmpty());
    }

    /**
     * Tests database to make sure only 3 results are coming back
     */
    @Test
    void getAll() {
        List<GameList> lists = dao.getAll();
        assertEquals(3, lists.size());
    }

    /**
     * Tests database to check if their is only 2 rated E games
     */
    @Test
    void getByPropertyEqual() {
        List<GameList> games = dao.getByPropertyEqual("rating", "E");
        assertEquals(2, games.size());
    }

    /**
     * Tests database to check if their is only 1 game starting with the title call
     */
    @Test
    void getByPropertyLike() {
        List<GameList> games = dao.getByPropertyLike("title", "Call");
        assertEquals(1, games.size());
    }
}
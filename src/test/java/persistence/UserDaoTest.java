package persistence;

import entity.User;
import test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.servlet.RequestDispatcher;
import java.util.List;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
class UserDaoTest {

    UserDao dao;

    /**
     * Creating the dao and setting up a clean version of the test database
     */
    @BeforeEach
    void setUp() {



        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new UserDao();
    }

    /**
     * Verifies get all users outputs the correct length successfully.
     */
    @Test
    void getAllUsersSuccess() {
        List<User> users = dao.getAll();
        assertEquals(5, users.size());
    }

    /**
     * Verifies the method gets users by their username works successfully.
     */
    @Test
    void getByUserNameSuccess() {
        List<User> users = dao.getByPropertyLike("userName", "N");
        assertEquals(2, users.size());
    }

    /**
     * Verifies the user is returned correctly based on their id successfully.
     */
    @Test
    void getIdSuccess() {
        User  retrievedUser = dao.getById(3);
        assertNotNull(retrievedUser);
        assertEquals("NigelThornberry", retrievedUser.getUserName());
    }

    /**
     * Verifies the user is added to the database successfully.
     */
    @Test
    void insert() {
        dao = new UserDao();
        User newUser = new User("BillNye", "bnye@scienceguy.com", "science",0);
        dao.insert(newUser);
        List<User> users = dao.getAll();
        assertEquals(6, users.size());
    }

    /**
     * Verifies user's password has been changed successfully.
     */
    @Test
    void saveOrUpdate() {
        UserDao userDao = new UserDao();
        List<User> userUpdate = userDao.getByPropertyEqual("userName", "ElonMusk");
        User userUpdated = userUpdate.get(0);
        userUpdated.setPassword("TeslaRules");
        userDao.saveOrUpdate(userUpdated);

        List<User> test_user = userDao.getByPropertyEqual("password", "TeslaRules");
        User test_userUpdated = test_user.get(0);
        assertEquals("ElonMusk", test_userUpdated.getUserName());
    }

    /**
     * Verifies user was deleted successfully.
     */
    @Test
    void delete() {
        UserDao userDao = new UserDao();
        List<User> user_to_delete = userDao.getByPropertyEqual("userName", "BillGates");
        User delete_user = user_to_delete.get(0);
        userDao.delete(delete_user);
        List<User> deleted_user = userDao.getByPropertyEqual("userName", "BillGates");
        assertEquals(true , deleted_user.isEmpty());
    }

    @Test
    void getByPropertyEqual() {
        UserDao userDao = new UserDao();
        List<User> user_to_delete = userDao.getByPropertyEqual("userName", "NoahAguilera");
        assertEquals("Password123", user_to_delete.get(0).getPassword());
    }
}
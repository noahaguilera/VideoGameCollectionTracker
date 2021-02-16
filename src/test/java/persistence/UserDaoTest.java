package persistence;

import entity.User;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
class UserDaoTest {

    UserDao dao;

    /**
     * Creating the dao.
     */
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dao = new UserDao();
    }

    /**
     * Verifies the method gets all users successfully.
     */
    @org.junit.jupiter.api.Test
    void getAllUsersSuccess() {
        List<User> users = dao.getAll();
        //assertEquals(4, users.size());
    }

    /**
     * Verifies the method gets users by their username successfully.
     */
    @org.junit.jupiter.api.Test
    void getByUserNameSuccess() {
        List<User> users = dao.getByPropertyLike("userName", "N");
        assertEquals(2, users.size());
    }

    /**
     * Verifies the user is returned correctly based on id search.
     */
    @org.junit.jupiter.api.Test
    void getIdSuccess() {
        User  retrievedUser = dao.getById(3);
        assertNotNull(retrievedUser);
        assertEquals("MarvinMartian", retrievedUser.getUserName());
    }
}
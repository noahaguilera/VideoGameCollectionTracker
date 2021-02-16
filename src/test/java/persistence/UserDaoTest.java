package persistence;

import entity.User;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    UserDao dao;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dao = new UserDao();
    }

    @org.junit.jupiter.api.Test
    void getAll() {
        List<User> users = dao.getAll();
        assertEquals(3, users.size());
    }

    @org.junit.jupiter.api.Test
    void getByPropertyLike() {
        List<User> users = dao.getByPropertyLike("userName", "N");
        assertEquals(2, users.size());
    }
}
package persistence;

import entity.Role;
import entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import test.util.Database;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RoleDaoTest {

    RoleDao dao;

    /**
     * Creating the dao and setting up a clean version of the test database
     */
    @BeforeEach
    void setUp() {



        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new RoleDao();
    }

    @Test
    void getById() {
        Role roles = dao.getById(3);
        assertNotNull(roles);
        assertEquals("MarvinMartian", roles.getUser_name());
    }

    @Test
    void saveOrUpdate() {
    }

    @Test
    void insert() {
    }

    @Test
    void delete() {
        List<Role> roles = dao.getByPropertyEqual("user_name", "MarvinMartian");
        Role role = roles.get(0);
        dao.delete(role);
        List<Role> deleted_role = dao.getByPropertyEqual("user_name", "MarvinMartian");
        assertEquals(true , deleted_role.isEmpty());
        List<Role> total_roles = dao.getAll();
        assertEquals(3, total_roles.size());
    }

    @Test
    void getAll() {
        List<Role> roles = dao.getAll();
        assertEquals(4, roles.size());
    }

    @Test
    void getByPropertyEqual() {
        List<Role> roles = dao.getByPropertyEqual("user_role", "User");
        assertEquals(3, roles.size());
    }
}
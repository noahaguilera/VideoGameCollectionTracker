package persistence;

import entity.Role;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.*;
import java.util.List;

public class RoleDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get roles by id
     */
    public Role getById(int id) {
        Session session = sessionFactory.openSession();
        Role roles = session.get( Role.class, id );
        session.close();
        return roles;
    }

    /**
     * update roles
     * @param roles  roles to be inserted or updated
     */
    public void saveOrUpdate(Role roles) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(roles);
        transaction.commit();
        session.close();
    }

    /**
     * Insert roles
     * @param roles  roles to be inserted
     */
    public int insert(Role roles) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(roles);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete a role
     * @param roles roles to be deleted
     */
    public void delete(Role roles) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(roles);
        transaction.commit();
        session.close();
    }


    /** Return a list of all roles
     *
     * @return All roles
     */
    public List<Role> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Role> query = builder.createQuery( Role.class );
        Root<Role> root = query.from( Role.class );
        List<Role> roles = session.createQuery( query ).getResultList();

        logger.debug("The list of roles " + roles);
        session.close();

        return roles;
    }

    /**
     * Get roles by property (exact match)
     * sample usage: getByPropertyEqual("lastname", "Curry")
     */
    public List<Role> getByPropertyEqual(String propertyName, int value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for roles with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Role> query = builder.createQuery( Role.class );
        Root<Role> root = query.from( Role.class );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<Role> roles = session.createQuery( query ).getResultList();

        session.close();
        return roles;
    }


}

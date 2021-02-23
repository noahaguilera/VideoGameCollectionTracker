package persistence;

import entity.UserGameList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.*;
import java.util.List;

public class UserGameListDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get userGameList by id
     */
    public UserGameList getById(int id) {
        Session session = sessionFactory.openSession();
        UserGameList userGameList = session.get( UserGameList.class, id );
        session.close();
        return userGameList;
    }

    /**
     * update userGameList
     * @param userGameList  UserGameList to be inserted or updated
     */
    public void saveOrUpdate(UserGameList userGameList) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(userGameList);
        transaction.commit();
        session.close();
    }

    /**
     * Insert userGameList
     * @param userGameList  UserGameList to be inserted
     */
    public int insert(UserGameList userGameList) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(userGameList);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete a userGameList
     * @param userGameList UserGameList to be deleted
     */
    public void delete(UserGameList userGameList) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(userGameList);
        transaction.commit();
        session.close();
    }


    /** Return a list of all userGameLists
     *
     * @return All userGameLists
     */
    public List<UserGameList> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<UserGameList> query = builder.createQuery( UserGameList.class );
        Root<UserGameList> root = query.from( UserGameList.class );
        List<UserGameList> userGameLists = session.createQuery( query ).getResultList();

        logger.debug("The list of userGameLists " + userGameLists);
        session.close();

        return userGameLists;
    }

    /**
     * Get userGameList by property (exact match)
     * sample usage: getByPropertyEqual("lastname", "Curry")
     */
    public List<UserGameList> getByPropertyEqual(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for userGameList with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<UserGameList> query = builder.createQuery( UserGameList.class );
        Root<UserGameList> root = query.from( UserGameList.class );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<UserGameList> userGameLists = session.createQuery( query ).getResultList();

        session.close();
        return userGameLists;
    }

    /**
     * Get userGameList by property (like)
     * sample usage: getByPropertyLike("lastname", "C")
     */
    public List<UserGameList> getByPropertyLike(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for userGameList with {} = {}",  propertyName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<UserGameList> query = builder.createQuery( UserGameList.class );
        Root<UserGameList> root = query.from( UserGameList.class );
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, value + "%"));

        List<UserGameList> userGameLists = session.createQuery( query ).getResultList();
        session.close();
        return userGameLists;
    }

}

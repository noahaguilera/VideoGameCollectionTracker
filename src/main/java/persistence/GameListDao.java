package persistence;

import entity.GameList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.*;
import java.util.List;

public class GameListDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get gameList by id
     */
    public GameList getById(int id) {
        Session session = sessionFactory.openSession();
        GameList gameList = session.get( GameList.class, id );
        session.close();
        return gameList;
    }

    /**
     * update gameList
     * @param gameList  GameList to be inserted or updated
     */
    public void saveOrUpdate(GameList gameList) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(gameList);
        transaction.commit();
        session.close();
    }

    /**
     * Insert gameList
     * @param gameList  GameList to be inserted
     */
    public int insert(GameList gameList) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(gameList);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete a gameList
     * @param gameList GameList to be deleted
     */
    public void delete(GameList gameList) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(gameList);
        transaction.commit();
        session.close();
    }


    /** Return a list of all gameLists
     *
     * @return All gameLists
     */
    public List<GameList> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<GameList> query = builder.createQuery( GameList.class );
        Root<GameList> root = query.from( GameList.class );
        List<GameList> gameLists = session.createQuery( query ).getResultList();

        logger.debug("The list of gameLists " + gameLists);
        session.close();

        return gameLists;
    }

    /**
     * Get gameList by property (exact match)
     * sample usage: getByPropertyEqual("lastname", "Curry")
     */
    public List<GameList> getByPropertyEqual(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for gameList with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<GameList> query = builder.createQuery( GameList.class );
        Root<GameList> root = query.from( GameList.class );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<GameList> gameLists = session.createQuery( query ).getResultList();

        session.close();
        return gameLists;
    }

    /**
     * Get gameList by property (like)
     * sample usage: getByPropertyLike("lastname", "C")
     */
    public List<GameList> getByPropertyLike(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for gameList with {} = {}",  propertyName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<GameList> query = builder.createQuery( GameList.class );
        Root<GameList> root = query.from( GameList.class );
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, value + "%"));

        List<GameList> gameLists = session.createQuery( query ).getResultList();
        session.close();
        return gameLists;
    }

}

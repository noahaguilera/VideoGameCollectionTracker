package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type User game list.
 */
@Entity(name="UserGameList")
@Table(name="user_game_list")
public class UserGameList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "game_list_id")
    private GameList gameList;

    /**
     * Instantiates a new User game list.
     */
    public UserGameList() {
    }

    /**
     * Instantiates a new User game list.
     *
     * @param user     the user
     * @param gameList the game list
     */
    public UserGameList(User user, GameList gameList) {
        this.user = user;
        this.gameList = gameList;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Gets game list.
     *
     * @return the game list
     */
    public GameList getGameList() {
        return gameList;
    }

    /**
     * Sets game list.
     *
     * @param gameList the game list
     */
    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }

    @Override
    public String toString() {
        return "UserGameList{" +
                "id=" + id +
                ", user=" + user +
                ", gameList=" + gameList +
                '}';
    }
}

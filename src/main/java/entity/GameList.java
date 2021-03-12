package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Game list.
 */
@Entity(name = "GameList")
@Table(name = "game_list")
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "age_rating")
    private String rating;

    @Column(name = "game_description")
    private String description;

    @Column(name = "game_cover")
    private String cover;

    @Column(name = "release_date")
    private String release_date;

    @OneToMany(mappedBy = "gameList", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<UserGameList> userGameList = new HashSet<>();

    /**
     * Instantiates a new Game list.
     */
    public GameList() {
    }

    /**
     * Instantiates a new Game list.
     *
     * @param id          the id
     * @param title       the title
     * @param rating      the rating
     * @param description the description
     * @param cover       the cover
     */
    public GameList(int id, String title, String rating, String description, String cover, String release_date) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.description = description;
        this.cover = cover;
        this.release_date = release_date;
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
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets rating.
     *
     * @return the rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets rating.
     *
     * @param rating the rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets cover.
     *
     * @return the cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * Sets cover.
     *
     * @param cover the cover
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * Gets release_date.
     *
     * @return the release_date
     */
    public String getRelease_date() {
        return release_date;
    }

    /**
     * Sets release_date.
     *
     * @param release_date the release_date
     */
    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    /**
     * Gets user game list.
     *
     * @return the user game list
     */
    public Set<UserGameList> getUserGameList() {
        return userGameList;
    }

    /**
     * Sets user game list.
     *
     * @param userGameList the user game list
     */
    public void setUserGameList(Set<UserGameList> userGameList) {
        this.userGameList = userGameList;
    }

    @Override
    public String toString() {
        return "GameList{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", rating='" + rating + '\'' +
                ", description='" + description + '\'' +
                ", cover='" + cover + '\'' +
                ", release_date='" + release_date + '\'' +
                '}';
    }
}

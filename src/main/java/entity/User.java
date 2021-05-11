package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * A class to represent a user.
 *
 * @author pwaite
 */
@Entity(name = "User")
@Table(name = "user")
public class User {
    @Column(name = "user_name")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "profile_picture")
    private String profilePicture;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<UserGameList> userGameList = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Role> roles = new HashSet<>();

    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param userName       the user name
     * @param email          the email
     * @param password       the password
     * @param id             the id
     * @param profilePicture the profile picture
     */
    public User(String userName, String email, String password, int id, String profilePicture) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.id = id;
        this.profilePicture = profilePicture;
    }


    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
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
     * Gets user game list.
     *
     * @return the user game list
     */
    public Set<UserGameList> getUserGameList() {
        return userGameList;
    }

    /**
     * Sets user game list.
     * <p>
     * userGameList the user game list
     *
     * @param userGameList the user game list
     */
    public void setUserGameList(Set<UserGameList> userGameList) {
        this.userGameList = userGameList;
    }

    /**
     * Gets profile picture.
     *
     * @return the profile picture
     */
    public String getProfilePicture() {
        return profilePicture;
    }

    /**
     * Sets profile picture.
     *
     * @param profilePicture the profile picture
     */
    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID='" + id + '\'' +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", password='" + profilePicture + '\'' +
                '}';
    }


}
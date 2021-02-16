package edu.matc.entity;

import javax.persistence.*;

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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")

    private int id;

    @Column(name = "admin")
    private int admin;


    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param userName the user name
     * @param email  the email
     * @param password  the password
     * @param id        the id
     * @param admin     the admin status
     */
    public User(String userName, String email, String password, int id, int admin) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.id = id;
        this.admin = admin;
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
     * Gets admin.
     *
     * @return the admin status
     */
    public int getAdmin() {
        return admin;
    }

    /**
     * Sets admin.
     *
     * @param admin the admin status
     */
    public void setAdmin(int admin) {
        this.admin = admin;
    }





    @Override
    public String toString() {
        return "User{" +
                "ID='" + id + '\'' +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", admin='" + admin +  '\'' +
                '}';
    }


}
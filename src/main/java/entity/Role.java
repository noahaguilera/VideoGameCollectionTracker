package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type User game list.
 */
@Entity(name="Role")
@Table(name="user_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "user_role")
    private String user_role;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    /**
     * Instantiates a new Role.
     */
    public Role() {
    }

    /**
     * Instantiates a new Role.
     *
     * @param id        the id
     * @param user_name the user name
     * @param user_role the user role
     * @param user      the user
     */
    public Role(int id, String user_name, String user_role, User user) {
        this.id = id;
        this.user_name = user_name;
        this.user_role = user_role;
        this.user = user;
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
     * Gets user name.
     *
     * @return the user name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * Sets user name.
     *
     * @param user_name the user name
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * Gets user role.
     *
     * @return the user role
     */
    public String getUser_role() {
        return user_role;
    }

    /**
     * Sets user role.
     *
     * @param user_role the user role
     */
    public void setUser_role(String user_role) {
        this.user_role = user_role;
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

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", user_role='" + user_role + '\'' +
                ", user=" + user +
                '}';
    }
}

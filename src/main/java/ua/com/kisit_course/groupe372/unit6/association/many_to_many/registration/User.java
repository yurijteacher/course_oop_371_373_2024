package ua.com.kisit_course.groupe372.unit6.association.many_to_many.registration;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long id;
    private String username;
    private String password;

    private List<RolesHasUsers> rolesHasUsersList = new ArrayList<>();

    public List<RolesHasUsers> getRolesHasUsersList() {
        return rolesHasUsersList;
    }

    public void setRolesHasUsersList(List<RolesHasUsers> rolesHasUsersList) {
        this.rolesHasUsersList = rolesHasUsersList;
    }

    public User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

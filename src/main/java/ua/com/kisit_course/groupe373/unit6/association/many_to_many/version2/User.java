package ua.com.kisit_course.groupe373.unit6.association.many_to_many.version2;

import java.util.List;

public class User {

    private Long id;
    private String username;
    private String password;

    public User() {
    }

    private List<RolesHasUsers> rolesHasUsers;

    public List<RolesHasUsers> getRolesHasUsers() {
        return rolesHasUsers;
    }

    public void setRolesHasUsers(List<RolesHasUsers> rolesHasUsers) {
        this.rolesHasUsers = rolesHasUsers;
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

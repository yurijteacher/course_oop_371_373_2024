package ua.com.kisit_course.groupe373.unit6.association.many_to_many.version1;

import java.util.List;

public class Role {

    private Long id;
    private RolesUser name;

    private List<User> users;

    public Role() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RolesUser getName() {
        return name;
    }

    public void setName(RolesUser name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name=" + name +
                ", users=" + users +
                '}';
    }
}

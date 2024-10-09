package ua.com.kisit_course.groupe372.unit6.association.many_to_many.registration;

import java.util.ArrayList;
import java.util.List;

public class Roles {

    private List<RolesHasUsers> rolesHasUsersLists = new ArrayList<>();

    public List<RolesHasUsers> getRolesHasUsersLists() {
        return rolesHasUsersLists;
    }

    public void setRolesHasUsersLists(List<RolesHasUsers> rolesHasUsersLists) {
        this.rolesHasUsersLists = rolesHasUsersLists;
    }

    private Long id;
    private RoleUser role;

    public Roles() {
    }

    public Roles(Long id, RoleUser role) {
        this.id = id;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleUser getRole() {
        return role;
    }

    public void setRole(RoleUser role) {
        this.role = role;
    }

    @Override
    public String
    toString() {
        return "Roles{" +
                "id=" + id +
                ", role=" + role +
                '}';
    }
}

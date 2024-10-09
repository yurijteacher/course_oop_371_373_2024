package ua.com.kisit_course.groupe373.unit6.association.many_to_many.version2;

import java.util.List;

public class Role {

    private Long id;
    private RolesUser name;

    private List<RolesHasUsers> rolesHasUsersList;

    public List<RolesHasUsers> getRolesHasUsersList() {
        return rolesHasUsersList;
    }

    public void setRolesHasUsersList(List<RolesHasUsers> rolesHasUsersList) {
        this.rolesHasUsersList = rolesHasUsersList;
    }

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


    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}

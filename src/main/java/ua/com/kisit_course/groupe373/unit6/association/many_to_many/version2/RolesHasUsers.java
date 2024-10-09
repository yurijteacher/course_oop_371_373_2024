package ua.com.kisit_course.groupe373.unit6.association.many_to_many.version2;

public class RolesHasUsers {

    private Long id;
    private Role role;
    private User user;

    public RolesHasUsers() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "RolesHasUsers{" +
                "id=" + id +
                ", role=" + role +
                ", user=" + user +
                '}';
    }
}

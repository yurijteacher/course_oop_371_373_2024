package ua.com.kisit_course.groupe372.unit6.association.many_to_many.registration;

public class RolesHasUsers {

    private User user;
    private Roles role;

    public RolesHasUsers() {
    }

    public RolesHasUsers(User user, Roles role) {
        this.user = user;
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "RolesHasUsers{" +
                "user=" + user +
                ", role=" + role +
                '}';
    }
}

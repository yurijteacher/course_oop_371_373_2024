package ua.com.kisit_course.groupe372.unit11.entity;

public class Address {

    private Long id;
    private String description;

    public Address() {
    }

    public Address(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}

package ua.com.kisit_course.groupe372.unit12;

public class Category{

    private Long id;
    private String name;
    private String description;
    private String linkCategory;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", linkCategory='" + linkCategory + '\'' +
                '}';
    }

    public Category() {
    }

    public Category(Long id, String name, String description, String linkCategory) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.linkCategory = linkCategory;
    }

    public Category(String name, String description, String linkCategory) {
        this.name = name;
        this.description = description;
        this.linkCategory = linkCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkCategory() {
        return linkCategory;
    }

    public void setLinkCategory(String linkCategory) {
        this.linkCategory = linkCategory;
    }
}

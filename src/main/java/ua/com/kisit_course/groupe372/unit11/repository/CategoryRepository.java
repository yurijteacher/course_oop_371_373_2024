package ua.com.kisit_course.groupe372.unit11.repository;

import ua.com.kisit_course.groupe372.unit11.MyConnection;
import ua.com.kisit_course.groupe372.unit11.dao.CategoryDao;
import ua.com.kisit_course.groupe372.unit11.entity.Category;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository extends MyConnection implements CategoryDao {


    Connection connection;

    public CategoryRepository() {
        this.connection = myConnection();
    }

    @Override
    public List<Category> getAll() {

        List<Category> categories = new ArrayList<>();

        ResultSet resultSet = null;
        Statement statement = null;

        try {
            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM `category`");

            while (resultSet.next()) {

                Category category = new Category();
                category.setId(resultSet.getInt("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setImages(resultSet.getString("images"));


                categories.add(category);
            }
//            resultSet.close();
//            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return categories;
    }

    @Override
    public Category getById(long id) {

        Category category = new Category();

        ResultSet resultSet = null;
        Statement statement = null;

        try {
            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM `category` WHERE id = " + id);

            while (resultSet.next()) {
                category.setId(resultSet.getInt("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setImages(resultSet.getString("images"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return category;
    }

    @Override
    public Category save(Category category) {

        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.execute("INSERT INTO `category` (`name`, `description`, `images`) VALUES ('"
                    + category.getName() + "','"
                    + category.getDescription() + "','"
                    + category.getImages() + "')");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    public void delete(Category category) {

        Statement statement = null;
        try {
            statement = connection.createStatement();

            statement.executeUpdate("DELETE FROM `category` WHERE id = '" + category.getId() + "'");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }

    @Override
    public void deleteById(long id) {
        Statement statement = null;
        try {
            statement = connection.createStatement();

            statement.executeUpdate("DELETE FROM `category` WHERE id = '" +id + "'");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public void update(Category category) {

        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("UPDATE `category` SET `name`='" + category.getName() + "', `description`='" + category.getDescription() + "', `images`='" + category.getImages() + "' WHERE id = '" + category.getId() + "'");
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }
}

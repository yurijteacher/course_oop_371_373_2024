package ua.com.kisit_course.groupe371.unit11.repository;

import ua.com.kisit_course.groupe371.unit11.config.MyConnection;
import ua.com.kisit_course.groupe371.unit11.entity.Category;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository extends MyConnection implements CategoryDao{

    Connection connection;

    public CategoryRepository() {
        this.connection = super.getConnection();
    }

    @Override
    public void save(Category category) {

        String sql = "INSERT INTO `category` (`name`, `description`, " +
                "`image`) VALUES ('"
                +category.getName()+"', '"
                +category.getDescription()+"', '"
                +category.getImage()+"')";

        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.execute(sql);

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

    @Override
    public void update(Category category) {

        String sql = "UPDATE `category` SET `name` = '"
                +category.getName()+"', `description` = '"
                +category.getDescription()+"', `image` = '"
                +category.getImage()+"'"+ " WHERE `id` = '"
                +category.getId()+"'";

        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.execute(sql);

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

    @Override
    public void delete(Category category) {

        String sql = "DELETE FROM `category` WHERE `id` = '" + category.getId() + "'";
        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.execute(sql);
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
    public List<Category> getAll() {

        List<Category> categories = new ArrayList<>();

        String sql = "SELECT * FROM `category`";

        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Category category = new Category();
                category.setImage(resultSet.getString("image"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setId(resultSet.getInt("id"));

                categories.add(category);
            }

            resultSet.close();
            statement.close();
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

        String sql = "SELECT * FROM `category` where `id` = '" + id + "'";

        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                category.setId(resultSet.getInt("id"));
                category.setImage(resultSet.getString("image"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));

            }

            resultSet.close();
            statement.close();

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
}

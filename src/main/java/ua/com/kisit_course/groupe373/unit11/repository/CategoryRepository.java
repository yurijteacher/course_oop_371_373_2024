package ua.com.kisit_course.groupe373.unit11.repository;

import ua.com.kisit_course.groupe373.unit11.config.MyConnection;
import ua.com.kisit_course.groupe373.unit11.entity.Categories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository extends MyConnection implements CategoryDao{

    private Connection connection;

    public CategoryRepository() {
        this.connection = getConnection();
    }

        @Override
        public List<Categories> getAll() {

            List<Categories> categories = new ArrayList<>();

            ResultSet resultSet = null;
            Statement statement = null;
            try {
                statement = connection.createStatement();
                resultSet = statement.executeQuery("SELECT * FROM `category`");

                while (resultSet.next()) {

                    Categories category = new Categories();
                    category.setId(resultSet.getLong("id"));
                    category.setName(resultSet.getString("name"));
                    category.setDescription(resultSet.getString("description"));
                    category.setImage(resultSet.getString("image"));

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
    public Categories getById(long id) {


        Categories category = new Categories();

        ResultSet resultSet = null;
        Statement statement = null;
        try {
            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM `category` WHERE `id` = '" + id + "'");

            while (resultSet.next()) {

                category.setId(resultSet.getLong("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setImage(resultSet.getString("image"));
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

    @Override
    public void save(Categories categories) {

        Statement statement = null;
        try {

            statement = connection.createStatement();
            statement.execute("INSERT INTO `category` " +
                    "(`name`, `description`, `image`) VALUES ('"
                    + categories.getName() + "','"
                    + categories.getDescription() + "','"
                    + categories.getImage() + "')");

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
    public void delete(Categories categories) {

        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(
                    "delete from `category` WHERE `id` = '" + categories.getId() + "'"
            );

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
    public void update(Categories categories) {

        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate("UPDATE `category` SET `name`='"+categories.getName()+
                    "', `description`='"+ categories.getDescription()+
                    "', `image`='" + categories.getImage()+
                    "' WHERE `id`=" + categories.getId());

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

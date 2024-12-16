package ua.com.kisit_course.groupe371.unit12.repository;

import ua.com.kisit_course.groupe371.unit12.config.ConnectionToDb;
import ua.com.kisit_course.groupe371.unit12.entity.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository extends ConnectionToDb implements CategoryDao{

    Connection connection;

    public CategoryRepository() {
        this.connection = getConnection();
    }

    @Override
    public void save(Category category) {

        String sql = "INSERT INTO `category` (`name`, `description`, `link_category`) VALUES (?, ?, ?)";

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, category.getName());
            preparedStatement.setString(2, category.getDescription());
            preparedStatement.setString(3, category.getLink());

            preparedStatement.execute();

            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
           if (preparedStatement != null) {
               try {
                   preparedStatement.close();
               } catch (SQLException e) {
                   throw new RuntimeException(e);
               }
           }
        }


    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(Category category) {

    }

    @Override
    public List<Category> findAll() {

        List<Category> categories = new ArrayList<>();

        String sql = "SELECT * FROM `category`";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
             preparedStatement = connection.prepareStatement(sql);
             resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Category category = new Category();

                category.setId(resultSet.getLong("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setLink(resultSet.getString("link_category"));


                categories.add(category);

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            if(resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if(preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }


        return categories;
    }

    @Override
    public Category findById(long id) {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}

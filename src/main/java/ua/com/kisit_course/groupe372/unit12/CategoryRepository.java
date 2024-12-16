package ua.com.kisit_course.groupe372.unit12;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository extends MyConnection implements CategoryDao{

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
            preparedStatement.setString(3, category.getLinkCategory());

            preparedStatement.execute();

            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(preparedStatement!=null){
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
    public void delete(Long id) {

    }

    @Override
    public Category getById(long id) {
        return null;
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
                category.setLinkCategory(resultSet.getString("link_category"));

                categories.add(category);
            }

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(preparedStatement!=null){
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
    public void deleteAll() {

    }
}

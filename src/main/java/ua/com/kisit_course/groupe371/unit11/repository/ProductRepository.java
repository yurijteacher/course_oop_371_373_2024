package ua.com.kisit_course.groupe371.unit11.repository;

import ua.com.kisit_course.groupe371.unit11.config.MyConnection;
import ua.com.kisit_course.groupe371.unit11.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository extends MyConnection implements ProductDao {

    Connection connection;

    public ProductRepository() {
        this.connection = super.getConnection();
    }

    @Override
    public void save(Product product) {

        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO `products` (`name`, `description`, `price`, `category_id`) " +
                "VALUES (?, ?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.setInt(4, product.getCategory().getId());

            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void update(Product product) {

        PreparedStatement preparedStatement = null;

        String sql = "UPDATE `products` set name = ?, description = ?, price = ?, category_id = ? WHERE id = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.setInt(4, product.getCategory().getId());
            preparedStatement.setInt(5, product.getId().intValue());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delete(Product product) {

        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM `products` WHERE id = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, product.getId().intValue());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String sql = "SELECT * FROM `products`";
        try {
            preparedStatement  = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery(sql);

            while (resultSet.next()) {

                Product product = new Product();
                product.setId(resultSet.getLong("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPrice(resultSet.getDouble("price"));
                product.setCategory(new CategoryRepository().getById(resultSet.getInt("category_id")));

                products.add(product);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (resultSet != null) resultSet.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if ( preparedStatement != null) preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


        return products;
    }

    @Override
    public Product getById(long id) {

        Product product = new Product();

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            preparedStatement = connection.prepareStatement("SELECT * FROM `products` WHERE id = ?");
            preparedStatement.setInt(1, (int) id);
            resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {
                product.setId(resultSet.getLong("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPrice(resultSet.getDouble("price"));
                product.setCategory(new CategoryRepository().getById(resultSet.getInt("category_id")));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(resultSet != null) resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (preparedStatement != null) preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return product;
    }

}

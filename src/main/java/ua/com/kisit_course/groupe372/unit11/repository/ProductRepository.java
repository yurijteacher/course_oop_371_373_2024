package ua.com.kisit_course.groupe372.unit11.repository;

import ua.com.kisit_course.groupe371.unit5.association.one_to_many.Category;
import ua.com.kisit_course.groupe372.unit11.MyConnection;
import ua.com.kisit_course.groupe372.unit11.dao.ProductDao;
import ua.com.kisit_course.groupe372.unit11.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository extends MyConnection implements ProductDao {

    Connection connection;

    public ProductRepository() {
        this.connection = super.myConnection();
    }

    @Override
    public Product save(Product product) {

        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO `products` (`name`, `description`,`price`,`image`,`category_id`) VALUES (?, ?, ?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.setString(4, product.getImage());
            preparedStatement.setInt(5, product.getCategory().getId());

            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    @Override
    public List<Product> getAll() {

        List<Product> products = new ArrayList<>();


        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String sql = "SELECT * FROM `products`";

        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Product product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPrice(resultSet.getDouble("price"));
                product.setImage(resultSet.getString("image"));
                product.setCategory(new CategoryRepository().getById(resultSet.getInt("category_id")));

                products.add(product);
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
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

        return products;
    }

    @Override
    public Product getById(long id) {

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Product product = new Product();

        String sql = "SELECT * FROM `products`";

        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPrice(resultSet.getDouble("price"));
                product.setImage(resultSet.getString("image"));
                product.setCategory(new CategoryRepository().getById(resultSet.getInt("category_id")));

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
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return product;
    }



    @Override
    public void delete(Product product) {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM `products` WHERE id = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, product.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void deleteById(long idd) {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM `products` WHERE id = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, (int) idd);
        } catch (SQLException e) {
            throw new RuntimeException(e);
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

        String sql = "UPDATE `products` SET `name`=?, `description` = ?, `price` = ?, `image` = ?, `category_id`=? WHERE (`id` = ?);";

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.setString(4, product.getImage());
            preparedStatement.setInt(5, product.getCategory().getId());
            preparedStatement.setInt(6, product.getId());

            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

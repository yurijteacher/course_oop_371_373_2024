package ua.com.kisit_course.groupe373.unit11.repository;

import ua.com.kisit_course.groupe373.unit11.config.MyConnection;
import ua.com.kisit_course.groupe373.unit11.entity.Categories;
import ua.com.kisit_course.groupe373.unit11.entity.Products;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository extends MyConnection implements ProductDao{

    Connection connection;

    public ProductRepository() {
        this.connection = super.getConnection();
    }

    @Override
    public void save(Products products) {

        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO `products` (`name`, `description`, `price`, `image`, `category_id`) " +
                "VALUES (?,?,?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, products.getName());
            preparedStatement.setString(2, products.getDescription());
            preparedStatement.setBigDecimal(3, new BigDecimal(products.getPrice()));
            preparedStatement.setString(4, products.getImage());
            preparedStatement.setInt(5, Integer.valueOf(products.getCategory().getId().intValue()));

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public List<Products> getAll() {

        List<Products> productsList = new ArrayList<>();

        PreparedStatement preparedStatement = null;

        ResultSet resultSet = null;
        String sql = "SELECT * FROM `products`";

        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Products product = new Products();

                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPrice(resultSet.getDouble("price"));
                product.setImage(resultSet.getString("image"));
                Categories category = new CategoryRepository().getById(resultSet.getLong("category_id"));
                product.setCategory(category);

                productsList.add(product);
            }

            resultSet.close();
            preparedStatement.close();

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


        return productsList;
    }

    @Override
    public Products getById(long id) {
        return null;
    }



    @Override
    public void delete(Products products) {

    }

    @Override
    public void update(Products products) {

    }
}

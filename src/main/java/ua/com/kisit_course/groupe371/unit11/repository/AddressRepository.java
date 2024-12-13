package ua.com.kisit_course.groupe371.unit11.repository;

import ua.com.kisit_course.groupe371.unit11.config.MyConnection;
import ua.com.kisit_course.groupe372.unit11.entity.Address;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddressRepository extends MyConnection implements AddressDao{

    Connection connection;

    public AddressRepository() {
        this.connection = super.getConnection();
    }

    @Override
    public void save(Address address) {

        CallableStatement callableStatement = null;

        try {
            callableStatement  = connection.prepareCall("{call saveNewAdd(?)}");
            callableStatement.setString(1, address.getDescription());
            callableStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                callableStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }

    @Override
    public void update(Address address) {

    }

    @Override
    public void delete(Address address) {

    }

    @Override
    public List<Address> getAll() {

        List<Address> addresses = new ArrayList<>();

        CallableStatement callableStatement = null;

        try {
            callableStatement = connection.prepareCall("{call findAll()}");
            ResultSet resultSet = callableStatement.executeQuery();

            while (resultSet.next()) {
                Address address = new Address();
                address.setId(resultSet.getLong("id"));
                address.setDescription(resultSet.getString("description"));


                addresses.add(address);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return addresses;
    }

    @Override
    public Address getById(long id) {
        return null;
    }
}

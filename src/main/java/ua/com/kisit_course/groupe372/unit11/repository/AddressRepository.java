package ua.com.kisit_course.groupe372.unit11.repository;

import ua.com.kisit_course.groupe372.unit11.MyConnection;
import ua.com.kisit_course.groupe372.unit11.dao.AddressDao;
import ua.com.kisit_course.groupe372.unit11.entity.Address;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddressRepository extends MyConnection implements AddressDao {


    Connection collection;

    public AddressRepository() {
        this.collection = super.myConnection();
    }

    @Override
    public Address save(Address address) {


        CallableStatement cs = null;

        try {
            cs = collection.prepareCall("{call saveAddress(?)}");
            cs.setString(1, address.getDescription());
            cs.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                cs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


        return null;
    }


    @Override
    public List<Address> getAll() {

        CallableStatement cs = null;
        List<Address> addresses = new ArrayList<>();

        try {
            cs = collection.prepareCall("{call getAddress()}");

            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                Address address = new Address();
                address.setId(rs.getLong("id"));
                address.setDescription(rs.getString("description"));

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



    @Override
    public void delete(Address address) {

    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void update(Address address) {

    }
}

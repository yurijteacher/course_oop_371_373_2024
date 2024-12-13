package ua.com.kisit_course.groupe373.unit11.repository;

import ua.com.kisit_course.groupe373.unit11.config.MyConnection;
import ua.com.kisit_course.groupe373.unit11.entity.Clients;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientsRepository extends MyConnection implements ClientDao{

    Connection connection;

    public ClientsRepository() {
        this.connection = getConnection();
    }

    @Override
    public void save(Clients clients) {

        String sql = "{call saveNewclient(?, ?)}";

        CallableStatement callableStatement = null;

        try {
            callableStatement = connection.prepareCall(sql);
            callableStatement.setString(1, clients.getUsername());
            callableStatement.setString(2, clients.getPassword());

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
    public List<Clients> getAll() {

        List<Clients> clients = new ArrayList<>();

        String sql = "{call findAll()}";

        CallableStatement callableStatement = null;
        ResultSet resultSet = null;

        try {
            callableStatement = connection.prepareCall(sql);
            resultSet = callableStatement.executeQuery();

            while (resultSet.next()) {
                Clients client = new Clients();
                client.setId(resultSet.getInt("id"));
                client.setUsername(resultSet.getString("username"));
                client.setPassword(resultSet.getString("password"));

                clients.add(client);
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
                callableStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


        return clients;
    }


    @Override
    public void delete(Clients clients) {
        String sql = "{call deleteById(?)}";

        CallableStatement callableStatement = null;
        try {
            callableStatement = connection.prepareCall(sql);
            callableStatement.setInt(1, clients.getId());
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
    public void update(Clients clients) {


        String sql = "{call updateClients(?, ?, ?)}";

        CallableStatement callableStatement = null;
        try {
            callableStatement = connection.prepareCall(sql);
            callableStatement.setString(1, clients.getUsername());
            callableStatement.setString(2, clients.getPassword());
            callableStatement.setInt(3, clients.getId());

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
    public Clients getById(long id) {
        return null;
    }
}

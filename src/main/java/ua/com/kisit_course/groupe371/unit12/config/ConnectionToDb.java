package ua.com.kisit_course.groupe371.unit12.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
    https://mvnrepository.com


 */

public class ConnectionToDb {

    Connection connection;

    public Connection getConnection() {

        String url = "jdbc:mysql://localhost:3306/test_groupe371";
        String username ="root";
        String password = "root1234";

        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection to DB!");

        } catch (SQLException e) { throw new RuntimeException(e); }

        return connection;
    }


    public static void main(String[] args) {
       new ConnectionToDb().getConnection();
    }



}

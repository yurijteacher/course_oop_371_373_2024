package ua.com.kisit_course.groupe372.unit12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {


    public Connection connection = null;

    public Connection getConnection() {

        String url = "jdbc:mysql://localhost:3306/test_groupe372";
        String username = "root";
        String password = "root1234";


        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection to DB!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return connection;
    }


}

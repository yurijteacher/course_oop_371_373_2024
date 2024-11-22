package ua.com.kisit_course.groupe371.unit11.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    Connection connection;

    public Connection getConnection(){

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test_db_371",
                    "root",
                    "root1234");
            System.out.println("Connection to DB!!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("No connection to DB!");
        }

        return connection;
    }




}

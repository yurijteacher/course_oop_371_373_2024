package ua.com.kisit_course.groupe373.unit11.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    Connection connection = null;

    public Connection getConnection() {

        try {
            connection = DriverManager.getConnection(
                         "jdbc:mysql://localhost:3306/test_db_373",
                        "root",
                    "root1234");
            System.out.println("connection to db!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }


}

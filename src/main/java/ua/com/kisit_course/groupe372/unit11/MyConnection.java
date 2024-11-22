package ua.com.kisit_course.groupe372.unit11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    Connection connection;

    public Connection myConnection() {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db_372",
                    "root",
                    "root1234");
            System.out.println("Connection to DB!!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return connection;
    }



}

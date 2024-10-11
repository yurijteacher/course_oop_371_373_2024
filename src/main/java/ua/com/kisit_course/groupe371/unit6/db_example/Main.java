package ua.com.kisit_course.groupe371.unit6.db_example;

public class Main {

    public static void main(String[] args) {

        JdbcDriver mySQLDriver = new MySQLDriver();
        JdbcDriver postgreSQLDriver = new PostgreSQLDriver();
        JdbcDriver oracleDriver = new OracleDriver();

        System.out.println(mySQLDriver.getConnection("jdbc:mysql://localhost:3306/groupe371", "root", "1234"));
        System.out.println(postgreSQLDriver.getConnection("jdbc:postgresql://localhost:5432/groupe371", "postgres", "1234"));

        mySQLDriver.execute("select * from table1");
        postgreSQLDriver.execute("select * from table2");

    }

}

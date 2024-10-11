package ua.com.kisit_course.groupe372.unit7.db_example;

public class Test {

    public static void main(String[] args) {

        MySQLDriver driverMySQL = new MySQLDriver();
        PostgresqlDriver driverPostgresql = new PostgresqlDriver();
        OracleDriver driverOracle = new OracleDriver();

        String connection = (String) driverMySQL.getConnection("jdbc:mysql://localhost:3306/groupe372", "root", "root");
        System.out.println(connection);

        String connection1 = (String) driverPostgresql.getConnection("jdbc:postgresql://localhost:5432/groupe3", "postgres", "root");
        System.out.println(connection1);

        driverMySQL.execute("select * from category");
        driverPostgresql.execute("select * from product");

        JdbcDriver mySQL = new MySQLDriver();
        JdbcDriver myPostgres = new PostgresqlDriver();
        JdbcDriver myOracle = new OracleDriver();


    }


}

package ua.com.kisit_course.groupe373.unit7.db_example;

public class Test {

    public static void main(String[] args) {

        GeneralDriverJdbc mysqlDriver = new JdbcMySQLDriver();
        GeneralDriverJdbc postgreSQLDriver = new JdbcPostgresqlDriver();
        GeneralDriverJdbc oracleDriver = new JdbcOracleDriver();

        System.out.println(mysqlDriver.getConnection("jdbc:mysql://localhost:3306/groupe373", "root", "1234"));
        System.out.println(postgreSQLDriver.getConnection("jdbc:postgresql://localhost:5432/groupe373", "root", "1234"));
        System.out.println(oracleDriver.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "root", "1234"));

        System.out.println(mysqlDriver.qwerty("select * from table"));
        System.out.println(postgreSQLDriver.qwerty("select * from table2"));

        GeneralDriverJdbc db2Driver = new DB2Driver();
        System.out.println(db2Driver.getConnection("jdbc:db2://localhost:50000/groupe373", "root", "1234"));

    }

}

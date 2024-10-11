package ua.com.kisit_course.groupe373.unit7.db_example;

public class JdbcMySQLDriver implements GeneralDriverJdbc{

    @Override
    public String getConnection(String url, String username, String password) {
        return "connection to MySQL DB: " + url + ", " + username + ", " + password;
    }

    @Override
    public String qwerty(String sql) {
        return sql;
    }

    @Override
    public void execute(String sql) {
        System.out.println(sql);
    }

    @Override
    public void executeUpdate(String sql) {

    }

    @Override
    public void executeBatch(String sql) {

    }
}

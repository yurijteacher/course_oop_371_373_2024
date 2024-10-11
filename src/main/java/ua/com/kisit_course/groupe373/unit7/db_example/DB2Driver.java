package ua.com.kisit_course.groupe373.unit7.db_example;

public class DB2Driver implements GeneralDriverJdbc{
    @Override
    public String getConnection(String url, String username, String password) {
        return "connection to database";
    }

    @Override
    public String qwerty(String sql) {
        return sql;
    }

    @Override
    public void execute(String sql) {

    }

    @Override
    public void executeUpdate(String sql) {

    }

    @Override
    public void executeBatch(String sql) {

    }
}

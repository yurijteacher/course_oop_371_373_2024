package ua.com.kisit_course.groupe372.unit7.db_example;

public class DB2 implements JdbcDriver{
    @Override
    public Object getConnection(String url, String user, String password) {
        return null;
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

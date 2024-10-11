package ua.com.kisit_course.groupe371.unit6.db_example;

public class DB2Driver implements JdbcDriver{
    @Override
    public String getConnection(String url, String username, String password) {
        return "connection DB2";
    }

    @Override
    public void query(String sql) {
        System.out.println(sql);
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

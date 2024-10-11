package ua.com.kisit_course.groupe371.unit6.db_example;

public interface JdbcDriver {

    String getConnection(String url, String username, String password);
    void query(String sql);
    void execute(String sql);
    void executeUpdate(String sql);
    void executeBatch(String sql);

}

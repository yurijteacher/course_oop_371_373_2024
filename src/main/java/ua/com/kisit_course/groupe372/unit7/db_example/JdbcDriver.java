package ua.com.kisit_course.groupe372.unit7.db_example;

public interface JdbcDriver {

    Object getConnection(String url, String user, String password);

    // void query(String sql);
    void execute(String sql);
    void executeUpdate(String sql);
    void executeBatch(String sql);

}

package ua.com.kisit_course.groupe372.unit7.db_example;

public class OracleDriver implements JdbcDriver {
    @Override
    public Object getConnection(String url, String user, String password) {
        return "connection to MySQLServer" +","+ url +","+ user + "," +password;
    }

    @Override
    public void execute(String sql) {
        System.out.println("sql: " + sql);
    }

    @Override
    public void executeUpdate(String sql) {
        System.out.println("sql: " + sql);
    }

    @Override
    public void executeBatch(String sql) {
        System.out.println("sql: " + sql);
    }
}

package ua.com.kisit_course.groupe371.unit6.db_example;

public class OracleDriver implements JdbcDriver{
    @Override
    public String getConnection(String url, String username, String password) {
        return "connection to Oracle!" + url +"," + username + "," + password;
    }

    @Override
    public void query(String sql) {
        System.out.println(sql);
    }

    @Override
    public void execute(String sql) {
        System.out.println(sql);
    }

    @Override
    public void executeUpdate(String sql) {
        System.out.println(sql);
    }

    @Override
    public void executeBatch(String sql) {
        System.out.println(sql);
    }
}

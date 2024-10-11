package ua.com.kisit_course.groupe372.unit7.db_example;

public class PostgresqlDriver implements JdbcDriver {

    @Override
    public Object getConnection(String url, String user, String password) {
        return "connection to PostgreSQL" +","+ url +","+ user + "," +password;
    }

    @Override
    public void execute(String sql) {
        System.out.println(sql);
    }

    @Override
    public void executeUpdate(String sql) {
        System.out.println("update table!");
    }

    @Override
    public void executeBatch(String sql) {
        System.out.println("insert table!, insert into table () values()!");
    }
}

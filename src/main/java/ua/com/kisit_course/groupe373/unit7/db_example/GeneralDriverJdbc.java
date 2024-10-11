package ua.com.kisit_course.groupe373.unit7.db_example;

public interface GeneralDriverJdbc {

    String getConnection(String url, String username, String password);

    String qwerty(String sql);

    void execute(String sql);
    void executeUpdate(String sql);
    void executeBatch(String sql);


}

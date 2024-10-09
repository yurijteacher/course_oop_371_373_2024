package ua.com.kisit_course.example.jvm.jvm9;

public class Main implements Manager{
    @Override
    public void manage(String param1, int param2, Object param3) {

    }

    public static void main(String[] args) {

        Main main = new Main();
        main.manage();
        System.out.println(main);

    }
}

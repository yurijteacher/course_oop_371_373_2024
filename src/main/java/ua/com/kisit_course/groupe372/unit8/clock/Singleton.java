package ua.com.kisit_course.groupe372.unit8.clock;

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
                instance = new Singleton();
        }

        return instance;
    }

    public void print(){
        System.out.println(this);
    }


}

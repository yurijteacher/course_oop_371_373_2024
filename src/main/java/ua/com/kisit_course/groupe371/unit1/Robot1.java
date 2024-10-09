package ua.com.kisit_course.groupe371.unit1;

public class Robot1 {

    double x = 0;
    double y =0;

    @Override
    public String toString() {
        return "Robot1{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void add(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public static void main(String[] args) {

        Robot1 robot1 = new Robot1();
        robot1.add(1, 2);
        System.out.println(robot1);

        robot1.add(3, 4);
        System.out.println(robot1);

    }



}

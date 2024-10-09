package ua.com.kisit_course.groupe371.unit5.generalization;

public class Info extends RobotExt {

    public void dance(){
        System.out.println("Robot dance");
    }

    public static void main(String[] args) {

        Info robotInfo = new Info();
        robotInfo.dance();

        robotInfo.setCourse(45);
        robotInfo.setDistance(200);
        robotInfo.forward();

        System.out.println(robotInfo);


    }

}

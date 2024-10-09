package ua.com.kisit_course.groupe372.unit5;

public class RobotManager {

    public static void main(String[] args) {

        Robot robot = new Robot();
        System.out.println(robot);

        Robot robot2 = new Robot(10,10,20,30);
        System.out.println(robot2);

        robot.setCourse(45);
        robot.setDistance(100);

        System.out.println(robot.toString());

        robot.forward();
        System.out.println(robot);

        robot.setCourse(90);
        robot.setDistance(500);

        robot.forward();

        System.out.println(robot);


        RobotExt robotExt = new RobotExt();
        robotExt.setCourse(45);
        robotExt.setDistance(200);
        robotExt.forward();

        System.out.println(robotExt);

        robotExt.setCourse(90);
        robotExt.setDistance(200);
        robotExt.forward();

        System.out.println(robotExt);


        RobotExt robotExt2 = new RobotExt(0,0,90,100);
        System.out.println(robotExt2);


        for(RobotLine line : robotExt.getLines()){
            System.out.println(line);
        }

        RobotExt robotExt3 = new RobotExt(0,0,0,0);

        for (int i = 0; i < 12; i++) {
            robotExt3.setCourse(i*30);
            robotExt3.setDistance(100);
            robotExt3.forward();
        }


        for (RobotLine line : robotExt3.getLines()) {
            System.out.println(line);
        }








    }


}

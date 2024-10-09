package ua.com.kisit_course.groupe373.unit5;

public class RobotManager {

    public static void main(String[] args) {

        Robot robot = new Robot();

        robot.setX(0);
        robot.setY(0);
        System.out.println(robot);

        robot.setCourse(45);
        robot.setDistance(100);

        robot.forward();
        System.out.println(robot);

        robot.setCourse(90);
        robot.setDistance(100);
        robot.forward();
        System.out.println(robot);

        RobotExt robotExt = new RobotExt();
        robotExt.setX(0);
        robotExt.setY(0);
        robotExt.setCourse(45);
        robotExt.setDistance(200);
        robotExt.forward();

        System.out.println("RobotExt {x ="+robotExt.getX() + ", y=" + robotExt.getY() + ", course=" + robotExt.getCourse() + ", distance=" + robot.getDistance() +"}");

        System.out.println(robotExt);

        RobotExt robotExt2 = new RobotExt(1,2,45,100);
        robotExt2.forward();
        System.out.println(robotExt2);

        robotExt2.setCourse(90);
        robotExt2.setDistance(200);
        robotExt2.forward();
        System.out.println(robotExt2);

        for(RobotLine line : robotExt2.getRobotLineList()){
            System.out.println(line);
        }


        Robot robot2 = new Robot();
        robot2.setX(0);
        robot2.setY(0);

        for (int i = 0; i < 100; i++) {
            robot2.setCourse(i*30);
            robot2.setDistance(100);
            robot2.forward();
        }

        for (RobotLine line : robot2.getRobotLineList()) {
            System.out.println(line);
        }


        Robot robotExt3 = new RobotExt(1,2,3,2);


    }


}

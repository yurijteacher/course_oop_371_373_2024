package ua.com.kisit_course.groupe373.unit7.robot_example;

public abstract class Robot {

    private Head head;
    private Body body;
    private Leg leg;
    private Hand hand;

    abstract void dance();
    abstract void action();


    public Robot() {
    }

    public Robot(Head head, Body body, Leg leg, Hand hand) {
        this.head = head;
        this.body = body;
        this.leg = leg;
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "head=" + head +
                ", body=" + body +
                ", leg=" + leg +
                ", hand=" + hand +
                '}';
    }
}

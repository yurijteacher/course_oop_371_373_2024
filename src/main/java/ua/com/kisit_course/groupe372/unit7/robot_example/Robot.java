package ua.com.kisit_course.groupe372.unit7.robot_example;

public abstract class Robot {

    private Body body;
    private Hand hand;
    private Head head;
    private Leg leg;

    abstract void dance();
    abstract void action();

    public Robot() {
    }

    public Robot(Body body, Hand hand, Head head, Leg leg) {
        this.body = body;
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "body=" + body +
                ", hand=" + hand +
                ", head=" + head +
                ", leg=" + leg +
                '}';
    }
}

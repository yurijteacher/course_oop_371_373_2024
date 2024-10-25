package ua.com.kisit_course.groupe371.unit7.my_clock;

public class ClockExt extends Clock {

    private int second;

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public ClockExt() {}

    public ClockExt(int hour, int minute, int second) {
        super(hour, minute);
        this.second = second;
    }

    public void nextSecond(){
        second++;
        if(second > 59){
            second = 0;
            super.nextMinute();
        }
    }

    @Override
    public String toString() {
        return "ClockExt{" +
                "hour=" + getHour() +
                ", minute=" + getMinute() +
                ", second=" + second +
                '}';
    }
}

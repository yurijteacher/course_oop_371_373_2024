package ua.com.kisit_course.groupe372.unit8.my_clock;

public class ClockExt2 extends ClockExt{

    private int millisecond;

    public int getMillisecond() {
        return millisecond;
    }

    public void setMillisecond(int millisecond) {
        this.millisecond = millisecond;
    }

    public ClockExt2() {
    }


    public ClockExt2(int hour, int minute, int second, int millisecond) {
        super(hour, minute, second);
        this.millisecond = millisecond;
    }


    public void nextMs(){
        millisecond+=100;

        if(millisecond>999){
            millisecond=0;

            nextSecond();
        }
    }

    @Override
    public String toString() {
        return "ClockExt2{" +
                "hour=" + getHour() +
                ", minute=" + getMinute() +
                ", second=" + getSecond() +
                ", millisecond=" + millisecond +
                '}';
    }
}

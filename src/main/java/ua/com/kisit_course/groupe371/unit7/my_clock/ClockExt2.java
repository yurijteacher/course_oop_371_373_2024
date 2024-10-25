package ua.com.kisit_course.groupe371.unit7.my_clock;

public class ClockExt2 extends ClockExt {

    private int ms;

    public ClockExt2() {
    }

    public ClockExt2(int hour, int minute, int second, int ms) {
        super(hour, minute, second);
        this.ms = ms;
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public void nextMs(){
        ms+=100;
        if(ms>900){
            ms=0;
            nextSecond();
        }
    }

    @Override
    public String toString() {
        return "ClockExt2{" +
                "hour=" + getHour()+
                ", minute=" + getMinute()+
                ", seconds=" + getSecond() +
                ", ms=" + ms +
                '}';
    }
}

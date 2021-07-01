import java.util.Objects;

public class SimpleTime {
    private int hour, minute, second;

    public SimpleTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void addHour(int hour){
        this.hour = (this.hour+hour)%24;
    }

    public void addMinute(int minute){
        int thisMinutes = this.minute+this.hour*60;

        int newTime = thisMinutes+minute;
        this.hour = newTime/60%24;

        newTime = newTime%60;
        this.minute = newTime;
    }

    public void tick(){
        addSeconds(1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleTime that = (SimpleTime) o;
        return hour == that.hour && minute == that.minute && second == that.second;
    }


    public void addSeconds(int second){
        int thisSeconds = this.second+this.minute*60+this.hour*60*60;

        int newTime = thisSeconds+second;
        this.hour = newTime/3600%24;

        newTime = newTime%3600;
        this.minute = newTime/60;

        newTime = newTime%60;
        this.second = newTime;
    }

    public void add(SimpleTime time){
        int thisSeconds = this.second+this.minute*60+this.hour*60*60;
        int addSeconds = time.second+time.minute*60+time.hour*60*60;

        int newTime = thisSeconds+addSeconds;
        this.hour = newTime/3600%24;

        newTime = newTime%3600;
        this.minute = newTime/60;

        newTime = newTime%60;
        this.second = newTime;
    }

    public SimpleTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour>=0 && hour<24? hour:0;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute>=0 && minute<60? minute:0;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second>=0 && second<60? second:0;
    }

    @Override
    public String toString() {
        String h = this.hour<10? "0"+this.hour: this.hour+"";
        String m = this.minute<10? "0"+this.minute: this.minute+"";
        String s = this.second<10? "0"+this.second: this.second+"";

        return h + " : " + m + " : " + s ;
    }
}

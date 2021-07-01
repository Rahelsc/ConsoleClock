public class Alarm {
    private SimpleTime time;
    private boolean isSet;
    private int snoozeTime;
    private boolean isSnooze;

    public Alarm(SimpleTime time, boolean isSet, int snoozeTime, boolean isSnooze) {
        this.time = time;
        this.isSet = isSet;
        this.snoozeTime = snoozeTime;
        this.isSnooze = isSnooze;
    }

    public Alarm(){
        this.time = new SimpleTime();
        // other parameter are false and zero by default no need to initialize
    }

    public SimpleTime getTime() {
        return time;
    }

    public void setTime(SimpleTime time) {
        this.time = time;
    }

    public boolean isSet() {
        return isSet;
    }

    public void setSet(boolean set) {
        isSet = set;
    }

    public int getSnoozeTime() {
        return snoozeTime;
    }

    public void setSnoozeTime(int snoozeTime) {
        this.snoozeTime = snoozeTime;
    }

    public boolean isSnooze() {
        return isSnooze;
    }

    public void setSnooze(boolean snooze) {
        isSnooze = snooze;
    }
}

public class AlarmClock {
    private ExtendedTime currentTime;
    private Alarm[] alarmTimes;

    public ExtendedTime getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(ExtendedTime currentTime) {
        this.currentTime = currentTime;
    }

    public Alarm[] getAlarmTimes() {
        return alarmTimes;
    }


    public AlarmClock() {
        this.currentTime = new ExtendedTime();
        this.alarmTimes = new Alarm[5];
    }

    public void setAlarmTime(int numAlarm, SimpleTime time,
                             boolean isSet, int snoozeTime,
                             boolean isSnooze){
        numAlarm = numAlarm>=0 && numAlarm<5?numAlarm:0;
        this.alarmTimes[numAlarm] = new Alarm(time, isSet, snoozeTime, isSnooze);

    }

    public void setAlarmTime(int numAlarm, int hour, int minute,
                             int second, boolean isSet,
                             int snoozeTime, boolean isSnooze){
        numAlarm = numAlarm>=0 && numAlarm<5?numAlarm:0;
        this.alarmTimes[numAlarm] = new Alarm(new SimpleTime(hour, minute, second), isSet, snoozeTime, isSnooze);
    }
}

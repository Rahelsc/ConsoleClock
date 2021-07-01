import java.util.Scanner;

public class AlarmApplication {
    private AlarmClock alarmClock;

    public AlarmApplication(){
        alarmClock = new AlarmClock();
        createTwoAlarms();
        while (true){
            System.out.println(alarmClock.getCurrentTime());
            alarmClock.getCurrentTime().tick();

            for (int i = 0; i < alarmClock.getAlarmTimes().length; i++) {
                Alarm[] alarms = alarmClock.getAlarmTimes();
                if(alarms[i].isSet() && alarmClock.getCurrentTime().equals(alarms[i].getTime()))
                    System.out.println("RING RING");
                if (alarms[i].isSet() && alarms[i].isSnooze()){
                    alarms[i].getTime().addSeconds(alarms[i].getSnoozeTime());
                    alarmClock.setAlarmTime(i, alarms[i].getTime(), true, 0, false);
                }
            }

            for (Alarm alarm : alarmClock.getAlarmTimes()) {
                if(alarm.isSet() && alarmClock.getCurrentTime().equals(alarm.getTime()))
                    System.out.println("Ring RING");
                if (alarm.isSet() && alarm.isSnooze()){
                    alarmClock.setAlarmTime(, );
                }
            }
        }
    }

    private SimpleTime timeFromString(String stringTime) {
        String[] splitTime = stringTime.split(":");
        int hour = Integer.parseInt(splitTime[0]);
        int minute = Integer.parseInt(splitTime[1]);
        int second = Integer.parseInt(splitTime[2]);

        return new SimpleTime(hour, minute, second);
    }

    public void createTwoAlarms(){
        for (int i = 0; i < 2; i++) {
            getAlarmFromUser();
        }
    }

    private void getAlarmFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please choose alarm number, between 1-5");
        int numAlarm = scanner.nextInt();
        System.out.println("please enter time string, with the following format: HH:MM:SS");
        String time = scanner.nextLine();
        System.out.println("please enter whether to ring or not: y/n");
        boolean isSet = scanner.next().charAt(0) == 'y' || scanner.next().charAt(0) == 'Y';
        System.out.println("please enter snooze time (nudnik)");
        int snoozeTime = scanner.nextInt();
        System.out.println("snooze?");
        boolean isSnooze = scanner.next().equals("");
        alarmClock.setAlarmTime(numAlarm, timeFromString(time), isSet, snoozeTime, isSnooze);
    }

}

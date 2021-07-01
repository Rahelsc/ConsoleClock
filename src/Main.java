public class Main {
    // 22 : 58 : 59
    // 10 : 52 : 10
    public static void main(String[] args) {
        SimpleTime simpleTime = new SimpleTime(22, 58, 59);
        System.out.println(simpleTime);

        simpleTime.add(new SimpleTime(10, 52, 10));
        System.out.println(simpleTime);

        ExtendedTime extendedTime = new ExtendedTime(15, 12, 50, false);
        System.out.println(extendedTime);
    }
}

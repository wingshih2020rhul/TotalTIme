public class main {
    public static void main(String[] args) {
        Time T1 = new Time();
        T1.Time(12, 51, 1.3);
        Time T2 = new Time();
        T2.Time(12, 51, 1.3);
        Time T3 = T2;

        System.out.println(T2.equals(T3));
        System.out.println(T2 == T3);
        System.out.println("before");
        System.out.println(T1.equals(T2));
        T2 = T1;
        System.out.println("after");
        System.out.println(T1.equals(T2));

        Time t1 = new Time();
        Time t2 = new Time();
        t1.Time(0,30,59);
        t2.Time(12,30,1);
        System.out.println(TotalTime(t1,t2));
    }

    // question a
    public static Time TotalTime(Time t1, Time t2) {
        int hour = t1.getHour() + t2.getHour();
        int min = t1.getMinute() + t2.getMinute();
        double second = t1.getSecond() + t2.getSecond();

        min += (int) second / 60;
        second %= 60;
        hour += min / 60;
        min %= 60;

        Time totalTime = new Time();
        totalTime.Time(hour, min, second);
        return totalTime;
    }
}

public class Time {
    private int hour;
    private int minute;
    private double second;

    public void Time(int HH, int MM, double SS) {
        this.hour = HH;
        this.minute = MM;
        this.second = SS;
    }

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0d;
    }

    public double getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public String toString() {
        return "" + getHour() + ":" + getMinute() + ":" + getSecond();
    }
}

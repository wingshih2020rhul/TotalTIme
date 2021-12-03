public class mySum {
    public int sum(int x, int y) { return x + y; }
    public int sum(int x, int y, int z) { return x + y + 2 * z; }
    public double sum(double x, double y) { return 4 * x + 4 * y; }
    public double sum(int x, double y) { return x + 4 * y; }
    public double sum(double x, int y) { return 4 * x + 2 * y; }
    public String sum(String x, String y) { return x + y; }

    public static void main(String[] args) {
        mySum s = new mySum();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
        System.out.println(s.sum(10, 20.5));
        System.out.println(s.sum(10.5, 20));
        System.out.println(s.sum("10", "20"));
    }
}

package Static;

public class Main {
    static String appName;

    static {
        appName = "Mi app en Java";
        System.out.println("appName = " + appName);
    }

    static void main() {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        counter1.showCount();
        counter3.showCount();

        int result = MathUtils.square(5);
        System.out.println("result = " + result);
    }
}
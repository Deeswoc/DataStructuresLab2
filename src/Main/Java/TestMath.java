package Main.Java;

public class TestMath {

    public static void countDown(int n) {
        for (; n > 0; n--) {
            System.out.println(n);
        }
    }

    public static void countDownRecursively(int n) {
        System.out.println(n);
        if (n > 1)
            countDownRecursively(n - 1);
    }

    public static int GCD(int x, int y) {
        if (y == 0)
            return x;

        if (x > y && x != 0)
            return GCD(y, x % y);

        System.out.println("Something's wrong");
        return -999;
    }

    public static int gcdIterative(int x, int y) {
        int result = x;
        while (y > 0) {
            x = result;
            result = y;
            y = x % y;
        }
        return result;
    }



    public static int fib(int x) {
        if (x == 0)
            return 0;
        if (x == 1)
            return 1;
        if (x > 1)
            return fib(x - 1) + fib(x - 2);

        return -999;
    }
}
package Main.Java.Recursion;

public class RecursionDemo {

    public static void countDown(int n) {
        System.out.println(n);
        if (n > 1)
            countDown(n - 1);
    }



    public static int gcd(int x, int y) {
        if (y == 0)
            return x;

        if (x > y && x != 0)
            return gcd(y,x % y);

        System.out.println("Something's wrong");
        return -999;
    }

     public static void main(String[] args) {
        System.out.println(hanoi(8));
    }

    public static int ack(int x, int y) {
        if (x == 0)
            return y + 1;
        if (y == 0)
            return ack(x - 1, 1);
        return ack(x - 1, ack(x, y - 1));

    }


    public static int hanoi(int n){
        if (n==1)
            return 1;
        if (n>1)
            return 2 * hanoi(n-1)+1;
        return -999;
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

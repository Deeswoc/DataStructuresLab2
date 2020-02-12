package Main.Java.Iteration;

import Main.Java.OtherDataStructures.Stack;

public class IterationDemo {
    public static void countDown(int n) {
        for (; n > 0; n--) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        System.out.println(ack(4,3));
    }

    public static int ack(int x, int y) {
        Stack s = new Stack(1000000);
        int count = 0;
        s.push(x);
        while (!s.isEmpty()) {
            System.out.println(++count);
            x = s.pop();
            if (x == 0 || y == 0)
                y += x + 1;
            else {
                s.push(--x);
                s.push(++x);
                y--;
            }
        }
        return y;
    }


    public static int fib(int n){
        int total = 0, num1=0, num2=1;
        if(n == 1)
            return 1;
        for(int i = 0; i < n -1; i++){
            total = num1 + num2;
            int temp = num2;
            num2 += num1;
            num1 = temp;
        }
        System.out.println("printing");
        return  total;
    }

    public static int gcd(int x, int y) {
        int result = x;
        while (y > 0) {
            x = result;
            result = y;
            y = x % y;
        }
        return result;
    }

    public static int hanoi(int n){
        int result = 1;
        for(int i = 0; i < n-1; i++){
            result*=2;
            result++;
        }
        return result;
    }

}

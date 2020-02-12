package Main.Java;

import Main.Java.Iteration.IterationDemo;
import Main.Java.Recursion.*;

public class Driver {
    public static void main(String[] args) {

        System.out.println("Recursive GCD Function (356, 84): " + RecursionDemo.gcd(356, 84));
        System.out.println("Iterative GCD Function (356, 84): " + IterationDemo.gcd(356, 84));

        System.out.println("Recursive Fibonacci (6): " +  RecursionDemo.fib(6));

        System.out.println("Ackermann Function  " + RecursionDemo.ack(3, 2));
        System.out.println("Fibannacci Sequence  " + TestMath.fib(6));


    }
}

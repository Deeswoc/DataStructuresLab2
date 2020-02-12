package Main.Java.Iteration;

import Main.Java.Iteration.IterationDemo;

import Main.Java.Recursion.RecursionDemo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IterationDemoTest {
    @Test
    void countDown() {

    }

    @Test
    void ack(){
        assertEquals(2, IterationDemo.ack(1, 0));
        assertEquals(2, IterationDemo.ack(0, 1));
        assertEquals(3, IterationDemo.ack(1, 1));
        assertEquals(3, IterationDemo.ack(2, 0));
        assertEquals(3, IterationDemo.ack(0, 2));
        assertEquals(1, IterationDemo.ack(0, 0));
        //assertEquals(65533, RecursionDemo.ack(4, 1));  stack overflow
        assertEquals(61, IterationDemo.ack(3, 3));
        assertEquals(125, IterationDemo.ack(3, 4));

    }

    @Test
    void hanoi(){
        assertEquals(RecursionDemo.hanoi(8), IterationDemo.hanoi(8));
        assertEquals(RecursionDemo.hanoi(5), IterationDemo.hanoi(5));
        assertEquals(RecursionDemo.hanoi(2), IterationDemo.hanoi(2));
        assertEquals(RecursionDemo.hanoi(1), IterationDemo.hanoi(1));
        assertEquals(RecursionDemo.hanoi(20), IterationDemo.hanoi(20));
        assertEquals(RecursionDemo.hanoi(100), IterationDemo.hanoi(100));
    }


    @Test
    void gcd() {
        assertEquals(RecursionDemo.gcd(10, 2), IterationDemo.gcd(10, 2));
        assertEquals(RecursionDemo.gcd(224, 28), IterationDemo.gcd(224, 28));
        assertEquals(RecursionDemo.gcd(2445, 15), IterationDemo.gcd(2445, 15));
        assertEquals(RecursionDemo.gcd(40, 18), IterationDemo.gcd(40, 18));
    }

    @Test
    void fib(){
        assertEquals(RecursionDemo.fib(1), IterationDemo.fib(1));
        assertEquals(RecursionDemo.fib(4), IterationDemo.fib(4));
        assertEquals(RecursionDemo.fib(18), IterationDemo.fib(18));
        assertEquals(RecursionDemo.fib(23), IterationDemo.fib(23));
        assertEquals(RecursionDemo.fib(26), IterationDemo.fib(26));
        assertEquals(RecursionDemo.fib(70), IterationDemo.fib(70));
        assertEquals(RecursionDemo.fib(99), IterationDemo.fib(99));
    }
}
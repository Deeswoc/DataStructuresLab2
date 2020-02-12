package Main.Java.Recursion;

import org.junit.jupiter.api.Test;
import static Main.Java.Recursion.RecursionDemo.*;
import static org.junit.jupiter.api.Assertions.*;

class RecursionDemoTest {
    @Test
    void countDown() {
    }

    @Test
    void GCD() {
        assertEquals(5, gcd(200, 15));
        assertEquals(-999, gcd(14, 124));
        assertEquals(-999, gcd(-4, -100));

    }

    @Test
    void ack(){
        assertEquals(1, RecursionDemo.ack(0, 0));
        assertEquals(2, RecursionDemo.ack(1, 0));
        assertEquals(2, RecursionDemo.ack(0, 1));
        assertEquals(3, RecursionDemo.ack(1, 1));
        assertEquals(3, RecursionDemo.ack(2, 0));
        assertEquals(3, RecursionDemo.ack(0, 2));
        //assertEquals(65533, RecursionDemo.ack(4, 1));  stack overflow
        assertEquals(61, RecursionDemo.ack(3, 3));
        assertEquals(125, RecursionDemo.ack(3, 4));

    }

}
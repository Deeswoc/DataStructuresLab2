package Main.Java.OtherDataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack testStack;
    @Test
    void pop(){
        testStack = new Stack(100);
        testStack.push(23);
        testStack.push(42);
        testStack.push(2124);
        testStack.push(232);

        assertEquals(232, testStack.pop());
        assertEquals(2124, testStack.pop());
        assertEquals(42, testStack.pop());
        assertEquals(23, testStack.pop());
        assertEquals(-999999999, testStack.pop());
        assertEquals(-999999999, testStack.pop());
        assertEquals(-999999999, testStack.pop());
    }

    @Test
    void push(){
        testStack = new Stack(5);
        assertEquals(0, testStack.push(5));
        assertEquals(0, testStack.push(5));
        assertEquals(0, testStack.push(5));
        assertEquals(0, testStack.push(5));
        assertEquals(0, testStack.push(5));
        assertEquals(-999, testStack.push(5));
    }

    @Test
    void peek(){
        testStack = new Stack(3);
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        assertEquals(3, testStack.peek());
        assertEquals(3, testStack.peek());
        testStack.pop();
        assertEquals(2, testStack.peek());
        testStack.pop();
        testStack.pop();
        assertEquals(-999999999, testStack.pop());
    }

}
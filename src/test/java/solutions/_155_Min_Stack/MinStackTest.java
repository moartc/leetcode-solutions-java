package solutions._155_Min_Stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinStackTest {

    private MinStack minStack;

    @BeforeEach
    void setUp() {
        minStack = new MinStack();
    }

    @Test
    void test1() {

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        int min1 = minStack.getMin();
        Assertions.assertEquals(-3, min1);

        minStack.pop();

        int top = minStack.top();
        Assertions.assertEquals(0, top);

        int min2 = minStack.getMin();
        Assertions.assertEquals(-2, min2);
    }

    @Test
    void test2() {

        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);

        int top1 = minStack.top();
        Assertions.assertEquals(2147483647, top1);

        minStack.pop();

        int min1 = minStack.getMin();
        Assertions.assertEquals(2147483646, min1);

        minStack.pop();

        int min2 = minStack.getMin();
        Assertions.assertEquals(2147483646, min2);

        minStack.pop(); // empty

        minStack.push(2147483647);

        int top2 = minStack.top();
        Assertions.assertEquals(2147483647, top2);

        int min3 = minStack.getMin();
        Assertions.assertEquals(2147483647, min3);

        minStack.push(-2147483648);

        int top3 = minStack.top();
        Assertions.assertEquals(-2147483648, top3);

        int min4 = minStack.getMin();
        Assertions.assertEquals(-2147483648, min4);

        minStack.pop();

        int min5 = minStack.getMin();
        Assertions.assertEquals(2147483647, min5);
    }


}
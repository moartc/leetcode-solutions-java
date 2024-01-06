package solutions.algorithms._0_999._225_Implement_Stack_using_Queues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._225_Implement_Stack_using_Queues.MyStack;

class MyStackTest {

    private MyStack myStack;

    @BeforeEach
    void setUp() {
        myStack = new MyStack();
    }

    @Test
    void stackTest() {
        Assertions.assertTrue(myStack.empty());
        myStack.push(1);
        Assertions.assertFalse(myStack.empty());
        myStack.push(2);
        int top = myStack.top();
        Assertions.assertEquals(2, top);
        int pop = myStack.pop();
        Assertions.assertEquals(2, pop);
        Assertions.assertFalse(myStack.empty());
    }
}
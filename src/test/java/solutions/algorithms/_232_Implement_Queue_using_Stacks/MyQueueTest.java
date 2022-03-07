package solutions.algorithms._232_Implement_Queue_using_Stacks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyQueueTest {

    MyQueue myQueue = new MyQueue();

    @BeforeEach
    void setUp() {
        myQueue = new MyQueue();
    }

    @Test
    void test1() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        Assertions.assertEquals(1,myQueue.peek());
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        Assertions.assertEquals(1,myQueue.peek());
        myQueue.peek(); // return 1
        myQueue.pop(); // return 1, queue is [2]
        Assertions.assertEquals(2,myQueue.peek());
        myQueue.empty(); // return false
        Assertions.assertFalse(myQueue.empty());
    }

}
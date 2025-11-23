package solutions.algorithms._0_999._622_Design_Circular_Queue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MyCircularQueueTest {

    @Test
    void test1() {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        boolean b1 = myCircularQueue.enQueue(1);    // return True
        boolean b2 = myCircularQueue.enQueue(2);    // return True
        boolean b3 = myCircularQueue.enQueue(3);    // return True
        boolean b4 = myCircularQueue.enQueue(4);    // return False
        int rear1 = myCircularQueue.Rear();               // return 3
        boolean full1 = myCircularQueue.isFull();         // return True
        boolean b5 = myCircularQueue.deQueue();           // return True
        boolean b6 = myCircularQueue.enQueue(4);    // return True
        int rear2 = myCircularQueue.Rear();               // return 4

        Assertions.assertThat(b1).isTrue();
        Assertions.assertThat(b2).isTrue();
        Assertions.assertThat(b3).isTrue();
        Assertions.assertThat(b4).isFalse();
        Assertions.assertThat(rear1).isEqualTo(3);
        Assertions.assertThat(full1).isTrue();
        Assertions.assertThat(b5).isTrue();
        Assertions.assertThat(b6).isTrue();
        Assertions.assertThat(rear2).isEqualTo(4);
    }

    @Test
    void test2() {
        MyCircularQueue myCircularQueue = new MyCircularQueue(8);
        boolean b1 = myCircularQueue.enQueue(3);// true
        boolean b2 = myCircularQueue.enQueue(9);// true
        boolean b3 = myCircularQueue.enQueue(5);// true
        boolean b4 = myCircularQueue.enQueue(0);// true
        boolean b5 = myCircularQueue.deQueue();// true
        boolean b6 = myCircularQueue.deQueue();// true
        boolean empty1 = myCircularQueue.isEmpty();// false
        boolean empty2 = myCircularQueue.isEmpty();// false
        int rear1 = myCircularQueue.Rear();// 0
        int rear2 = myCircularQueue.Rear();// 0
        boolean b7 = myCircularQueue.deQueue();// true

        Assertions.assertThat(b1).isTrue();
        Assertions.assertThat(b2).isTrue();
        Assertions.assertThat(b3).isTrue();
        Assertions.assertThat(b4).isTrue();
        Assertions.assertThat(b5).isTrue();
        Assertions.assertThat(b6).isTrue();
        Assertions.assertThat(empty1).isFalse();
        Assertions.assertThat(empty2).isFalse();
        Assertions.assertThat(rear1).isEqualTo(0);
        Assertions.assertThat(rear2).isEqualTo(0);
        Assertions.assertThat(b7).isTrue();
    }

    @Test
    void test3() {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        boolean b1 = myCircularQueue.enQueue(7);// true
        boolean b2 = myCircularQueue.deQueue();// true
        boolean b3 = myCircularQueue.deQueue();// false
        boolean b4 = myCircularQueue.enQueue(0);// true
        boolean b5 = myCircularQueue.deQueue();// true
        int rear1 = myCircularQueue.Rear();  // -1

        Assertions.assertThat(b1).isTrue();
        Assertions.assertThat(b2).isTrue();
        Assertions.assertThat(b3).isFalse();
        Assertions.assertThat(b4).isTrue();
        Assertions.assertThat(b5).isTrue();
        Assertions.assertThat(rear1).isEqualTo(-1);
    }
}
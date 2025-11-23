package solutions.algorithms._0_999._622_Design_Circular_Queue;

import java.util.Arrays;

class MyCircularQueue {

    /*
    If I cannot use a list then I will use an array
    It looks like I have to track the beginning and the end of the queue

    So when I insert a new element, I check whether there is still space
    if so, I insert it after the element the end pointer refers to.
    The only non-standard case is, that when I am at the end of the
    array - then I can insert it at the beginning (as long as there's space there,
    which is possible, if an element was removed from the front of the queue).
     */

    int[] arr;
    int front;
    int rear;
    int size;

    public MyCircularQueue(int k) {
        arr = new int[k];
        // mark empty indices with -1, the constraint says: 1 <= k <= 1000
        Arrays.fill(arr, -1);
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (size < arr.length) {
            if (size == 0) {
                // the case where fron points to the same element as rear
                // don't move rear
            } else {
                rear = (rear + 1) % arr.length;
            }
            arr[rear] = value;
            size++;
            return true;
        } else {
            return false;
        }
    }

    public boolean deQueue() {
        if (size > 0) {
            arr[front] = -1;
            size--;
            if (front == arr.length - 1) {
                front = 0;
            } else if (front == rear) {
                // keep it as it is;
            } else {
                front++;
            }
            return true;
        } else {
            return false;
        }
    }

    public int Front() {
        return arr[front];
    }

    public int Rear() {
        return arr[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
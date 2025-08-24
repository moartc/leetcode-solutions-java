package solutions.algorithms._0_999._295_Find_Median_from_Data_Stream;

import java.util.Comparator;
import java.util.PriorityQueue;

class MedianFinder {

    /*
    I could 2 heaps one max and one min
    keep them equal, fex:
    3   4
    2   5
    1   6

    I get 3 and 4 and that's my median
    In the case of "add" I add it to the heap based on the value from max heap
    I also 'balance' them when they are not equal (diff 2)
    f.ex, after adding 2 new greater (7 and 8)
    3   4
    2   5
    1   6
        7
        8
    I have to move 4 (poll from minHeap) to the left one (maxHeap), and I get:
    4   5
    3   6
    2   7
    1   8

     */

    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {

        // check maxHeap (so the lower half)
        Integer peek = maxHeap.peek();
        if (peek == null) {
            maxHeap.add(num);
        } else {
            if (num > peek) {
                minHeap.add(num);
            } else {
                maxHeap.add(num);
            }
        }
        if (minHeap.size() - maxHeap.size() == 2) {
            maxHeap.add(minHeap.poll());
        } else if (maxHeap.size() - minHeap.size() == 2) {
            minHeap.add(maxHeap.poll());
        }
    }

    public double findMedian() {
        int size = maxHeap.size() + minHeap.size();
        if (size % 2 == 0) {
            return (double) (maxHeap.peek() + minHeap.peek()) / 2;
        } else {
            if (maxHeap.size() > minHeap.size()) {
                return (double) maxHeap.peek();
            } else {
                return (double) minHeap.peek();
            }
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
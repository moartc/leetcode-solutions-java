package solutions.algorithms._0_999._295_Find_Median_from_Data_Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.PriorityQueue;

class MedianFinderTest {

    @Test
    void test1() {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(1);
        pq.add(8);
        pq.add(9);
        pq.add(2);
        pq.add(6);

        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);    // arr = [1]
        medianFinder.addNum(2);    // arr = [1, 2]
        double v1 = medianFinder.findMedian();// return 1.5 (i.e., (1 + 2) / 2)
        medianFinder.addNum(3);    // arr[1, 2, 3]
        double v2 = medianFinder.findMedian();// return 2.0
        Assertions.assertThat(v1).isEqualTo(1.5);
        Assertions.assertThat(v2).isEqualTo(2.0);
    }
}
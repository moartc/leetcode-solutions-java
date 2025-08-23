package solutions.algorithms._0_999._703_Kth_Largest_Element_in_a_Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class KthLargestTest {

    @Test
    void test1() {
        int[] nums = new int[]{4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(3, nums);
        int v1 = kthLargest.add(3);     // return 4
        int v2 = kthLargest.add(5);     // return 5
        int v3 = kthLargest.add(10);    // return 5
        int v4 = kthLargest.add(9);     // return 8
        int v5 = kthLargest.add(4);     // return 8

        Assertions.assertThat(v1).isEqualTo(4);
        Assertions.assertThat(v2).isEqualTo(5);
        Assertions.assertThat(v3).isEqualTo(5);
        Assertions.assertThat(v4).isEqualTo(8);
        Assertions.assertThat(v5).isEqualTo(8);
    }

    @Test
    void test2() {
        int[] nums = new int[]{7, 7, 7, 7, 8, 3};
        KthLargest kthLargest = new KthLargest(4, nums);
        int v1 = kthLargest.add(2);     // return 7
        int v2 = kthLargest.add(10);    // return 7
        int v3 = kthLargest.add(9);     // return 7
        int v4 = kthLargest.add(9);     // return 8

        Assertions.assertThat(v1).isEqualTo(7);
        Assertions.assertThat(v2).isEqualTo(7);
        Assertions.assertThat(v3).isEqualTo(7);
        Assertions.assertThat(v4).isEqualTo(8);
    }

    @Test
    void test3() {
        int[] nums = new int[]{};
        KthLargest kthLargest = new KthLargest(1, nums);
        int v1 = kthLargest.add(-3);    // return -3
        int v2 = kthLargest.add(-2);    // return -3
        int v3 = kthLargest.add(-4);    // return -2
        int v4 = kthLargest.add(0);     // return 0
        int v5 = kthLargest.add(4);     // return 4

        Assertions.assertThat(v1).isEqualTo(-3);
        Assertions.assertThat(v2).isEqualTo(-2);
        Assertions.assertThat(v3).isEqualTo(-2);
        Assertions.assertThat(v4).isEqualTo(0);
        Assertions.assertThat(v5).isEqualTo(4);
    }
}
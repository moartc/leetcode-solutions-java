package solutions.algorithms._3000_3999._3026_Maximum_Good_Subarray_Sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumSubarraySumTest1() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int k = 1;
        long actual = solution.maximumSubarraySum(arr, k);
        Assertions.assertThat(actual).isEqualTo(11);
    }

    @Test
    void maximumSubarraySumTest2() {
        int[] arr = new int[]{-1, 3, 2, 4, 5};
        int k = 3;
        long actual = solution.maximumSubarraySum(arr, k);
        Assertions.assertThat(actual).isEqualTo(11);
    }

    @Test
    void maximumSubarraySumTest3() {
        int[] arr = new int[]{-1, -2, -3, -4};
        int k = 2;
        long actual = solution.maximumSubarraySum(arr, k);
        Assertions.assertThat(actual).isEqualTo(-6);
    }

    @Test
    void maximumSubarraySumTest4() {
        int[] arr = new int[]{-1, 6};
        int k = 1;
        long actual = solution.maximumSubarraySum(arr, k);
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    void maximumSubarraySumTest5() {
        int[] arr = new int[]{999999980, 999999981, 999999982, 999999983, 999999984, 999999985, 999999986, 999999987, 999999988, 999999989, 999999990, 999999991, 999999992, 999999993, 999999994, 999999995, 999999996, 999999997, 999999998, 999999999};
        int k = 18;
        long actual = solution.maximumSubarraySum(arr, k);
        Assertions.assertThat(actual).isEqualTo(18999999810L);
    }

    @Test
    void maximumSubarraySumTest6() {
        int[] arr = new int[]{3, 3, 2};
        int k = 1;
        long actual = solution.maximumSubarraySum(arr, k);
        Assertions.assertThat(actual).isEqualTo(8);
    }

}
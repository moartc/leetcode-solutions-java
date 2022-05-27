package solutions.algorithms._713_Subarray_Product_Less_Than_K;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numSubarrayProductLessThanK_Test1() {
        int[] nums = new int[]{10, 5, 2, 6};
        int k = 100;
        int expected = 8;
        Assertions.assertThat(solution.numSubarrayProductLessThanK(nums, k)).isEqualTo(expected);
    }

    @Test
    void numSubarrayProductLessThanK_Test2() {
        int[] nums = new int[]{1, 2, 3};
        int k = 0;
        int expected = 0;
        Assertions.assertThat(solution.numSubarrayProductLessThanK(nums, k)).isEqualTo(expected);
    }

    @Test
    void numSubarrayProductLessThanK_Test3() {
        int[] nums = new int[]{1};
        int k = 0;
        int expected = 0;
        Assertions.assertThat(solution.numSubarrayProductLessThanK(nums, k)).isEqualTo(expected);
    }

    @Test
    void numSubarrayProductLessThanK_Test4() {
        int[] nums = new int[]{1};
        int k = 11;
        int expected = 1;
        Assertions.assertThat(solution.numSubarrayProductLessThanK(nums, k)).isEqualTo(expected);
    }

    @Test
    void numSubarrayProductLessThanK_Test5() {
        int[] nums = new int[]{10, 10};
        int k = 100;
        int expected = 2;
        Assertions.assertThat(solution.numSubarrayProductLessThanK(nums, k)).isEqualTo(expected);
    }

    @Test
    void numSubarrayProductLessThanK_Test6() {
        int[] nums = new int[]{10, 20, 1212, 555};
        int k = 100;
        int expected = 2;
        Assertions.assertThat(solution.numSubarrayProductLessThanK(nums, k)).isEqualTo(expected);
    }

    @Test
    void numSubarrayProductLessThanK_Test7() {
        int[] nums = new int[]{10, 9, 10, 4, 3, 8, 3, 3, 6, 2, 10, 10, 9, 3};
        int k = 19;
        int expected = 18;
        Assertions.assertThat(solution.numSubarrayProductLessThanK(nums, k)).isEqualTo(expected);
    }
}
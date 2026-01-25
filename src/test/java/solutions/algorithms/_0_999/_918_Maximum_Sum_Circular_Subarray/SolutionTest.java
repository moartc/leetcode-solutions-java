package solutions.algorithms._0_999._918_Maximum_Sum_Circular_Subarray;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxSubarraySumCircular1() {
        int[] nums = new int[]{1, -2, 3, -2};
        int answer = solution.maxSubarraySumCircular(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void maxSubarraySumCircular2() {
        int[] nums = new int[]{5, -3, 5};
        int answer = solution.maxSubarraySumCircular(nums);
        Assertions.assertThat(answer).isEqualTo(10);
    }

    @Test
    void maxSubarraySumCircular3() {
        int[] nums = new int[]{-3, -2, -3};
        int answer = solution.maxSubarraySumCircular(nums);
        Assertions.assertThat(answer).isEqualTo(-2);
    }

    @Test
    void maxSubarraySumCircular4() {
        int[] nums = new int[]{9, -4, -7, 9};
        int answer = solution.maxSubarraySumCircular(nums);
        Assertions.assertThat(answer).isEqualTo(18);
    }
}
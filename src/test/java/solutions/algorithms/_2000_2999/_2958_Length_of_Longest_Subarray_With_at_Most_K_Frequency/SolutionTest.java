package solutions.algorithms._2000_2999._2958_Length_of_Longest_Subarray_With_at_Most_K_Frequency;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxSubarrayLength1() {
        int[] nums = new int[]{1, 2, 3, 1, 2, 3, 1, 2};
        int k = 2;
        int answer = solution.maxSubarrayLength(nums, k);
        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void maxSubarrayLength2() {
        int[] nums = new int[]{1, 2, 1, 2, 1, 2, 1, 2};
        int k = 1;
        int answer = solution.maxSubarrayLength(nums, k);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void maxSubarrayLength3() {
        int[] nums = new int[]{5, 5, 5, 5, 5, 5, 5};
        int k = 4;
        int answer = solution.maxSubarrayLength(nums, k);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maxSubarrayLength4() {
        int[] nums = new int[]{8, 8};
        int k = 1;
        int answer = solution.maxSubarrayLength(nums, k);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void maxSubarrayLength5() {
        int[] nums = new int[]{1, 4, 4, 3};
        int k = 1;
        int answer = solution.maxSubarrayLength(nums, k);
        Assertions.assertThat(answer).isEqualTo(2);
    }

}
package solutions.algorithms._0_999._689_Maximum_Sum_of_3_Non_Overlapping_Subarrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxSumOfThreeSubarrays1() {
        int[] nums = new int[]{1, 2, 1, 2, 6, 7, 5, 1};
        int k = 2;
        int[] answer = solution.maxSumOfThreeSubarrays(nums, k);
        Assertions.assertThat(answer).containsExactly(0, 3, 5);
    }

    @Test
    void maxSumOfThreeSubarrays2() {
        int[] nums = new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1};
        int k = 2;
        int[] answer = solution.maxSumOfThreeSubarrays(nums, k);
        Assertions.assertThat(answer).containsExactly(0, 2, 4);
    }

}
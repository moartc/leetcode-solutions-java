package solutions.algorithms._3000_3999._3105_Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestMonotonicSubarray1() {
        int[] nums = new int[]{1, 4, 3, 3, 2};
        int answer = solution.longestMonotonicSubarray(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void longestMonotonicSubarray2() {
        int[] nums = new int[]{3, 3, 3, 3};
        int answer = solution.longestMonotonicSubarray(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void longestMonotonicSubarray3() {
        int[] nums = new int[]{3, 2, 1};
        int answer = solution.longestMonotonicSubarray(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}
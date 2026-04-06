package solutions.algorithms._3000_3999._3719_Longest_Balanced_Subarray_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestBalanced1() {
        int[] nums = new int[]{2, 5, 4, 3};
        int answer = solution.longestBalanced(nums);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void longestBalanced2() {
        int[] nums = new int[]{3, 2, 2, 5, 4};
        int answer = solution.longestBalanced(nums);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void longestBalanced3() {
        int[] nums = new int[]{1, 2, 3, 2};
        int answer = solution.longestBalanced(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}
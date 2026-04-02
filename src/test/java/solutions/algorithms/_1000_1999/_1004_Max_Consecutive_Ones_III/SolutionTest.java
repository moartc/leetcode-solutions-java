package solutions.algorithms._1000_1999._1004_Max_Consecutive_Ones_III;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestOnes1() {
        int[] nums = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int answer = solution.longestOnes(nums, k);
        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void longestOnes2() {
        int[] nums = new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        int answer = solution.longestOnes(nums, k);
        Assertions.assertThat(answer).isEqualTo(10);
    }
}
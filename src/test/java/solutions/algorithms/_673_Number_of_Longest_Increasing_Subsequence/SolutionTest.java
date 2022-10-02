package solutions.algorithms._673_Number_of_Longest_Increasing_Subsequence;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findNumberOfLISTest1() {
        int[] nums = new int[]{1, 3, 5, 4, 7};
        int actual = solution.findNumberOfLIS(nums);
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    void findNumberOfLISTest2() {
        int[] nums = new int[]{2, 2, 2, 2, 2};
        int actual = solution.findNumberOfLIS(nums);
        Assertions.assertThat(actual).isEqualTo(5);
    }

    @Test
    void findNumberOfLISTest3() {
        int[] nums = new int[]{0, 5, 6, 4, 5, 2, 3};
        int actual = solution.findNumberOfLIS(nums);
        // 0, 5, 6
        // 0, 4, 5
        // 0, 2, 3
        Assertions.assertThat(actual).isEqualTo(3);
    }
}
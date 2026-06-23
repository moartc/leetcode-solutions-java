package solutions.algorithms._1000_1999._1984_Minimum_Difference_Between_Highest_and_Lowest_of_K_Scores;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumDifference1() {
        int[] nums = new int[]{90};
        int k = 1;
        int answer = solution.minimumDifference(nums, k);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void minimumDifference2() {
        int[] nums = new int[]{9, 4, 1, 7};
        int k = 2;
        int answer = solution.minimumDifference(nums, k);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}
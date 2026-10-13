package solutions.algorithms._3000_3999._3727_Maximum_Alternating_Sum_of_Squares;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxAlternatingSum1() {
        int[] nums = new int[]{1, 2, 3};
        long answer = solution.maxAlternatingSum(nums);
        Assertions.assertThat(answer).isEqualTo(12);
    }

    @Test
    void maxAlternatingSum2() {
        int[] nums = new int[]{1, -1, 2, -2, 3, -3};
        long answer = solution.maxAlternatingSum(nums);
        Assertions.assertThat(answer).isEqualTo(16);
    }
}
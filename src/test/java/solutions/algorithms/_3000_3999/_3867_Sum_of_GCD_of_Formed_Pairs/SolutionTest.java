package solutions.algorithms._3000_3999._3867_Sum_of_GCD_of_Formed_Pairs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void gcdSum1() {
        int[] nums = new int[]{2, 6, 4};
        long answer = solution.gcdSum(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void gcdSum2() {
        int[] nums = new int[]{3, 6, 2, 8};
        long answer = solution.gcdSum(nums);
        Assertions.assertThat(answer).isEqualTo(5);
    }
}
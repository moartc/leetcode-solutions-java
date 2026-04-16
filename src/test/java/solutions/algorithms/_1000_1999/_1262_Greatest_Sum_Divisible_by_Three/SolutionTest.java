package solutions.algorithms._1000_1999._1262_Greatest_Sum_Divisible_by_Three;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxSumDivThree1() {
        int[] nums = new int[]{3, 6, 5, 1, 8};
        int answer = solution.maxSumDivThree(nums);
        Assertions.assertThat(answer).isEqualTo(18);
    }

    @Test
    void maxSumDivThree2() {
        int[] nums = new int[]{4};
        int answer = solution.maxSumDivThree(nums);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void maxSumDivThree3() {
        int[] nums = new int[]{1, 2, 3, 4, 4};
        int answer = solution.maxSumDivThree(nums);
        Assertions.assertThat(answer).isEqualTo(12);
    }
}
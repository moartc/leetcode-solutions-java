package solutions.algorithms._1000_1999._1863_Sum_of_All_Subset_XOR_Totals;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void subsetXORSum1() {
        int[] nums = new int[]{1, 3};
        int answer = solution.subsetXORSum(nums);
        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void subsetXORSum2() {
        int[] nums = new int[]{5, 1, 6};
        int answer = solution.subsetXORSum(nums);
        Assertions.assertThat(answer).isEqualTo(28);
    }

    @Test
    void subsetXORSum3() {
        int[] nums = new int[]{3, 4, 5, 6, 7, 8};
        int answer = solution.subsetXORSum(nums);
        Assertions.assertThat(answer).isEqualTo(480);
    }

}
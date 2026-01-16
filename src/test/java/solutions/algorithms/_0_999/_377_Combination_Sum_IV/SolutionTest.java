package solutions.algorithms._0_999._377_Combination_Sum_IV;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void combinationSum41() {
        int[] nums = new int[]{1, 2, 3};
        int target = 4;
        int answer = solution.combinationSum4(nums, target);
        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void combinationSum42() {
        int[] nums = new int[]{9};
        int target = 3;
        int answer = solution.combinationSum4(nums, target);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void combinationSum43() {
        int[] nums = new int[]{2, 1, 3};
        int target = 35;
        int answer = solution.combinationSum4(nums, target);
        Assertions.assertThat(answer).isEqualTo(1132436852);
    }
}
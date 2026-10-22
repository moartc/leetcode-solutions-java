package solutions.algorithms._3000_3999._3942_Minimum_Operations_to_Sort_a_Permutation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minOperations1() {
        int[] nums = new int[]{0, 2, 1};
        int answer = solution.minOperations(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minOperations2() {
        int[] nums = new int[]{1, 0, 2};
        int answer = solution.minOperations(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minOperations3() {
        int[] nums = new int[]{2, 0, 1, 3};
        int answer = solution.minOperations(nums);
        Assertions.assertThat(answer).isEqualTo(-1);
    }
}
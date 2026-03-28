package solutions.algorithms._0_999._31_Next_Permutation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void nextPermutation1() {
        int[] nums = new int[]{1, 2, 3};
        solution.nextPermutation(nums);
        Assertions.assertThat(nums).containsExactly(1, 3, 2);
    }

    @Test
    void nextPermutation2() {
        int[] nums = new int[]{3, 2, 1};
        solution.nextPermutation(nums);
        Assertions.assertThat(nums).containsExactly(1, 2, 3);
    }

    @Test
    void nextPermutation3() {
        int[] nums = new int[]{1, 1, 5};
        solution.nextPermutation(nums);
        Assertions.assertThat(nums).containsExactly(1, 5, 1);
    }
}
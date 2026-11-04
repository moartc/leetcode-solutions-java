package solutions.algorithms._3000_3999._3505_Minimum_Operations_to_Make_Elements_Within_K_Subarrays_Equal;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minOperations1() {
        int[] nums = new int[]{5, -2, 1, 3, 7, 3, 6, 4, -1};
        int x = 3;
        int k = 2;
        long answer = solution.minOperations(nums, x, k);
        Assertions.assertThat(answer).isEqualTo(8);
    }

    @Test
    void minOperations2() {
        int[] nums = new int[]{9, -2, -2, -2, 1, 5};
        int x = 2;
        int k = 2;
        long answer = solution.minOperations(nums, x, k);
        Assertions.assertThat(answer).isEqualTo(3);
    }

}
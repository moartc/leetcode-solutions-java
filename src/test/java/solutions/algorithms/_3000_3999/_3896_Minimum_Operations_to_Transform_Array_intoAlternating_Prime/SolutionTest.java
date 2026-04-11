package solutions.algorithms._3000_3999._3896_Minimum_Operations_to_Transform_Array_intoAlternating_Prime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minOperations1() {
        int[] nums = new int[]{1, 2, 3, 4};
        int answer = solution.minOperations(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void minOperations2() {
        int[] nums = new int[]{5, 6, 7, 8};
        int answer = solution.minOperations(nums);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void minOperations3() {
        int[] nums = new int[]{4, 4};
        int answer = solution.minOperations(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}
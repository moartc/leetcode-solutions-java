package solutions.algorithms._0_999._209_Minimum_Size_Subarray_Sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minSubArrayLenTest1() {
        int target = 7;
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        Assertions.assertThat(solution.minSubArrayLen(target, nums)).isEqualTo(2);
    }

    @Test
    void minSubArrayLenTest2() {
        int target = 4;
        int[] nums = new int[]{1, 4, 4};
        Assertions.assertThat(solution.minSubArrayLen(target, nums)).isOne();
    }

    @Test
    void minSubArrayLenTest3() {
        int target = 11;
        int[] nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        Assertions.assertThat(solution.minSubArrayLen(target, nums)).isZero();
    }

    @Test
    void minSubArrayLenTest4() {
        int target = 21;
        int[] nums = new int[]{1};
        Assertions.assertThat(solution.minSubArrayLen(target, nums)).isZero();
    }

    @Test
    void minSubArrayLenTest5() {
        int target = 1;
        int[] nums = new int[]{1};
        Assertions.assertThat(solution.minSubArrayLen(target, nums)).isOne();
    }
}
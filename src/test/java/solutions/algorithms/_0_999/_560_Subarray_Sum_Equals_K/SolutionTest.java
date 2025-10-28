package solutions.algorithms._0_999._560_Subarray_Sum_Equals_K;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void subarraySum1() {
        int[] nums = new int[]{1, 1, 1};
        int k = 2;
        int answer = solution.subarraySum(nums, k);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void subarraySum2() {
        int[] nums = new int[]{1, 2, 3};
        int k = 3;
        int answer = solution.subarraySum(nums, k);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void subarraySum3() {
        int[] nums = new int[]{1};
        int k = 1;
        int answer = solution.subarraySum(nums, k);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void subarraySum4() {
        int[] nums = new int[]{1};
        int k = 0;
        int answer = solution.subarraySum(nums, k);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}
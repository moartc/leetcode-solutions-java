package solutions.algorithms._3000_3999._3689_Maximum_Total_Subarray_Value_I;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxTotalValue1() {
        int[] nums = new int[]{1, 3, 2};
        int k = 2;
        long answer = solution.maxTotalValue(nums, k);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maxTotalValue2() {
        int[] nums = new int[]{4, 2, 5, 1};
        int k = 3;
        long answer = solution.maxTotalValue(nums, k);
        Assertions.assertThat(answer).isEqualTo(12);
    }
}
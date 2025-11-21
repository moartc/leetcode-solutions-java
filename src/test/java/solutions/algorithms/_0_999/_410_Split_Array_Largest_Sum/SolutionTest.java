package solutions.algorithms._0_999._410_Split_Array_Largest_Sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void splitArray1() {
        int[] nums = new int[]{7, 2, 5, 10, 8};
        int k = 2;
        int answer = solution.splitArray(nums, k);
        Assertions.assertThat(answer).isEqualTo(18);
    }

    @Test
    void splitArray2() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int k = 2;
        int answer = solution.splitArray(nums, k);
        Assertions.assertThat(answer).isEqualTo(9);
    }

    @Test
    void splitArray3() {
        int[] nums = new int[]{1, 4,4};
        int k = 3;
        int answer = solution.splitArray(nums, k);
        Assertions.assertThat(answer).isEqualTo(4);
    }

}
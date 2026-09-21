package solutions.algorithms._3000_3999._3524_Find_X_Value_of_Array_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void resultArray1() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int k = 3;
        long[] answer = solution.resultArray(nums, k);
        Assertions.assertThat(answer).containsExactly(9, 2, 4);
    }

    @Test
    void resultArray2() {
        int[] nums = new int[]{1, 2, 4, 8, 16, 32};
        int k = 4;
        long[] answer = solution.resultArray(nums, k);
        Assertions.assertThat(answer).containsExactly(18, 1, 2, 0);
    }

    @Test
    void resultArray3() {
        int[] nums = new int[]{1, 1, 2, 1, 1};
        int k = 2;
        long[] answer = solution.resultArray(nums, k);
        Assertions.assertThat(answer).containsExactly(9, 6);
    }
}
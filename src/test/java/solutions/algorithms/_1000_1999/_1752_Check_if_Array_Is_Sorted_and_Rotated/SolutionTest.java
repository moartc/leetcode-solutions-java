package solutions.algorithms._1000_1999._1752_Check_if_Array_Is_Sorted_and_Rotated;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void check1() {
        int[] nums = new int[]{3, 4, 5, 1, 2};
        boolean answer = solution.check(nums);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void check2() {
        int[] nums = new int[]{2, 1, 3, 4};
        boolean answer = solution.check(nums);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void check3() {
        int[] nums = new int[]{1, 2, 3};
        boolean answer = solution.check(nums);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void check4() {
        int[] nums = new int[]{2, 1};
        boolean answer = solution.check(nums);
        Assertions.assertThat(answer).isTrue();
    }
}
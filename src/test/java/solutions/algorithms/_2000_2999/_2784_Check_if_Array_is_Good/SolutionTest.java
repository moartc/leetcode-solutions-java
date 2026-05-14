package solutions.algorithms._2000_2999._2784_Check_if_Array_is_Good;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isGood1() {
        int[] nums = new int[]{2, 1, 3};
        boolean answer = solution.isGood(nums);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isGood2() {
        int[] nums = new int[]{1, 3, 3, 2};
        boolean answer = solution.isGood(nums);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isGood3() {
        int[] nums = new int[]{1, 1};
        boolean answer = solution.isGood(nums);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isGood4() {
        int[] nums = new int[]{3, 4, 4, 1, 2, 1};
        boolean answer = solution.isGood(nums);
        Assertions.assertThat(answer).isFalse();
    }
}
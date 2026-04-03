package solutions.algorithms._3000_3999._3637_Trionic_Array_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isTrionic1() {
        int[] nums = new int[]{1, 3, 5, 4, 2, 6};
        boolean answer = solution.isTrionic(nums);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isTrionic2() {
        int[] nums = new int[]{2, 1, 3};
        boolean answer = solution.isTrionic(nums);
        Assertions.assertThat(answer).isFalse();
    }
}
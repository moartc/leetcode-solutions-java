package solutions.algorithms._3000_3999._3875_Construct_Uniform_Parity_Array_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void uniformArray1() {
        int[] nums = new int[]{2, 3};
        boolean answer = solution.uniformArray(nums);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void uniformArray2() {
        int[] nums = new int[]{4, 6};
        boolean answer = solution.uniformArray(nums);
        Assertions.assertThat(answer).isTrue();
    }
}
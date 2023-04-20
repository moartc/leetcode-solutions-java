package solutions.algorithms._238_Product_of_Array_Except_Self;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void productExceptSelfTest1() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{24, 12, 8, 6};
        int[] actual = solution.productExceptSelf(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void productExceptSelfTest2() {
        int[] nums = new int[]{-1, 1, 0, -3, 3};
        int[] expected = new int[]{0, 0, 9, 0, 0};
        int[] actual = solution.productExceptSelf(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
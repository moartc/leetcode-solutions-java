package solutions.algorithms._0_999._896_Monotonic_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._896_Monotonic_Array.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isMonotonicTest1() {
        int[] nums = new int[]{1, 2, 2, 3};
        boolean actual = solution.isMonotonic(nums);
        Assertions.assertThat(actual).isEqualTo(true);
    }

    @Test
    void isMonotonicTest2() {
        int[] nums = new int[]{6, 5, 4, 4};
        boolean actual = solution.isMonotonic(nums);
        Assertions.assertThat(actual).isEqualTo(true);
    }

    @Test
    void isMonotonicTest3() {
        int[] nums = new int[]{1, 3, 2};
        boolean actual = solution.isMonotonic(nums);
        Assertions.assertThat(actual).isEqualTo(false);
    }

    @Test
    void isMonotonicTest4() {
        int[] nums = new int[]{3};
        boolean actual = solution.isMonotonic(nums);
        Assertions.assertThat(actual).isEqualTo(true);
    }

    @Test
    void isMonotonicTest5() {
        int[] nums = new int[]{3, 3, 3, 3};
        boolean actual = solution.isMonotonic(nums);
        Assertions.assertThat(actual).isEqualTo(true);
    }

    @Test
    void isMonotonicTest6() {
        int[] nums = new int[]{3, 4, 4, 4, 4};
        boolean actual = solution.isMonotonic(nums);
        Assertions.assertThat(actual).isEqualTo(true);
    }

    @Test
    void isMonotonicTest7() {
        int[] nums = new int[]{5, 3, 2, 4, 1};
        boolean actual = solution.isMonotonic(nums);
        Assertions.assertThat(actual).isEqualTo(false);
    }
}
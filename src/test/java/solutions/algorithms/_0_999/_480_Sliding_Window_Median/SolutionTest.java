package solutions.algorithms._0_999._480_Sliding_Window_Median;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void medianSlidingWindow1() {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        double[] answer = solution.medianSlidingWindow(nums, k);
        Assertions.assertThat(answer).containsExactly(1.00000, -1.00000, -1.00000, 3.00000, 5.00000, 6.00000);
    }

    @Test
    void medianSlidingWindow2() {
        int[] nums = new int[]{1, 2, 3, 4, 2, 3, 1, 4, 2};
        int k = 3;
        double[] answer = solution.medianSlidingWindow(nums, k);
        Assertions.assertThat(answer).containsExactly(2.00000, 3.00000, 3.00000, 3.00000, 2.00000, 3.00000, 2.00000);
    }
}
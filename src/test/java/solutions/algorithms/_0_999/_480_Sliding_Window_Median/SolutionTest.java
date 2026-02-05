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

    @Test
    void medianSlidingWindow3() {
        int[] nums = new int[]{1, 4, 2, 3};
        int k = 4;
        double[] answer = solution.medianSlidingWindow(nums, k);
        Assertions.assertThat(answer).containsExactly(2.50000);
    }

    @Test
    void medianSlidingWindow4() {
        int[] nums = new int[]{2147483647, 2147483647};
        int k = 2;
        double[] answer = solution.medianSlidingWindow(nums, k);
        Assertions.assertThat(answer).containsExactly(2147483647.00000);
    }

    @Test
    void medianSlidingWindow5() {
        int[] nums = new int[]{1, 1, 3, 2, 0, 0};
        int k = 3;
        double[] answer = solution.medianSlidingWindow(nums, k);
        Assertions.assertThat(answer).containsExactly(1.00000, 2.00000, 2.00000, 0.00000);
    }

    @Test
    void medianSlidingWindow6() {
        int[] nums = new int[]{2147483647, 1, 2, 3, 4, 5, 6, 7, 2147483647};
        int k = 2;
        double[] answer = solution.medianSlidingWindow(nums, k);
        Assertions.assertThat(answer).containsExactly(1.073741824E9, 1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 1.073741827E9);
    }

    @Test
    void medianSlidingWindow7() {
        int[] nums = new int[]{9, 7, 0, 3, 9, 8, 6, 5, 7, 6};
        int k = 2;
        double[] answer = solution.medianSlidingWindow(nums, k);
        Assertions.assertThat(answer).containsExactly(8.00000, 3.50000, 1.50000, 6.00000, 8.50000, 7.00000, 5.50000, 6.00000, 6.50000);
    }

    @Test
    void medianSlidingWindow8() {
        int[] nums = new int[]{5, 5, 8, 1, 4, 7, 1, 3, 8, 4};
        int k = 8;
        double[] answer = solution.medianSlidingWindow(nums, k);
        Assertions.assertThat(answer).containsExactly(4.50000, 4.50000, 4.00000);
    }


}
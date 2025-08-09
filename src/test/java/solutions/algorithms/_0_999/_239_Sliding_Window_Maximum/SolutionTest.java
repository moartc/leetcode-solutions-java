package solutions.algorithms._0_999._239_Sliding_Window_Maximum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxSlidingWindowTest1() {

        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] expected = new int[]{3, 3, 5, 5, 6, 7};
        int[] answer = solution.maxSlidingWindow(nums, k);
        Assertions.assertThat(answer).isEqualTo(expected);
    }

    @Test
    void maxSlidingWindowTest2() {

        int[] nums = new int[]{1};
        int k = 1;
        int[] expected = new int[]{1};
        int[] answer = solution.maxSlidingWindow(nums, k);
        Assertions.assertThat(answer).isEqualTo(expected);
    }

    @Test
    void maxSlidingWindowTest3() {

        int[] nums = new int[]{1, -1};
        int k = 1;
        int[] expected = new int[]{1, -1};
        int[] answer = solution.maxSlidingWindow(nums, k);
        Assertions.assertThat(answer).isEqualTo(expected);
    }

    @Test
    void maxSlidingWindowTest4() {

        int[] nums = new int[]{-7, -8, 7, 5, 7, 1, 6, 0};
        int k = 4;
        int[] expected = new int[]{7, 7, 7, 7, 7};
        int[] answer = solution.maxSlidingWindow(nums, k);
        Assertions.assertThat(answer).isEqualTo(expected);
    }

}
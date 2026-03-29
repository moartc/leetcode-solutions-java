package solutions.algorithms._1000_1999._1480_Running_Sum_of_1d_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void runningSum1() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] answer = solution.runningSum(nums);
        Assertions.assertThat(answer).containsExactly(1, 3, 6, 10);
    }

    @Test
    void runningSum2() {
        int[] nums = new int[]{1, 1, 1, 1, 1};
        int[] answer = solution.runningSum(nums);
        Assertions.assertThat(answer).containsExactly(1, 2, 3, 4, 5);
    }

    @Test
    void runningSum3() {
        int[] nums = new int[]{3, 1, 2, 10, 1};
        int[] answer = solution.runningSum(nums);
        Assertions.assertThat(answer).containsExactly(3, 4, 6, 16, 17);
    }
}
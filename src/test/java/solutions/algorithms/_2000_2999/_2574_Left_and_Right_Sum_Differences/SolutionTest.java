package solutions.algorithms._2000_2999._2574_Left_and_Right_Sum_Differences;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void leftRightDifference1() {
        int[] nums = new int[]{10, 4, 8, 3};
        int[] answer = solution.leftRightDifference(nums);
        Assertions.assertThat(answer).containsExactly(15, 1, 11, 22);
    }

    @Test
    void leftRightDifference2() {
        int[] nums = new int[]{1};
        int[] answer = solution.leftRightDifference(nums);
        Assertions.assertThat(answer).containsExactly(0);
    }
}
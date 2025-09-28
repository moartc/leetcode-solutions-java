package solutions.algorithms._0_999._494_Target_Sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findTargetSumWays1() {
        int[] nums = new int[]{1, 1, 1, 1, 1};
        int target = 3;
        int answer = solution.findTargetSumWays(nums, target);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void findTargetSumWays2() {
        int[] nums = new int[]{1};
        int target = 1;
        int answer = solution.findTargetSumWays(nums, target);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void findTargetSumWays3() {
        int[] nums = new int[]{2, 20, 24, 38, 44, 21, 45, 48, 30, 48, 14, 9, 21, 10, 46, 46, 12, 48, 12, 38};
        int target = 48;
        int answer = solution.findTargetSumWays(nums, target);
        Assertions.assertThat(answer).isEqualTo(5401);
    }

}
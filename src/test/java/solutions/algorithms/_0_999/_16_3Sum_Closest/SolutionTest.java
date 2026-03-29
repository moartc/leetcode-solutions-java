package solutions.algorithms._0_999._16_3Sum_Closest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void threeSumClosest1() {
        int[] nums = new int[]{-1, 2, 1, -4};
        int target = 1;
        int answer = solution.threeSumClosest(nums, target);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void threeSumClosest2() {
        int[] nums = new int[]{0, 0, 0};
        int target = 1;
        int answer = solution.threeSumClosest(nums, target);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}
package solutions.algorithms._2000_2999._2770_Maximum_Number_of_Jumps_to_Reach_the_Last_Index;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumJumps1() {
        int[] nums = new int[]{1, 3, 6, 4, 1, 2};
        int target = 2;
        int answer = solution.maximumJumps(nums, target);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void maximumJumps2() {
        int[] nums = new int[]{1, 3, 6, 4, 1, 2};
        int target = 3;
        int answer = solution.maximumJumps(nums, target);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void maximumJumps3() {
        int[] nums = new int[]{1, 3, 6, 4, 1, 2};
        int target = 0;
        int answer = solution.maximumJumps(nums, target);
        Assertions.assertThat(answer).isEqualTo(-1);
    }
}
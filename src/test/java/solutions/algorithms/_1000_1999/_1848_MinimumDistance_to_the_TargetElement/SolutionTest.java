package solutions.algorithms._1000_1999._1848_MinimumDistance_to_the_TargetElement;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getMinDistance1() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int target = 5;
        int start = 3;
        int answer = solution.getMinDistance(nums, target, start);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void getMinDistance2() {
        int[] nums = new int[]{1};
        int target = 1;
        int start = 0;
        int answer = solution.getMinDistance(nums, target, start);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void getMinDistance3() {
        int[] nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int target = 1;
        int start = 0;
        int answer = solution.getMinDistance(nums, target, start);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}
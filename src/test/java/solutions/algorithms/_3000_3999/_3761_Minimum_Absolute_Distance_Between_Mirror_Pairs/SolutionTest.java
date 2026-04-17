package solutions.algorithms._3000_3999._3761_Minimum_Absolute_Distance_Between_Mirror_Pairs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minMirrorPairDistance1() {
        int[] nums = new int[]{12, 21, 45, 33, 54};
        int answer = solution.minMirrorPairDistance(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minMirrorPairDistance2() {
        int[] nums = new int[]{120, 21};
        int answer = solution.minMirrorPairDistance(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minMirrorPairDistance3() {
        int[] nums = new int[]{21, 120};
        int answer = solution.minMirrorPairDistance(nums);
        Assertions.assertThat(answer).isEqualTo(-1);
    }
}
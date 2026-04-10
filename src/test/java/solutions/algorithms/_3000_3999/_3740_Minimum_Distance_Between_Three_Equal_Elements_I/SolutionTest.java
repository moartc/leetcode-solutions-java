package solutions.algorithms._3000_3999._3740_Minimum_Distance_Between_Three_Equal_Elements_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumDistance1() {
        int[] nums = new int[]{1, 2, 1, 1, 3};
        int answer = solution.minimumDistance(nums);
        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void minimumDistance2() {
        int[] nums = new int[]{1, 1, 2, 3, 2, 1, 2};
        int answer = solution.minimumDistance(nums);
        Assertions.assertThat(answer).isEqualTo(8);
    }

    @Test
    void minimumDistance3() {
        int[] nums = new int[]{1};
        int answer = solution.minimumDistance(nums);
        Assertions.assertThat(answer).isEqualTo(-1);
    }
}
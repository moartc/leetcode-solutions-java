package solutions.algorithms._3000_3999._3550_Smallest_Index_With_Digit_Sum_Equal_to_Index;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void smallestIndex1() {
        int[] nums = new int[]{1, 3, 2};
        int answer = solution.smallestIndex(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void smallestIndex2() {
        int[] nums = new int[]{1, 10, 11};
        int answer = solution.smallestIndex(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void smallestIndex3() {
        int[] nums = new int[]{1, 2, 3};
        int answer = solution.smallestIndex(nums);
        Assertions.assertThat(answer).isEqualTo(-1);
    }
}
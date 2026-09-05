package solutions.algorithms._3000_3999._3904_Smallest_Stable_Index_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void firstStableIndex1() {
        int[] nums = new int[]{5, 0, 1, 4};
        int k = 3;
        int answer = solution.firstStableIndex(nums, k);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void firstStableIndex2() {
        int[] nums = new int[]{3, 2, 1};
        int k = 1;
        int answer = solution.firstStableIndex(nums, k);
        Assertions.assertThat(answer).isEqualTo(-1);
    }

    @Test
    void firstStableIndex3() {
        int[] nums = new int[]{0};
        int k = 0;
        int answer = solution.firstStableIndex(nums, k);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}
package solutions.algorithms._3000_3999._3934_Smallest_Unique_Subarray;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void smallestUniqueSubarray1() {
        int[] nums = new int[]{3, 3, 3};
        int answer = solution.smallestUniqueSubarray(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void smallestUniqueSubarray2() {
        int[] nums = new int[]{2, 1, 2, 3, 3};
        int answer = solution.smallestUniqueSubarray(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void smallestUniqueSubarray3() {
        int[] nums = new int[]{1, 1, 2, 2, 1};
        int answer = solution.smallestUniqueSubarray(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}
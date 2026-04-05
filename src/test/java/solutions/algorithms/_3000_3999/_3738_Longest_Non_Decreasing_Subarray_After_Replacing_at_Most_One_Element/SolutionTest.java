package solutions.algorithms._3000_3999._3738_Longest_Non_Decreasing_Subarray_After_Replacing_at_Most_One_Element;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestSubarray1() {
        int[] nums = new int[]{1, 2, 3, 1, 2};
        int answer = solution.longestSubarray(nums);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void longestSubarray2() {
        int[] nums = new int[]{2, 2, 2, 2, 2};
        int answer = solution.longestSubarray(nums);
        Assertions.assertThat(answer).isEqualTo(5);
    }

}
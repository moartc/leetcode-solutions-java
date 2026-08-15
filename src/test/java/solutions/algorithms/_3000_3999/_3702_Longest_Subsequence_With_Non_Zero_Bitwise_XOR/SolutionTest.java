package solutions.algorithms._3000_3999._3702_Longest_Subsequence_With_Non_Zero_Bitwise_XOR;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestSubsequence1() {
        int[] nums = new int[]{1, 2, 3};
        int answer = solution.longestSubsequence(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void longestSubsequence2() {
        int[] nums = new int[]{2, 3, 4};
        int answer = solution.longestSubsequence(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void longestSubsequence3() {
        int[] nums = new int[]{0, 7};
        int answer = solution.longestSubsequence(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void longestSubsequence4() {
        int[] nums = new int[]{1, 1};
        int answer = solution.longestSubsequence(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void longestSubsequence5() {
        int[] nums = new int[]{0, 0, 7, 0, 0, 0, 7, 0, 0};
        int answer = solution.longestSubsequence(nums);
        Assertions.assertThat(answer).isEqualTo(8);
    }

}
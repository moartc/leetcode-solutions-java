package solutions.algorithms._3000_3999._3895_Count_Digit_Appearances;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countDigitOccurrences1() {
        int[] nums = new int[]{12, 54, 32, 22};
        int digit = 2;
        int answer = solution.countDigitOccurrences(nums, digit);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void countDigitOccurrences2() {
        int[] nums = new int[]{1, 34, 7};
        int digit = 9;
        int answer = solution.countDigitOccurrences(nums, digit);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}
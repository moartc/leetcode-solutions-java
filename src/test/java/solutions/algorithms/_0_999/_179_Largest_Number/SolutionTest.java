package solutions.algorithms._0_999._179_Largest_Number;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void largestNumber1() {

        int[] nums = new int[]{10, 2};
        String answer = solution.largestNumber(nums);
        Assertions.assertThat(answer).isEqualTo("210");
    }

    @Test
    void largestNumber2() {

        int[] nums = new int[]{3, 30, 34, 5, 9};
        String answer = solution.largestNumber(nums);
        Assertions.assertThat(answer).isEqualTo("9534330");
    }
}
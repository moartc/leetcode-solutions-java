package solutions.algorithms._0_999._268_Missing_Number;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void missingNumber1() {

        int[] nums = new int[]{3, 0, 1};
        int answer = solution.missingNumber(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void missingNumber2() {
        int[] nums = new int[]{0, 1};
        int answer = solution.missingNumber(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void missingNumber3() {
        int[] nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        int answer = solution.missingNumber(nums);
        Assertions.assertThat(answer).isEqualTo(8);
    }
}
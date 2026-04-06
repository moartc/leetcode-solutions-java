package solutions.algorithms._0_999._414_Third_Maximum_Number;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void thirdMax1() {
        int[] nums = new int[]{3, 2, 1};
        int answer = solution.thirdMax(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void thirdMax2() {
        int[] nums = new int[]{1, 2};
        int answer = solution.thirdMax(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void thirdMax3() {
        int[] nums = new int[]{2, 2, 3, 1};
        int answer = solution.thirdMax(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}
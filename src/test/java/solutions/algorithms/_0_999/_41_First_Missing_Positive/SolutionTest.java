package solutions.algorithms._0_999._41_First_Missing_Positive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void firstMissingPositive1() {
        int[] nums = new int[]{1, 2, 0};
        int answer = solution.firstMissingPositive(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void firstMissingPositive2() {
        int[] nums = new int[]{3, 4, -1, 1};
        int answer = solution.firstMissingPositive(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void firstMissingPositive3() {
        int[] nums = new int[]{7, 8, 9, 11, 12};
        int answer = solution.firstMissingPositive(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void firstMissingPositive4() {
        int[] nums = new int[]{4, 1, 2, 3};
        int answer = solution.firstMissingPositive(nums);
        Assertions.assertThat(answer).isEqualTo(5);
    }
}
package solutions.algorithms._3000_3999._3300_Minimum_Element_After_Replacement_With_Digit_Sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minElement1() {
        int[] nums = new int[]{10, 12, 13, 14};
        int answer = solution.minElement(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minElement2() {
        int[] nums = new int[]{1, 2, 3, 4};
        int answer = solution.minElement(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minElement3() {
        int[] nums = new int[]{999, 19, 199};
        int answer = solution.minElement(nums);
        Assertions.assertThat(answer).isEqualTo(10);
    }
}
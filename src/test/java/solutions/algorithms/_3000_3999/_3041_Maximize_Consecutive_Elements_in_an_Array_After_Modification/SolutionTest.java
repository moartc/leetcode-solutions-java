package solutions.algorithms._3000_3999._3041_Maximize_Consecutive_Elements_in_an_Array_After_Modification;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxSelectedElements1() {
        int[] nums = new int[]{2, 1, 5, 1, 1};
        int answer = solution.maxSelectedElements(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void maxSelectedElements2() {
        int[] nums = new int[]{1, 4, 7, 10};
        int answer = solution.maxSelectedElements(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void maxSelectedElements3() {
        int[] nums = new int[]{8, 10, 6, 12, 9, 12, 2, 3, 13, 19, 11, 18, 10, 16};
        int answer = solution.maxSelectedElements(nums);
        Assertions.assertThat(answer).isEqualTo(8);
    }
}
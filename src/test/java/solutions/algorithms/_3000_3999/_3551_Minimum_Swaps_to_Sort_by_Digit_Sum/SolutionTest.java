package solutions.algorithms._3000_3999._3551_Minimum_Swaps_to_Sort_by_Digit_Sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minSwaps1() {
        int[] nums = new int[]{37, 100};
        int answer = solution.minSwaps(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minSwaps2() {
        int[] nums = new int[]{22, 14, 33, 7};
        int answer = solution.minSwaps(nums);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void minSwaps3() {
        int[] nums = new int[]{18, 43, 34, 16};
        int answer = solution.minSwaps(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minSwaps4() {
        int[] nums = new int[]{4, 3, 1, 2};
        int answer = solution.minSwaps(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}
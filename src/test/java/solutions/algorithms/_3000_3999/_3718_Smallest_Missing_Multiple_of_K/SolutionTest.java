package solutions.algorithms._3000_3999._3718_Smallest_Missing_Multiple_of_K;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void missingMultiple1() {
        int[] nums = new int[]{8, 2, 3, 4, 6};
        int k = 2;
        int answer = solution.missingMultiple(nums, k);
        Assertions.assertThat(answer).isEqualTo(10);
    }

    @Test
    void missingMultiple2() {
        int[] nums = new int[]{1, 4, 7, 10, 15};
        int k = 5;
        int answer = solution.missingMultiple(nums, k);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void missingMultiple3() {
        int[] nums = new int[]{6, 4, 2};
        int k = 2;
        int answer = solution.missingMultiple(nums, k);
        Assertions.assertThat(answer).isEqualTo(8);
    }

    @Test
    void missingMultiple4() {
        int[] nums = new int[]{3};
        int k = 1;
        int answer = solution.missingMultiple(nums, k);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}
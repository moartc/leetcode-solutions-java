package solutions.algorithms._3000_3999._3644_Maximum_K_to_Sort_a_Permutation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sortPermutation1() {
        int[] nums = new int[]{0, 3, 2, 1};
        int answer = solution.sortPermutation(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void sortPermutation2() {
        int[] nums = new int[]{0, 1, 3, 2};
        int answer = solution.sortPermutation(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void sortPermutation3() {
        int[] nums = new int[]{3, 2, 1, 0};
        int answer = solution.sortPermutation(nums);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void sortPermutation4() {
        int[] nums = new int[]{1, 2, 3, 4};
        int answer = solution.sortPermutation(nums);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}
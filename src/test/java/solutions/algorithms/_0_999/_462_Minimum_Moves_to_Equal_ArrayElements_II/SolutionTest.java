package solutions.algorithms._0_999._462_Minimum_Moves_to_Equal_ArrayElements_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minMoves2_1() {
        int[] nums = new int[]{1, 2, 3};
        int answer = solution.minMoves2(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minMoves2_2() {
        int[] nums = new int[]{1, 10, 2, 9};
        int answer = solution.minMoves2(nums);
        Assertions.assertThat(answer).isEqualTo(16);
    }

    @Test
    void minMoves2_3() {
        int[] nums = new int[]{1, 0, 0, 8, 6};
        int answer = solution.minMoves2(nums);
        Assertions.assertThat(answer).isEqualTo(14);
    }

    @Test
    void minMoves2_4() {
        int[] nums = new int[]{1, 2, 100};
        int answer = solution.minMoves2(nums);
        Assertions.assertThat(answer).isEqualTo(99);
    }
}
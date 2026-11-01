package solutions.algorithms._0_999._453_Minimum_Moves_to_Equal_Array_Elements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minMoves1() {
        int[] nums = new int[]{1, 2, 3};
        int answer = solution.minMoves(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void minMoves2() {
        int[] nums = new int[]{1, 1, 1};
        int answer = solution.minMoves(nums);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}
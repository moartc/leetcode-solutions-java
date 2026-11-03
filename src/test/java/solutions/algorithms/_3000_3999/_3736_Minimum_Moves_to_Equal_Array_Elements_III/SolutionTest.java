package solutions.algorithms._3000_3999._3736_Minimum_Moves_to_Equal_Array_Elements_III;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minMoves1() {
        int[] nums = new int[]{2, 1, 3};
        int answer = solution.minMoves(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void minMoves2() {
        int[] nums = new int[]{4, 4, 5};
        int answer = solution.minMoves(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

}
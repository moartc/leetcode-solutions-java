package solutions.algorithms._2000_2999._2778_Sum_of_Squares_of_Special_Elements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sumOfSquares1() {
        int[] nums = new int[]{1, 2, 3, 4};
        int answer = solution.sumOfSquares(nums);
        Assertions.assertThat(answer).isEqualTo(21);
    }

    @Test
    void sumOfSquares2() {
        int[] nums = new int[]{2, 7, 1, 19, 18, 3};
        int answer = solution.sumOfSquares(nums);
        Assertions.assertThat(answer).isEqualTo(63);
    }
}
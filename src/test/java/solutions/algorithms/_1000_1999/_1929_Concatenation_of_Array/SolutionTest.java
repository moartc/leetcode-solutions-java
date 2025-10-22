package solutions.algorithms._1000_1999._1929_Concatenation_of_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getConcatenation1() {
        int[] nums = new int[]{1, 2, 1};
        int[] answer = solution.getConcatenation(nums);
        Assertions.assertThat(answer).containsExactly(1, 2, 1, 1, 2, 1);
    }

    @Test
    void getConcatenation2() {
        int[] nums = new int[]{1, 3, 2, 1};
        int[] answer = solution.getConcatenation(nums);
        Assertions.assertThat(answer).containsExactly(1, 3, 2, 1, 1, 3, 2, 1);
    }
}
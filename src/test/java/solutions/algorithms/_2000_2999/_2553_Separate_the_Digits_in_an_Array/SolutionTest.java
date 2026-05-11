package solutions.algorithms._2000_2999._2553_Separate_the_Digits_in_an_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void separateDigits1() {
        int[] nums = new int[]{13, 25, 83, 77};
        int[] answer = solution.separateDigits(nums);
        Assertions.assertThat(answer).containsExactly(1, 3, 2, 5, 8, 3, 7, 7);
    }

    @Test
    void separateDigits2() {
        int[] nums = new int[]{7, 1, 3, 9};
        int[] answer = solution.separateDigits(nums);
        Assertions.assertThat(answer).containsExactly(7, 1, 3, 9);
    }
}
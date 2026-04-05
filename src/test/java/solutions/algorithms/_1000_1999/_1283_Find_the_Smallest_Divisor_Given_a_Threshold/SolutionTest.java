package solutions.algorithms._1000_1999._1283_Find_the_Smallest_Divisor_Given_a_Threshold;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void smallestDivisor1() {
        int[] nums = new int[]{1, 2, 5, 9};
        int threshold = 6;
        int answer = solution.smallestDivisor(nums, threshold);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void smallestDivisor2() {
        int[] nums = new int[]{44, 22, 33, 11, 1};
        int threshold = 5;
        int answer = solution.smallestDivisor(nums, threshold);
        Assertions.assertThat(answer).isEqualTo(44);
    }
}
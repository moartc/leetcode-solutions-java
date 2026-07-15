package solutions.algorithms._3000_3999._3658_GCD_of_Odd_and_Even_Sums;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void gcdOfOddEvenSums1() {
        int n = 4;
        int answer = solution.gcdOfOddEvenSums(n);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void gcdOfOddEvenSums2() {
        int n = 5;
        int answer = solution.gcdOfOddEvenSums(n);
        Assertions.assertThat(answer).isEqualTo(5);
    }
}
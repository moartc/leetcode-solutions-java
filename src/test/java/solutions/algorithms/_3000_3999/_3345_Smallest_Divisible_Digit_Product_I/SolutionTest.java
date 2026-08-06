package solutions.algorithms._3000_3999._3345_Smallest_Divisible_Digit_Product_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void smallestNumber1() {
        int n = 10;
        int t = 2;
        int answer = solution.smallestNumber(n, t);
        Assertions.assertThat(answer).isEqualTo(10);
    }

    @Test
    void smallestNumber2() {
        int n = 15;
        int t = 3;
        int answer = solution.smallestNumber(n, t);
        Assertions.assertThat(answer).isEqualTo(16);
    }
}
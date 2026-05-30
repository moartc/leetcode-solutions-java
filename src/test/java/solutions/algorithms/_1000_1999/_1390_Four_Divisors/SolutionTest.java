package solutions.algorithms._1000_1999._1390_Four_Divisors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sumFourDivisors1() {
        int[] nums = new int[]{21, 4, 7};
        int answer = solution.sumFourDivisors(nums);
        Assertions.assertThat(answer).isEqualTo(32);
    }

    @Test
    void sumFourDivisors2() {
        int[] nums = new int[]{21, 21};
        int answer = solution.sumFourDivisors(nums);
        Assertions.assertThat(answer).isEqualTo(64);
    }

    @Test
    void sumFourDivisors3() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int answer = solution.sumFourDivisors(nums);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}
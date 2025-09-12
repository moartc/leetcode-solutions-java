package solutions.algorithms._0_999._371_Sum_of_Two_Integers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getSum1() {
        int answer = solution.getSum(1, 2);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void getSum2() {
        int answer = solution.getSum(2, 3);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void getSum3() {
        int answer = solution.getSum(9, 8);
        Assertions.assertThat(answer).isEqualTo(17);
    }

    @Test
    void getSum4() {
        int answer = solution.getSum(-13, -7);
        Assertions.assertThat(answer).isEqualTo(-20);
    }
}
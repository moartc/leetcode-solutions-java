package solutions.algorithms._0_999._150_Evaluate_Reverse_Polish_Notation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void evalRPNTest1() {
        int actual = solution.evalRPN(new String[]{"2", "1", "+", "3", "*"});
        Assertions.assertThat(actual).isEqualTo(9);
    }

    @Test
    void evalRPNTest2() {
        int actual = solution.evalRPN(new String[]{"4", "13", "5", "/", "+"});
        Assertions.assertThat(actual).isEqualTo(6);
    }

    @Test
    void evalRPNTest3() {
        int actual = solution.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
        Assertions.assertThat(actual).isEqualTo(22);
    }
}
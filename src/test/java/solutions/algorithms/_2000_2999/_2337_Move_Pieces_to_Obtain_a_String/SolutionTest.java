package solutions.algorithms._2000_2999._2337_Move_Pieces_to_Obtain_a_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canChange1() {
        String start = "_L__R__R_";
        String target = "L______RR";
        boolean answer = solution.canChange(start, target);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void canChange2() {
        String start = "R_L_";
        String target = "__LR";
        boolean answer = solution.canChange(start, target);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void canChange3() {
        String start = "_R";
        String target = "R_";
        boolean answer = solution.canChange(start, target);
        Assertions.assertThat(answer).isFalse();
    }
}
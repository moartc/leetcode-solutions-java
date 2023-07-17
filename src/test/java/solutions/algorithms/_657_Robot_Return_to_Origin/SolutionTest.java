package solutions.algorithms._657_Robot_Return_to_Origin;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void judgeCircleTest1() {
        String moves = "UD";
        boolean answer = solution.judgeCircle(moves);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void judgeCircleTest2() {
        String moves = "LL";
        boolean answer = solution.judgeCircle(moves);
        Assertions.assertThat(answer).isFalse();
    }
}
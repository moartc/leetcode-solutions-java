package solutions.algorithms._3000_3999._3360_Stone_Removal_Game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canAliceWin1() {
        int n = 12;
        boolean answer = solution.canAliceWin(n);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void canAliceWin2() {
        int n = 1;
        boolean answer = solution.canAliceWin(n);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void canAliceWin3() {
        int n = 19;
        boolean answer = solution.canAliceWin(n);
        Assertions.assertThat(answer).isFalse();
    }
}
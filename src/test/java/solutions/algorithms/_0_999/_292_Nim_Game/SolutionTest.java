package solutions.algorithms._0_999._292_Nim_Game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canWinNim1() {
        int n = 4;
        boolean answer = solution.canWinNim(n);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void canWinNim2() {
        int n = 1;
        boolean answer = solution.canWinNim(n);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void canWinNim3() {
        int n = 2;
        boolean answer = solution.canWinNim(n);
        Assertions.assertThat(answer).isTrue();
    }
}
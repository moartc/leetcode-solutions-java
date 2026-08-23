package solutions.algorithms._1000_1999._1927_Sum_Game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sumGame1() {
        String num = "5023";
        boolean answer = solution.sumGame(num);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void sumGame2() {
        String num = "25??";
        boolean answer = solution.sumGame(num);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void sumGame3() {
        String num = "?3295???";
        boolean answer = solution.sumGame(num);
        Assertions.assertThat(answer).isFalse();
    }
}
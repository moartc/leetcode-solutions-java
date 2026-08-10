package solutions.algorithms._1000_1999._1510_Stone_Game_IV;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void winnerSquareGame1() {
        int n = 1;
        boolean answer = solution.winnerSquareGame(n);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void winnerSquareGame2() {
        int n = 2;
        boolean answer = solution.winnerSquareGame(n);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void winnerSquareGame3() {
        int n = 4;
        boolean answer = solution.winnerSquareGame(n);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void winnerSquareGame4() {
        int n = 3;
        boolean answer = solution.winnerSquareGame(n);
        Assertions.assertThat(answer).isTrue();
    }
}
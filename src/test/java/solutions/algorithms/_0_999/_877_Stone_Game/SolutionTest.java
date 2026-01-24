package solutions.algorithms._0_999._877_Stone_Game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void stoneGame1() {
        int[] piles = new int[]{5, 3, 4, 5};
        boolean answer = solution.stoneGame(piles);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void stoneGame2() {
        int[] piles = new int[]{3, 7, 2, 3};
        boolean answer = solution.stoneGame(piles);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void stoneGame3() { // case where I got TLE
        int[] piles = new int[]{7, 7, 12, 16, 41, 48, 41, 48, 11, 9, 34, 2, 44, 30, 27, 12, 11, 39, 31, 8, 23, 11, 47, 25, 15, 23, 4, 17, 11, 50, 16, 50, 38, 34, 48, 27, 16, 24, 22, 48, 50, 10, 26, 27, 9, 43, 13, 42, 46, 24};
        boolean answer = solution.stoneGame(piles);
        Assertions.assertThat(answer).isTrue();
    }

}
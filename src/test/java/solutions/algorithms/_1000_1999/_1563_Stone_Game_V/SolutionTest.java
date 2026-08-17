package solutions.algorithms._1000_1999._1563_Stone_Game_V;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void stoneGame1() {
        int[] stoneValue = new int[]{6, 2, 3, 4, 5, 5};
        int answer = solution.stoneGameV(stoneValue);
        Assertions.assertThat(answer).isEqualTo(18);
    }

    @Test
    void stoneGame2() {
        int[] stoneValue = new int[]{7, 7, 7, 7, 7, 7, 7};
        int answer = solution.stoneGameV(stoneValue);
        Assertions.assertThat(answer).isEqualTo(28);
    }

    @Test
    void stoneGame3() {
        int[] stoneValue = new int[]{4};
        int answer = solution.stoneGameV(stoneValue);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}
package solutions.algorithms._1000_1999._1140_Stone_Game_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void stoneGameIITest1() {
        int[] piles = new int[]{2, 7, 9, 4, 4};
        int answer = solution.stoneGameII(piles);
        Assertions.assertThat(answer).isEqualTo(10);
    }

    @Test
    void stoneGameIITest2() {
        int[] piles = new int[]{1, 2, 3, 4, 5, 100};
        int answer = solution.stoneGameII(piles);
        Assertions.assertThat(answer).isEqualTo(104);
    }
}
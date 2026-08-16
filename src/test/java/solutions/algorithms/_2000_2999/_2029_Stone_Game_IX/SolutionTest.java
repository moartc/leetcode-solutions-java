package solutions.algorithms._2000_2999._2029_Stone_Game_IX;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void stoneGame1() {
        int[] stones = new int[]{2, 1};
        boolean answer = solution.stoneGameIX(stones);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void stoneGame2() {
        int[] stones = new int[]{2};
        boolean answer = solution.stoneGameIX(stones);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void stoneGame3() {
        int[] stones = new int[]{5, 1, 2, 4, 3};
        boolean answer = solution.stoneGameIX(stones);
        Assertions.assertThat(answer).isFalse();
    }
}
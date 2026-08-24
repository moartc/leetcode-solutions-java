package solutions.algorithms._1000_1999._1872_Stone_Game_VIII;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void stoneGameVIII1() {
        int[] stones = new int[]{-1, 2, -3, 4, -5};
        int answer = solution.stoneGameVIII(stones);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void stoneGameVIII2() {
        int[] stones = new int[]{7, -6, 5, 10, 5, -2, -6};
        int answer = solution.stoneGameVIII(stones);
        Assertions.assertThat(answer).isEqualTo(13);
    }

    @Test
    void stoneGameVIII3() {
        int[] stones = new int[]{-10, -12};
        int answer = solution.stoneGameVIII(stones);
        Assertions.assertThat(answer).isEqualTo(-22);
    }
}
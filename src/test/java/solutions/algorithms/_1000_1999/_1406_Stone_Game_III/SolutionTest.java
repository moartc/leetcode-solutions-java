package solutions.algorithms._1000_1999._1406_Stone_Game_III;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void stoneGameIIITest1() {
        int[] stoneValue = new int[]{1, 2, 3, 7};
        String answer = solution.stoneGameIII(stoneValue);
        Assertions.assertThat(answer).isEqualTo("Bob");
    }

    @Test
    void stoneGameIIITest2() {
        int[] stoneValue = new int[]{1, 2, 3, -9};
        String answer = solution.stoneGameIII(stoneValue);
        Assertions.assertThat(answer).isEqualTo("Alice");
    }

    @Test
    void stoneGameIIITest3() {
        int[] stoneValue = new int[]{1, 2, 3, 6};
        String answer = solution.stoneGameIII(stoneValue);
        Assertions.assertThat(answer).isEqualTo("Tie");
    }

    @Test
    void stoneGameIIITest4() {
        int[] stoneValue = new int[]{5,5,-1,12,0,0,100};
        String answer = solution.stoneGameIII(stoneValue);
        Assertions.assertThat(answer).isEqualTo("Alice");
    }
}
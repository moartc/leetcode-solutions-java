package solutions.algorithms._1000_1999._1049_Last_Stone_Weight_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void lastStoneWeightIItest1() {
        int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        int answer = solution.lastStoneWeightII(stones);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void lastStoneWeightIItest2() {
        int[] stones = new int[]{31, 26, 33, 21, 40};
        int answer = solution.lastStoneWeightII(stones);
        Assertions.assertThat(answer).isEqualTo(5);
    }
}
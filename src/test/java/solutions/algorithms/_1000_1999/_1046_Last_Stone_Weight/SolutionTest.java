package solutions.algorithms._1000_1999._1046_Last_Stone_Weight;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void test1() {

        int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        int answer = solution.lastStoneWeight(stones);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void test2() {

        int[] stones = new int[]{1};
        int answer = solution.lastStoneWeight(stones);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}
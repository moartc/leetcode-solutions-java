package solutions.algorithms._0_999._875_Koko_Eating_Bananas;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minEatingSpeedTest1() {
        int[] piles = new int[]{3, 6, 7, 11};
        int h = 8;
        int answer = solution.minEatingSpeed(piles, h);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void minEatingSpeedTest2() {
        int[] piles = new int[]{30, 11, 23, 4, 20};
        int h = 5;
        int answer = solution.minEatingSpeed(piles, h);
        Assertions.assertThat(answer).isEqualTo(30);
    }

    @Test
    void minEatingSpeedTest3() {
        int[] piles = new int[]{30, 11, 23, 4, 20};
        int h = 6;
        int answer = solution.minEatingSpeed(piles, h);
        Assertions.assertThat(answer).isEqualTo(23);
    }

    @Test
    void minEatingSpeedTest4() {
        int[] piles = new int[]{312884470};
        int h = 312884469;
        int answer = solution.minEatingSpeed(piles, h);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}
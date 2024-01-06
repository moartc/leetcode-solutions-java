package solutions.algorithms._0_999._547_Number_of_Provinces;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._547_Number_of_Provinces.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findCircleNumTest1() {
        int[][] isConnected = new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        Assertions.assertThat(solution.findCircleNum(isConnected)).isEqualTo(2);
    }

    @Test
    void findCircleNumTest2() {
        int[][] isConnected = new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        Assertions.assertThat(solution.findCircleNum(isConnected)).isEqualTo(3);
    }

    @Test
    void findCircleNumTest3() {
        int[][] isConnected = new int[][]{{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};
        Assertions.assertThat(solution.findCircleNum(isConnected)).isOne();
    }
}
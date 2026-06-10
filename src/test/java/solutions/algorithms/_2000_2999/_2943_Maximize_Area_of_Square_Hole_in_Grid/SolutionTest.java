package solutions.algorithms._2000_2999._2943_Maximize_Area_of_Square_Hole_in_Grid;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximizeSquareHoleArea1() {
        int n = 2;
        int m = 1;
        int[] hBars = new int[]{2, 3};
        int[] vBars = new int[]{2};
        int answer = solution.maximizeSquareHoleArea(n, m, hBars, vBars);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maximizeSquareHoleArea2() {
        int n = 1;
        int m = 1;
        int[] hBars = new int[]{2};
        int[] vBars = new int[]{2};
        int answer = solution.maximizeSquareHoleArea(n, m, hBars, vBars);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maximizeSquareHoleArea3() {
        int n = 2;
        int m = 3;
        int[] hBars = new int[]{2, 3};
        int[] vBars = new int[]{2, 4};
        int answer = solution.maximizeSquareHoleArea(n, m, hBars, vBars);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maximizeSquareHoleArea4() {
        int n = 11;
        int m = 43;
        int[] hBars = new int[]{11, 9, 8};
        int[] vBars = new int[]{3, 2, 8, 12, 30, 16, 21, 9, 17, 40, 27, 31, 19};
        int answer = solution.maximizeSquareHoleArea(n, m, hBars, vBars);
        Assertions.assertThat(answer).isEqualTo(9);
    }
}
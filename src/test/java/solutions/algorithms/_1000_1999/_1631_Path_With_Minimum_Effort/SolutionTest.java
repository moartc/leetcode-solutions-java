package solutions.algorithms._1000_1999._1631_Path_With_Minimum_Effort;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumEffortPath1() {
        int[][] heights = new int[][]{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};

        int answer = solution.minimumEffortPath(heights);

        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minimumEffortPath2() {
        int[][] heights = new int[][]{{1, 2, 3}, {3, 8, 4}, {5, 3, 5}};

        int answer = solution.minimumEffortPath(heights);

        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minimumEffortPath3() {
        int[][] heights = new int[][]{{1, 2, 1, 1, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 1, 1, 2, 1}};

        int answer = solution.minimumEffortPath(heights);

        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void minimumEffortPath4() {
        int[][] heights = new int[][]{{1,10,6,7,9,10,4,9}};

        int answer = solution.minimumEffortPath(heights);

        Assertions.assertThat(answer).isEqualTo(9);
    }
}
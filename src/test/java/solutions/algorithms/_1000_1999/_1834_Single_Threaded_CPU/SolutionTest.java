package solutions.algorithms._1000_1999._1834_Single_Threaded_CPU;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getOrder1() {

        int[][] tasks = new int[][]{{1, 2}, {2, 4}, {3, 2}, {4, 1}};
        int[] answer = solution.getOrder(tasks);
        Assertions.assertThat(answer).containsExactly(0, 2, 3, 1);
    }

    @Test
    void getOrder2() {

        int[][] tasks = new int[][]{{7, 10}, {7, 12}, {7, 5}, {7, 4}, {7, 2}};
        int[] answer = solution.getOrder(tasks);
        Assertions.assertThat(answer).containsExactly(4, 3, 2, 0, 1);
    }

    @Test
    void getOrder3() {

        int[][] tasks = new int[][]{{5, 2}, {7, 2}, {9, 4}, {6, 3}, {5, 10}, {1, 1}};
        int[] answer = solution.getOrder(tasks);
        Assertions.assertThat(answer).containsExactly(5, 0, 1, 3, 2, 4);
    }

}
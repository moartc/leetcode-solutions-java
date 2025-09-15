package solutions.algorithms._0_999._210_Course_Schedule_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findOrder1() {
        int numCourses = 2;
        int[][] prerequisites = new int[][]{{1, 0}};
        int[] answer = solution.findOrder(numCourses, prerequisites);
        Assertions.assertThat(answer).isEqualTo(new int[]{0, 1});
    }

    @Test
    void findOrder2() {
        int numCourses = 4;
        int[][] prerequisites = new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] answer = solution.findOrder(numCourses, prerequisites);
        Assertions.assertThat(answer).isEqualTo(new int[]{0, 1, 2, 3});
    }
}
package solutions.algorithms._0_999._207_Course_Schedule;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canFinish1() {
        int numCourses = 2;
        int[][] prerequisites = new int[][]{{1, 0}};
        boolean answer = solution.canFinish(numCourses, prerequisites);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void canFinish2() {
        int numCourses = 2;
        int[][] prerequisites = new int[][]{{1, 0}, {0, 1}};
        boolean answer = solution.canFinish(numCourses, prerequisites);
        Assertions.assertThat(answer).isFalse();
    }
}
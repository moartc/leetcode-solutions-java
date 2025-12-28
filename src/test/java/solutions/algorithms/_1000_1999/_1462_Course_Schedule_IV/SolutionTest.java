package solutions.algorithms._1000_1999._1462_Course_Schedule_IV;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void checkIfPrerequisite1() {

        int numCourses = 2;
        int[][] prerequisites = new int[][]{{1, 0}};
        int[][] queries = new int[][]{{0, 1}, {1, 0}};
        List<Boolean> answer = solution.checkIfPrerequisite(numCourses, prerequisites, queries);
        Assertions.assertThat(answer).contains(false, true);
    }

    @Test
    void checkIfPrerequisite2() {

        int numCourses = 2;
        int[][] prerequisites = new int[][]{{}};
        int[][] queries = new int[][]{{1, 0}, {0, 1}};
        List<Boolean> answer = solution.checkIfPrerequisite(numCourses, prerequisites, queries);
        Assertions.assertThat(answer).contains(false, false);
    }

    @Test
    void checkIfPrerequisite3() {

        int numCourses = 3;
        int[][] prerequisites = new int[][]{{1, 2}, {1, 0}, {2, 0}};
        int[][] queries = new int[][]{{1, 0}, {1, 2}};
        List<Boolean> answer = solution.checkIfPrerequisite(numCourses, prerequisites, queries);
        Assertions.assertThat(answer).contains(true, true);
    }

    @Test
    void checkIfPrerequisite4() {

        int numCourses = 5;
        int[][] prerequisites = new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}};
        int[][] queries = new int[][]{{0, 4}, {4, 0}, {1, 3}, {3, 0}};
        List<Boolean> answer = solution.checkIfPrerequisite(numCourses, prerequisites, queries);
        Assertions.assertThat(answer).contains(true, false, true, false);
    }
}
package solutions.algorithms._0_999._994_Rotting_Oranges;

import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._994_Rotting_Oranges.Solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void orangesRottingTest1() {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        assertEquals(4, solution.orangesRotting(grid));
    }

    @Test
    void orangesRottingTest2() {
        int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        assertEquals(-1, solution.orangesRotting(grid));
    }

    @Test
    void orangesRottingTest3() {
        int[][] grid = {{0, 2}};
        assertEquals(0, solution.orangesRotting(grid));
    }

    @Test
    void orangesRottingTest4() {
        int[][] grid = {{2, 1, 1}, {1, 1, 1}, {0, 1, 2}};
        assertEquals(2, solution.orangesRotting(grid));
    }
}
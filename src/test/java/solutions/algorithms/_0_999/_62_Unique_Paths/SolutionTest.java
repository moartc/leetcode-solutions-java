package solutions.algorithms._0_999._62_Unique_Paths;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._62_Unique_Paths.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void uniquePathsTest1() {
        int m = 3;
        int n = 7;
        int expected = 28;
        int actual = solution.uniquePaths(m, n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void uniquePathsTest2() {
        int m = 3;
        int n = 2;
        int expected = 3;
        int actual = solution.uniquePaths(m, n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void uniquePathsTest3() {
        int m = 1;
        int n = 1;
        int expected = 1;
        int actual = solution.uniquePaths(m, n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void uniquePathsTest4() {
        int m = 4;
        int n = 4;
        int expected = 20;
        int actual = solution.uniquePaths(m, n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void uniquePathsTest5() {
        int m = 3;
        int n = 3;
        int expected = 6;
        int actual = solution.uniquePaths(m, n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void uniquePathsTest6() {
        int m = 51;
        int n = 9;
        int expected = 1916797311;
        int actual = solution.uniquePaths(m, n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void uniquePathsTest7() {
        int m = 2;
        int n = 4;
        int expected = 4;
        int actual = solution.uniquePaths(m, n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void uniquePathsTest8() {
        int m = 3;
        int n = 4;
        int expected = 10;
        int actual = solution.uniquePaths(m, n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
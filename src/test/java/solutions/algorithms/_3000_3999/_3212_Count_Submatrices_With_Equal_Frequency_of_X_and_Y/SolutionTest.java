package solutions.algorithms._3000_3999._3212_Count_Submatrices_With_Equal_Frequency_of_X_and_Y;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void numberOfSubmatrices1() {
        char[][] grid = new char[][]{{'X', 'Y', '.'}, {'Y', '.', '.'}};
        int answer = solution.numberOfSubmatrices(grid);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void numberOfSubmatrices2() {
        char[][] grid = new char[][]{{'X', 'X'}, {'X', 'Y'}};
        int answer = solution.numberOfSubmatrices(grid);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void numberOfSubmatrices3() {
        char[][] grid = new char[][]{{'.', '.'}, {'.', '.'}};
        int answer = solution.numberOfSubmatrices(grid);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}
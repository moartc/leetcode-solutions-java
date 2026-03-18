package solutions.algorithms._3000_3999._3070_Count_Submatrices_with_Top_Left_Element_and_Sum_Less_Than_k;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countSubmatrices1() {
        int[][] grid = new int[][]{{7, 6, 3}, {6, 6, 1}};
        int k = 18;
        int answer = solution.countSubmatrices(grid, k);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void countSubmatrices2() {
        int[][] grid = new int[][]{{7, 2, 9}, {1, 5, 0}, {2, 6, 6}};
        int k = 20;
        int answer = solution.countSubmatrices(grid, k);
        Assertions.assertThat(answer).isEqualTo(6);
    }
}
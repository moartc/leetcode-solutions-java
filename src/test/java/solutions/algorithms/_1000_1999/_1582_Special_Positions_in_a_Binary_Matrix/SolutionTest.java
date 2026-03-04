package solutions.algorithms._1000_1999._1582_Special_Positions_in_a_Binary_Matrix;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numSpecial1() {
        int[][] mat = new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0}};
        int answer = solution.numSpecial(mat);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void numSpecial2() {
        int[][] mat = new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int answer = solution.numSpecial(mat);
        Assertions.assertThat(answer).isEqualTo(3);
    }


}
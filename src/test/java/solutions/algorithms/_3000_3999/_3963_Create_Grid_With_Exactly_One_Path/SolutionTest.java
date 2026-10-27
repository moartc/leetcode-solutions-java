package solutions.algorithms._3000_3999._3963_Create_Grid_With_Exactly_One_Path;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    /*
    All outputs different from those in the example (many solutions are possible0
     */

    private final Solution solution = new Solution();

    @Test
    void createGrid1() {
        int m = 2;
        int n = 3;
        String[] answer = solution.createGrid(m, n);
        Assertions.assertThat(answer).containsExactly(".##", "...");
    }

    @Test
    void createGrid2() {
        int m = 3;
        int n = 3;
        String[] answer = solution.createGrid(m, n);
        Assertions.assertThat(answer).containsExactly(".##", ".##", "...");
    }

    @Test
    void createGrid3() {
        int m = 1;
        int n = 4;
        String[] answer = solution.createGrid(m, n);
        Assertions.assertThat(answer).containsExactly("....");
    }
}